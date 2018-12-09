package com.example.recodedharran.scorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantityOne=0;
    int quantityTwo=0;
    int fouls=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plusOneForTeamOne(View view){
        quantityOne=quantityOne+1;
        displayPlusOne(quantityOne);
    }
    public void minusOneForTeamOne(View view) {
        quantityOne=quantityOne-1;
        displayMinusOne(quantityOne);
    }
    public void plusOneForTeamTwo(View view){
        quantityTwo=quantityTwo+1;
        displayPlusTwo(quantityTwo);
    }
    public void minusOneForTeamTwo(View view){
        quantityTwo=quantityTwo-1;
        displayMinusTwo(quantityTwo);
    }
    public void resetButtons(View view){
        quantityOne=0;
        quantityTwo=0;
        resetButtons();
        resetButtons1();
    }
    public void plusOneForFouls(View view){
        fouls=fouls+1;
        displayPlusOnefoul(fouls);
    }
    private void displayPlusOne(int number){
        TextView quantityTextView = findViewById(
                R.id.quantity_of_goals1);
        quantityTextView.setText(""+number);
    }
    private void displayMinusOne(int number1){
        TextView quantityTextView = findViewById(
                R.id.quantity_of_goals1);
        quantityTextView.setText(""+number1);
    }
    private void displayPlusTwo(int number3){
        TextView quantityTextView = findViewById(
                R.id.quantity_of_goals2);
        quantityTextView.setText(""+number3);}
    private void displayMinusTwo(int number3){
        TextView quantityTextView = findViewById(
                R.id.quantity_of_goals2);
        quantityTextView.setText(""+number3);
    }
    private void resetButtons(){
        TextView quantityTextView = findViewById(
                R.id.quantity_of_goals1);
        quantityTextView.setText("0");
    }
    private void resetButtons1(){
        TextView quantityTextView = findViewById(
                R.id.quantity_of_goals2);
        quantityTextView.setText("0");
    }
    private void displayPlusOnefoul(int number4){
        TextView quantityTextView = findViewById(
                R.id.numberOfFoul);
        quantityTextView.setText(""+number4);
    }
}
