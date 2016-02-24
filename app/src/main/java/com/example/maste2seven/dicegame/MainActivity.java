package com.example.maste2seven.dicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListPopupWindow;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private ImageView image1;
    private Button button,button2, button3;
    private int val;
    private int sound;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView) findViewById(R.id.imageView);

        bindwiget();
        Forwarding();
        Backing();
        random();
        changdice();


    }//method

    private void changdice() {

        Log.d("dice", "ค่าที่ได้" + val);

        if (val == 1) {
            image1.setImageResource(R.drawable.dice1);
        } else if (val == 2) {
            image1.setImageResource(R.drawable.dice2);
        } else if (val == 3) {
            image1.setImageResource(R.drawable.dice3);
        } else if (val == 4) {
            image1.setImageResource(R.drawable.dice4);
        } else if (val == 5) {
            image1.setImageResource(R.drawable.dice5);
        } else if (val == 6) {
            image1.setImageResource(R.drawable.dice6);
        }

    }

    private void random() {

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random objRandom = new Random();
                val = objRandom.nextInt(6) + 1;
                sound = R.raw.__phonton1;//sound
                changdice();
                }


            }
        );

    }//randomroll

    private void Backing() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = val-1;
                if (val==0) {
                    val = 6;

                }
                changdice();
            }
        });


    }//class backing

    private void Forwarding() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val = val+1;
                if (val == 7) {
                    val = 1;
                }

                changdice();
            }
                    }

        );

}



    private void bindwiget() {

        image1 = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);


    }//bindwiget


}//main class
