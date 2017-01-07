package com.app.farhan.thenewboston;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToRegistration(View view){
        Intent intent = new Intent("com.app.farhan.thenewboston.Registration");
        startActivity(intent);
    }

    public void goToLogin(View view){
        Intent intent = new Intent("com.app.farhan.thenewboston.LoginActivity");
        startActivity(intent);
    }
}
