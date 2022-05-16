package com.example.javameetui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements 	View.OnClickListener {

    // An int variable to hold a value
    private int AttackingArmiesCount = 1;
    private int DefenderArmiesCount = 1;
    // A bunch of Buttons and a TextView


    private TextView attackersWinningPercent;
    private TextView txtValue;
    private TextView txtDefendingArmySize;
    private Button btnAddAttacker;
    private TextView txtAttackingArmySize;
    private Button btnRemoveAttacker;
    private TextView txtAttackingArmyCount;
    private Button btnAddDefender;
    private TextView txtDefenderArmyCount;
    private Button btnRemoveDefender;
    private TextView txtStopAttackAt3Armies;
    private Button btnSubmit;
    private Button btnReset;
    double[][] newodds = {{41.9, 10.2, 2.94, 0.074, 0.22, 0.02, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {75.3, 36.6, 20.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {92.1, 65, 47.1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {99.3, 78.2, 64.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {99.7, 89.3, 77.1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {99.9, 93.2, 85.9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {99.9, 95.2, 90.5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {99.9, 96.3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 97.9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 98.8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 99.4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 99.5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 99.7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 99.9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 99.9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to all the buttons in our UI
        // Match them up to all our Button objects we declared earlier
        txtValue = (TextView) findViewById(R.id.attackersWinningPercent);
        txtValue = (TextView) findViewById(R.id.txtValue);
        //Attacking
        txtAttackingArmySize = (TextView) findViewById(R.id.attackingArmies);
        btnAddAttacker = (Button) findViewById(R.id.btnAddAttacker);
        txtAttackingArmyCount = (TextView) findViewById(R.id.attackingArmiesCount);
        btnRemoveAttacker= (Button) findViewById(R.id.btnRemoveAttacker);
        //Defending
        txtDefendingArmySize = (TextView) findViewById(R.id.defendingArmies);
        btnAddDefender = (Button) findViewById(R.id.btnAddDefender);
        txtDefenderArmyCount = (TextView) findViewById(R.id.defendingArmiesCount);
        btnRemoveDefender = (Button) findViewById(R.id.btnRemoveDefender);
        txtDefendingArmySize = (TextView) findViewById(R.id.defendingArmies);
        //Stop Attack at three Armies
        txtStopAttackAt3Armies = (TextView) findViewById(R.id.stopAttackAt3Armies);
        //Submit/Reset
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnReset = (Button) findViewById(R.id.btnReset);


        // Listen for all the button clicks
        btnAddAttacker.setOnClickListener(this);
        btnRemoveAttacker.setOnClickListener(this);
        btnAddDefender.setOnClickListener(this);
        btnRemoveDefender.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // A local variable to use later
        float size;

        switch(view.getId()){
            case R.id.btnAddAttacker:
                if (AttackingArmiesCount >= 25){
                    AttackingArmiesCount = 25;
                }
                else {
                    AttackingArmiesCount++;}
                txtAttackingArmyCount.setText(""+ AttackingArmiesCount);
                break;

            case R.id.btnRemoveAttacker:
                if (AttackingArmiesCount == 1){
                    AttackingArmiesCount = 1;
                }
                else {
                AttackingArmiesCount--;}
                txtAttackingArmyCount.setText(""+ AttackingArmiesCount);
                break;

            case R.id.btnAddDefender:
                if (DefenderArmiesCount >= 25){
                    DefenderArmiesCount = 25;
                }
                else {
                    DefenderArmiesCount++;}
                txtDefenderArmyCount.setText(""+ DefenderArmiesCount);
                break;

            case R.id.btnRemoveDefender:
                if (DefenderArmiesCount == 1){
                    DefenderArmiesCount = 1;
                }
                else {
                    DefenderArmiesCount--;}
                txtDefenderArmyCount.setText(""+ DefenderArmiesCount);
                break;

            case R.id.btnSubmit:
                double oddsOfWinning = newodds[AttackingArmiesCount][DefenderArmiesCount];
                txtValue.setText(Double.toString(oddsOfWinning));
                break;

            case R.id.btnReset:
                AttackingArmiesCount = 1;
                DefenderArmiesCount = 1;
                txtAttackingArmyCount.setText(""+ AttackingArmiesCount);
                txtDefenderArmyCount.setText(""+ DefenderArmiesCount);
                break;
        }
    }
}