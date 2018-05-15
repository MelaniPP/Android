package com.example.meterstoinches.meterstoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*

1m = 39.3701 Inch
 */
public class MainActivity extends AppCompatActivity {
    private EditText userInput;
    private Button convertButton;
    private TextView resultId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = (EditText) findViewById(R.id.userInput);
        resultId = (TextView) findViewById(R.id.resultID);
        convertButton = (Button) findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multipler = 39.37;
                double result = 0.0;
                if (userInput.getText().toString().equals("")) {
                        resultId.setText(R.string.error_message);
                        resultId.setTextColor(Color.RED);
                } else {

                double meterValue = Double.parseDouble(userInput.getText().toString());
                result = meterValue * multipler;
                resultId.setText(String.format("%.2f", result) + " inches");
                resultId.setTextColor(Color.BLUE);
                }
            }
        });

        // userInput.getText().toString();

    }
}
