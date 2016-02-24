package com.example.maste2seven.dicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private ImageView image1;
    private Button button,button2, button3;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView) findViewById(R.id.imageView);

        bindwiget();
        Forwarding();
        Backing();
        random();


    }//method

    private void random() {

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }//randomroll

    private void Backing() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }//class backing

    private void Forwarding() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }



    private void bindwiget() {

        image1 = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);


    }//bindwiget


}//main class
