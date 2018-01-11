package com.samer.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout weightBtn, yogaBtn, cardioBtn;

    LinearLayout mainActivityLayout;

    ImageButton settings;

    public  static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public  static final String EXERCISE_WEIGHTS = "Weight lifting";
    public  static final String EXERCISE_YOGA = "Yoga";
    public  static final String EXERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityLayout = findViewById(R.id.mainActivityLayout);
        weightBtn = findViewById(R.id.weightBtn);
        yogaBtn = findViewById(R.id.yogaBtn);
        cardioBtn = findViewById(R.id.cardioBtn);

        settings = findViewById(R.id.settings);


        if(SettingsActivity.mode.equalsIgnoreCase("night")) {
            mainActivityLayout.setBackgroundColor(getResources().getColor(R.color.dark_grey, getApplicationContext().getTheme()));
        }
        else {
            mainActivityLayout.setBackgroundColor(getResources().getColor(R.color.white, getApplicationContext().getTheme()));
        }


        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);
            }
        });



        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

    }


    private  void loadDetailActivity(String title) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, title);
        startActivity(intent);
    }


}
