package com.example.android.hideandseekimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton =(ToggleButton)findViewById(R.id.toggleButton);
        imageView = (ImageView)findViewById(R.id.imageView2);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageView.setVisibility(ImageView.VISIBLE);
                }else{
                    imageView.setVisibility(ImageView.INVISIBLE);
                }

            }
        });
    }
}
