package com.example.javameetui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements 	View.OnClickListener {

    // An int variable to hold a value
    private int AttackingArmiesCount = 2;
    private int AttackingArmiesCountWithToggle;
    private Button btnSettings;
    private int DefenderArmiesCount = 1;
    // A bunch of Buttons and a TextView


    private TextView attackersWinningPercent;
    private TextView txtValue;
    private TextView txtDefendingArmySize;
    private Button btnAddAttacker;
    private Button btnRemoveAttacker;
    private TextView txtAttackingArmyCount;
    private Button btnAddDefender;
    private TextView txtDefenderArmyCount;
    private Button btnRemoveDefender;
    private TextView txtStopAttackAt3Armies;
    private ToggleButton simpleToggleButton;
    private Button btnSubmit;
    private Button btnReset;
    private ToggleButton toggleButton;


    double[][] newodds = {{41.7, 10.6, 2.7, 0.7, 0.2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {75.4, 36.3, 20.6, 9.1, 4.9, 2.1, 1.1, 0.5, 0.3, 0.1, 0.1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {91.6, 65.6, 47, 31.5, 20.6, 13.4, 8.4, 5.4, 3.3, 2.1, 1.3, 0.8, 0.5, 0.3, 0.2, 0.1, 0.1, 0, 0, 0}, {97.2, 78.5, 64.2, 47.7, 35.9, 25.3, 18.1, 12.3, 8.6, 5.7, 3.9, 2.6, 1.7, 1.1, 0.7, 0.5, 0.3, 0.2, 0.1, 0.1}, {99, 89, 76.9, 63.8, 50.6, 39.7, 29.7, 22.4, 16.2, 11.8, 8.3, 5.9, 4.1, 2.9, 1.9, 1.4, 0.9, 0.6, 0.4, 0.3}, {99.7, 93.4, 85.7, 74.5, 63.8, 52.1, 42.3, 32.9, 25.8, 19.3, 14.7, 10.7, 8, 5.7, 4.1, 2.9, 2.1, 1.4, 1, 0.7}, {99.9, 96.7, 91, 83.4, 73.6, 64, 53.6, 44.6, 35.7, 28.7, 22.2, 17.3, 13, 10, 7.3, 5.5, 4, 2.9, 2.1, 1.5}, {100, 98, 94.7, 88.8, 81.8, 73, 64.3, 54.7, 46.4, 38, 31.2, 24.7, 19.7, 15.2, 11.9, 9, 6.9, 5.1, 3.8, 2.8}, {100, 99, 96.7, 93, 87.3, 80.8, 72.6, 64.6, 55.8, 48, 40, 33.4, 27, 21.9, 17.3, 13.8, 10.6, 8.3, 6.2, 4.8}, {100, 99.4, 98.1, 95.4, 91.6, 86.1, 80, 72.4, 65, 56.8, 49.4, 41.7, 35.3, 29, 24, 19.2, 15.5, 12.2, 9.7, 7.4}, {100, 99.7, 98.8, 97.2, 94.3, 90.5, 85.2, 79.4, 72.3, 65.4, 57.6, 50.7, 43.3, 37.1, 30.9, 25.9, 21, 17.3, 13.7, 11.1}, {100, 99.8, 99.3, 98.2, 96.4, 93.4, 89.6, 84.5, 79, 72.3, 65.8, 58.4, 51.8, 44.8, 38.7, 32.6, 27.6, 22.8, 18.9, 15.2}, {100, 99.9, 99.6, 98.9, 97.6, 95.6, 92.5, 88.9, 83.9, 78.7, 72.3, 66.1, 59.2, 52.8, 46.1, 40.2, 34.2, 29.3, 24.4, 20.5}, {100, 100, 99.8, 99.3, 98.5, 97, 94.9, 91.8, 88.2, 83.5, 78.4, 72.4, 66.5, 59.9, 53.8, 47.3, 41.6, 35.7, 30.8, 25.9}, {100, 100, 99.9, 99.6, 99, 98.1, 96.4, 94.3, 91.2, 87.7, 83.1, 78.3, 72.5, 66.9, 60.5, 54.7, 48.4, 42.8, 37.1, 32.3}, {100, 100, 99.9, 99.8, 99.4, 98.7, 97.6, 95.9, 93.8, 90.7, 87.2, 82.8, 78.2, 72.6, 67.2, 61.1, 55.5, 49.4, 44, 38.4}, {100, 100, 100, 99.9, 99.6, 99.2, 98.4, 97.2, 95.5, 93.3, 90.2, 86.9, 82.6, 78.1, 72.8, 67.6, 61.7, 56.3, 50.4, 45.1}, {100, 100, 100, 99.9, 99.8, 99.5, 98.9, 98.1, 96.9, 95, 92.8, 89.8, 86.5, 82.4, 78.1, 72.9, 68, 62.3, 57, 51.3}, {100, 100, 100, 99.9, 99.9, 99.7, 99.3, 98.7, 97.8, 96.5, 94.6, 92.5, 89.5, 86.3, 82.2, 78.1, 73.1, 68.3, 62.8, 57.7}, {100, 100, 100, 100, 99.9, 99.8, 99.5, 99.1, 98.5, 97.5, 96.2, 94.3, 92.1, 89.2, 86, 82.1, 78.1, 73.3, 68.6, 63.3}};
    private BreakIterator ToggleTextview;
    private Intent SettingsActivity;
    private boolean ToggleButtonState;
    private boolean isChecked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to all the buttons in our UI
        // Match them up to all our Button objects we declared earlier
        txtValue = (TextView) findViewById(R.id.attackersWinningPercent);
        txtValue = (TextView) findViewById(R.id.txtValue);
        //Attacking
        TextView txtAttackingArmySize = (TextView) findViewById(R.id.attackingArmies);
        btnAddAttacker = (Button) findViewById(R.id.btnAddAttacker);
        txtAttackingArmyCount = (TextView) findViewById(R.id.attackingArmiesCount);
        btnRemoveAttacker = (Button) findViewById(R.id.btnRemoveAttacker);
        //Defending
        txtDefendingArmySize = (TextView) findViewById(R.id.defendingArmies);
        btnAddDefender = (Button) findViewById(R.id.btnAddDefender);
        txtDefenderArmyCount = (TextView) findViewById(R.id.defendingArmiesCount);
        btnRemoveDefender = (Button) findViewById(R.id.btnRemoveDefender);
        txtDefendingArmySize = (TextView) findViewById(R.id.defendingArmies);
        //Stop Attack at three Armies
        //Submit/Reset
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnSettings = (Button) findViewById(R.id.btnSettings);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);



//        /*Add in Oncreate() funtion after setContentView()*/
//        ToggleButton simpleToggleButton = (ToggleButton) findViewById(R.id.simpleToggleButton); // initiate a toggle button
//        Boolean ToggleButtonState = simpleToggleButton.isChecked();
//        // check current state of a toggle button (true or false).
//        System.out.println(ToggleButtonState );

        // Listen for all the button clicks
        btnAddAttacker.setOnClickListener(this);
        btnRemoveAttacker.setOnClickListener(this);
        btnAddDefender.setOnClickListener(this);
        btnRemoveDefender.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnSettings.setOnClickListener(this);




//        btnSettings.setOnClickListener(view -> {
//            Intent intent = new Intent(this,SettingsActivity.class);
//        });

    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAddAttacker:
                if (AttackingArmiesCount >= 20) {
                    AttackingArmiesCount = 20;
                } else {
                    AttackingArmiesCount++;
                }
                txtAttackingArmyCount.setText("" + AttackingArmiesCount);
                break;

            case R.id.btnRemoveAttacker:
                if (AttackingArmiesCount <= 2) {
                    AttackingArmiesCount = 2;
                } else {
                    AttackingArmiesCount--;
                }
                txtAttackingArmyCount.setText("" + AttackingArmiesCount);
                break;

            case R.id.btnAddDefender:
                if (DefenderArmiesCount >= 20) {
                    DefenderArmiesCount = 20;
                } else {
                    DefenderArmiesCount++;
                }
                txtDefenderArmyCount.setText("" + DefenderArmiesCount);
                break;

            case R.id.btnRemoveDefender:
                if (DefenderArmiesCount == 1) {
                    DefenderArmiesCount = 1;
                } else {
                    DefenderArmiesCount--;
                }
                txtDefenderArmyCount.setText("" + DefenderArmiesCount);
                break;

            case R.id.btnSubmit:
                if (isChecked == true) {
                    double oddsOfWinning = newodds[AttackingArmiesCount][DefenderArmiesCount - 1];
                    txtValue.setText(Double.toString(oddsOfWinning));
                } else {
                    double oddsOfWinning = newodds[AttackingArmiesCount][DefenderArmiesCount - 1];
                    txtValue.setText(Double.toString(oddsOfWinning));
                }
                break;

            case R.id.btnReset:
                txtValue.setText("0.0");
                AttackingArmiesCount = 2;
                DefenderArmiesCount = 1;
                txtAttackingArmyCount.setText("" + AttackingArmiesCount);
                txtDefenderArmyCount.setText("" + DefenderArmiesCount);
                break;

            case R.id.btnSettings:
                openNewActivity();
                break;

            case R.id.toggleButton:
                        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
          public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                 if (isChecked) {
                      AttackingArmiesCount = AttackingArmiesCount - 3;
                 } else {
                       AttackingArmiesCount = AttackingArmiesCount -1;
                }
                }
            });
            break;
        }
    }

    private void openNewActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }



}










