package com.app.farhan.thenewboston;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void setData(View view){
        DateDialog dateDialog = new DateDialog();
        dateDialog.show(getSupportFragmentManager(), "Set date");
    }
    public void registration_complete(View view){
        //Toast.makeText(this, "Registration successfully completed!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, InterestSelection.class);
        startActivity(intent);
    }


}
