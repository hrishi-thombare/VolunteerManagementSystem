package com.app.farhan.thenewboston;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button)findViewById(R.id.login_btn);
        login.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                try{
                    // CALL loginToApp method to make post method call
                    loginToApp();
                }
                catch(Exception ex)
                {

                }
            }
        });
    }

    public  void  loginToApp()  throws  UnsupportedEncodingException
    {
        String Login, Pass;

        // Get user defined values
        Login   = ((EditText)findViewById(R.id.login_username_et)).getText().toString();
        Pass   = ((EditText)findViewById(R.id.login_password_et)).getText().toString();

        // Create data variable for sent values to server
        String data =  URLEncoder.encode("username", "UTF-8")
                + "=" + URLEncoder.encode(Login, "UTF-8");

        data += "&" + URLEncoder.encode("password", "UTF-8")
                + "=" + URLEncoder.encode(Pass, "UTF-8");

        BufferedReader reader = null;

        // Send data
        try
        {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;

            String login_url = context.getResources().getString(R.string.server_domain2) + "/login.php";
            // Defined URL  where to send data
            URL url = new URL(login_url);
            String text = url.toString();
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            // Send POST data request

            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);

            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write( data );
            wr.flush();
            // Get the server response

            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            StringBuilder sb = new StringBuilder();
            String line = null;

            // Read Server Response
            while((line = reader.readLine()) != null)
            {
                // Append server response in string
                sb.append(line + "\n");
            }
        }
        catch(Exception ex)
        {

        }
        finally
        {
            try
            {
                reader.close();
            }
            catch(Exception ex) {}
        }
    }

}
