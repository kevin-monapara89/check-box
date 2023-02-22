package com.kevin.checkbox;

import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cricket, football, hockey, kabaddi, chess, running, carrace;
    Button submit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Binding();

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
                    s += "Hockey \n";
                }
                if (kabaddi.isChecked()) {
                    s += "Kabaddi \n";
                }
                if (chess.isChecked()) {
                    s += "Chess \n";
                }
                if (running.isChecked()) {
                    s += "Running \n";
                }
                if (carrace.isChecked()) {
                    s += "Car raceing \n";
                }
                result.setText("Sports : "+s);
            }
        });
    }

    private void Binding() {
        cricket = findViewById(R.id.cricket);
        football = findViewById(R.id.football);
        hockey = findViewById(R.id.hockey);
        kabaddi = findViewById(R.id.kabaddi);
        chess = findViewById(R.id.chess);
        running = findViewById(R.id.running);
        carrace = findViewById(R.id.carrace);
        submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);
    }
    
}