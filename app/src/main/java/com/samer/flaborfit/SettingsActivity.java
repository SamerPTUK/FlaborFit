package com.samer.flaborfit;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SettingsActivity extends AppCompatActivity {

    public static String mode = "light";

    CheckBox nightMode;

    Button returnBtn;

    ConstraintLayout mainL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        nightMode = findViewById(R.id.nightMode);

        returnBtn = findViewById(R.id.returnBtn);

        mainL = findViewById(R.id.mainLayout);


        if(mode.equalsIgnoreCase("night")) {
            nightMode.setChecked(true);
            mainL.setBackgroundColor(getResources().getColor(R.color.dark_grey, getApplicationContext().getTheme()));
        }
        else {
            nightMode.setChecked(false);
            mainL.setBackgroundColor(getResources().getColor(R.color.white, getApplicationContext().getTheme()));
        }


        nightMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nightMode.isChecked()) {
                    mode = "night";
                    mainL.setBackgroundColor(getResources().getColor(R.color.dark_grey, getApplicationContext().getTheme()));
                }
                else {
                    mode = "light";
                    mainL.setBackgroundColor(getResources().getColor(R.color.white, getApplicationContext().getTheme()));
                }
            }
        });


        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
