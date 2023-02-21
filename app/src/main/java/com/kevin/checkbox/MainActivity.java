package com.kevin.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cricket, football, hockey, kabaddi, chess, running, carrace;
    Button submit;
    TextView result

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = "";
                if (cricket.isChecked()) {
                    s += "Cricket \n";
                }
                if (football.isChecked()) {
                    s += "Football \n";
                }
                if (hockey.isChecked()) {
                    s += "Cricket \n";
                }
                if (kabaddi.isChecked()) {
                    s += "Cricket \n";
                }
                if (chess.isChecked()) {
                    s += "Cricket \n";
                }
                if (running.isChecked()) {
                    s += "Cricket \n";
                }
                if (carrace.isChecked()) {
                    s += "Cricket \n";
                }

            }
        });
    }
}