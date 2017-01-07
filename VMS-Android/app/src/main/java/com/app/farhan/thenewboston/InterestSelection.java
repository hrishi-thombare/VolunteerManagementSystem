package com.app.farhan.thenewboston;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.app.farhan.thenewboston.R.id.photography_opt_tv;
import static com.app.farhan.thenewboston.R.id.teaching_opt_tv;

public class InterestSelection extends AppCompatActivity implements View.OnClickListener{

    TextView teaching_opt_tv,cycling_opt_tv, trekking_opt_tv, marathon__opt_tv, magazine__opt_tv, reading_opt_tv, content_writing_opt_tv;
    TextView photography__opt_tv, technology_opt_tv, leadership_opt_tv, science_opt_tv, mathematics_opt_tv, history_opt_tv, exercise_opt_tv;
    TextView enviroment_opt_tv, health_opt_tv, games_opt_tv, fieldwork_opt_tv, publicspeaking_opt_tv, emergency_opt_tv, music_opt_tv;
    TextView drought_opt_tv, research_opt_tv, ruraldeveloptment_opt_tv, spiritual_opt_tv, organization_opt_tv, question_tv, pick_some_topics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_selection_layout);


        this.teaching_opt_tv = (TextView)findViewById(R.id.teaching_opt_tv);
        this.teaching_opt_tv.setOnClickListener(this);

        this.cycling_opt_tv = (TextView)findViewById(R.id.cycling_opt_tv);
        this.cycling_opt_tv.setOnClickListener(this);

        this.trekking_opt_tv = (TextView)findViewById(R.id.trekking_opt_tv);
        this.trekking_opt_tv.setOnClickListener(this);

        this.marathon__opt_tv = (TextView)findViewById(R.id.marathon_opt_tv);
        this.marathon__opt_tv.setOnClickListener(this);

        this.magazine__opt_tv = (TextView)findViewById(R.id.magazine_opt_tv);
        this.magazine__opt_tv.setOnClickListener(this);

        this.reading_opt_tv = (TextView)findViewById(R.id.reading_opt_tv);
        this.reading_opt_tv.setOnClickListener(this);

        this.content_writing_opt_tv = (TextView)findViewById(R.id.content_opt_tv);
        this.content_writing_opt_tv.setOnClickListener(this);

        this.photography__opt_tv = (TextView)findViewById(R.id.photography_opt_tv);
        this.photography__opt_tv.setOnClickListener(this);

        this.technology_opt_tv = (TextView)findViewById(R.id.technology_opt_tv);
        this.technology_opt_tv.setOnClickListener(this);

        this.leadership_opt_tv = (TextView)findViewById(R.id.leadership_opt_tv);
        this.leadership_opt_tv.setOnClickListener(this);

        this.science_opt_tv = (TextView)findViewById(R.id.science_opt_tv);
        this.science_opt_tv.setOnClickListener(this);

        this.mathematics_opt_tv = (TextView)findViewById(R.id.mathematics_opt_tv);
        this.mathematics_opt_tv.setOnClickListener(this);

        this.history_opt_tv = (TextView)findViewById(R.id.history_opt_tv);
        this.history_opt_tv.setOnClickListener(this);

        this.history_opt_tv = (TextView)findViewById(R.id.history_opt_tv);
        this.history_opt_tv.setOnClickListener(this);

        this.exercise_opt_tv = (TextView)findViewById(R.id.exercise_opt_tv);
        this.exercise_opt_tv.setOnClickListener(this);

        this.enviroment_opt_tv = (TextView)findViewById(R.id.environment_opt_tv);
        this.enviroment_opt_tv.setOnClickListener(this);

        this.health_opt_tv = (TextView)findViewById(R.id.health_opt_tv);
        this.health_opt_tv.setOnClickListener(this);

        this.games_opt_tv = (TextView)findViewById(R.id.game_opt_tv);
        this.games_opt_tv.setOnClickListener(this);

        this.fieldwork_opt_tv = (TextView)findViewById(R.id.field_opt_tv);
        this.fieldwork_opt_tv.setOnClickListener(this);

        this.publicspeaking_opt_tv = (TextView)findViewById(R.id.public_opt_tv);
        this.publicspeaking_opt_tv.setOnClickListener(this);

        this.emergency_opt_tv = (TextView)findViewById(R.id.emergency_help_opt_tv);
        this.emergency_opt_tv.setOnClickListener(this);

        this.music_opt_tv= (TextView)findViewById(R.id.music_opt_tv);
        this.music_opt_tv.setOnClickListener(this);

        this.drought_opt_tv = (TextView)findViewById(R.id.drought_opt_tv);
        this.drought_opt_tv.setOnClickListener(this);

        this.research_opt_tv = (TextView)findViewById(R.id.research_opt_tv);
        this.research_opt_tv.setOnClickListener(this);

        this.ruraldeveloptment_opt_tv = (TextView)findViewById(R.id.rural_dev_opt_tv);
        ruraldeveloptment_opt_tv.setOnClickListener(this);

        this.spiritual_opt_tv = (TextView)findViewById(R.id.spiritual_opt_tv);
        this.spiritual_opt_tv.setOnClickListener(this);

        this.organization_opt_tv = (TextView)findViewById(R.id.organization_opt_tv);
        this.organization_opt_tv.setOnClickListener(this);

        this.question_tv = (TextView)findViewById(R.id.interest_question);
        this.question_tv.setOnClickListener(this);

        this.pick_some_topics = (TextView)findViewById(R.id.option_tv);
        this.pick_some_topics.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        TextView temp = (TextView)findViewById(v.getId());



        //this.teaching_opt_tv.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.my_border));

        //temp.setBackgroundColor(temp.getSolidColor());


        /*if(((ColorDrawable)temp.getBackground()).getColor() != Color.GREEN){
            //temp.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.my_border));
            //this.teaching_opt_tv.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.my_border));
            temp.setBackgroundColor(Color.GREEN);
        }
        else{

            this.teaching_opt_tv.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.my_border));
        }*/

        //this.question_tv.setBackgroundColor(Color.GREEN);

        if(temp.getBackground().getConstantState().equals(ContextCompat.getDrawable(this, R.drawable.my_border).getConstantState())){
            temp.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.select_effect));
            Toast.makeText(this, "in if", Toast.LENGTH_LONG).show();
        }
        else{
            temp.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.my_border));
            Toast.makeText(this, "in else", Toast.LENGTH_LONG).show();
        }

    }
}
