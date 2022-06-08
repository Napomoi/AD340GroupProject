package com.example.javameetui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;


public class SettingsActivity extends AppCompatActivity {
    Button back;
    RadioButton blue, red, green, black;
    View view;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        back = (Button) findViewById(R.id.back);
        blue = (RadioButton) findViewById(R.id.rdbBlue);
        red = (RadioButton) findViewById(R.id.rdbRed);
        green = (RadioButton) findViewById(R.id.rdbGreen);
        black = (RadioButton) findViewById(R.id.rdbBlack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.back:
                        openNewActivity();
                        break;
                }
            });
        }
    }

    private void openNewActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void onRadioButtonClicked (View view){
            boolean checked = ((RadioButton) view).isChecked();
            String str = "";
            // Check which radio button was clicked
            switch (view.getId()) {
                case R.id.rdbBlue:
                    x = 1;
                    break;

                case R.id.rdbRed:
                    x = 2;
                    break;

                case R.id.rdbGreen:
                    x = 3;
                    break;

                case R.id.rdbBlack:
                    x = 4;
                    break;
            }

        }
}












