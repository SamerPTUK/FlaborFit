package com.samer.flaborfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;

public class DetailsActivity extends AppCompatActivity {

    LinearLayout mainBG;
    TextView title;
    ImageView image;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mainBG = findViewById(R.id.mainBg);
        title = findViewById(R.id.titleText);
        image = findViewById(R.id.mainImg);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);


        String exercise_title = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        title.setText(exercise_title);

        if(exercise_title.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            mainBG.setBackgroundColor(getResources().getColor(R.color.blue, getApplicationContext().getTheme()));
            image.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            checkBox1.setText("Complete type 1 set"); checkBox2.setText("Complete type 2 set"); checkBox3.setText("Complete type 3 set");
            checkBox4.setText("Complete type 4 set"); checkBox5.setText("Complete type 5 set");
        } else if(exercise_title.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            mainBG.setBackgroundColor(getResources().getColor(R.color.purple, getApplicationContext().getTheme()));
            image.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            checkBox1.setText("Complete type 1 Yoga"); checkBox2.setText("Complete type 2 Yoga"); checkBox3.setText("Complete type 3 Yoga");
            checkBox4.setText("Complete type 4 Yoga"); checkBox5.setText("Complete type 5 Yoga");
        } else if(exercise_title.equalsIgnoreCase(MainActivity.EXERCISE_CARDIO)) {
            mainBG.setBackgroundColor(getResources().getColor(R.color.green, getApplicationContext().getTheme()));
            image.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            checkBox1.setText("Walk 2 miles"); checkBox2.setText("Run 5 miles"); checkBox3.setText("Sprint 200 m");
            checkBox4.setText("Sprint 400 m"); checkBox5.setText("Bike 15 miles");
        }



    }
}


