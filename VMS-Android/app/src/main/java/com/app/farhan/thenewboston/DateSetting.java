package com.app.farhan.thenewboston;

import android.app.DatePickerDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DateFormat;

/**
 * Created by admin on 13-12-2016.
 */

public class DateSetting implements DatePickerDialog.OnDateSetListener {
    Context context;

    DateSetting(Context context){
        this.context = context;
    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        //Toast.makeText(context, "Selected Date "+dayOfMonth+"/"+month+"/"+year, Toast.LENGTH_SHORT).show();
        ((TextView)(((Registration)context).findViewById(R.id.dob_tv))).setText(dayOfMonth+"/"+month+"/"+year);
    }


}
