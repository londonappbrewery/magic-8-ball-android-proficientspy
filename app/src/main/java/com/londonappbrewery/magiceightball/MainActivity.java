package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button askmeButton = (Button) findViewById(R.id.askme_button);


        final int[] wheels = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };




        final ImageView ball_1 = (ImageView)findViewById(R.id.wheel_of_fortune);

        askmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomnumbergenerator = new Random();

                int number = randomnumbergenerator.nextInt(5);

                ball_1.setImageResource(wheels[number]);


            }
        });










    }
}
