package com.example.android.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox momCheckBox;
    private CheckBox dadCheckBox;
    private CheckBox grandPaBox;
    private Button showButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        momCheckBox = (CheckBox) findViewById(R.id.momID);
        dadCheckBox = (CheckBox) findViewById(R.id.dadID);
        grandPaBox = (CheckBox) findViewById(R.id.granfPaID);
        showButton = (Button) findViewById(R.id.showButtonID);
        resultTextView = (TextView) findViewById(R.id.resultID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momCheckBox.getText().toString() + " status is: "
                        + momCheckBox.isChecked() + "\n");
                stringBuilder.append(dadCheckBox.getText().toString() + " status is: "
                        + dadCheckBox.isChecked() + "\n");
                stringBuilder.append(grandPaBox.getText().toString() + " status is: "
                        + grandPaBox.isChecked() + "\n");
                resultTextView.setText(stringBuilder);
                resultTextView.setVisibility(View.VISIBLE);

            }
        });
    }
}
