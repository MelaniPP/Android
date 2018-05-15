package com.example.meterstoinches.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View view;
    private Button tryMeButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors = new int[]{Color.CYAN, Color.GREEN, Color.YELLOW, Color.GRAY, Color.DKGRAY, Color.BLUE, Color.LTGRAY, Color.MAGENTA, Color.BLACK};

        view = findViewById(R.id.idView);


        tryMeButton = (Button) findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int colorArrayLength = colors.length;
                Random rnd = new Random();
                int randomNum = rnd.nextInt(colorArrayLength);
                view.setBackgroundColor(colors[randomNum]);
                Log.d("random",String.valueOf(randomNum));
            }
        });
    }
}
