package com.example.android.seekbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result =(TextView)findViewById(R.id.resultId);
        seekBar =(SeekBar)findViewById(R.id.seekBar);
        result.setText("Pain LVL: "+seekBar.getProgress()+"/"+seekBar.getMax());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                result.setText("Pain LVL: "+seekBar.getProgress() + "/" +seekBar.getMax());
                result.setTextColor(Color.GRAY);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


                Log.d("SeekBar", "onStartTrackingTouch");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(seekBar.getProgress()>=7){
                result.setTextColor(Color.RED);
                }
                Log.d("SeekBar", "onStopTrackingTouch");
            }
        });

    }
}
