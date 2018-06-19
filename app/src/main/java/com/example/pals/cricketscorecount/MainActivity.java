package com.example.pals.cricketscorecount;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public int counter = 1,outTeamA=0 ,outTeamB=0;
    int over = 0;
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int faultTeamA = 0;
    int faultTeamB = 0;
    private RunAdapter runAdapter;
    Button addOneInTeamABt, addTwoInTeamABt, addThreeInTeamABt, addFourInTeamABt, addSixInTeamABt, addOneInTeamBBt, addTwoInTeamBBt, addThreeInTeamBBt, addFourInTeamBBt, addSixInTeamBBt;
    Button wktTeamABt, wktTeamBBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addOneInTeamABt = (Button) findViewById(R.id.add_1_bt_a);
        addTwoInTeamABt = (Button) findViewById(R.id.add_2_bt_a);
        addThreeInTeamABt = (Button) findViewById(R.id.add_3_bt_a);
        addFourInTeamABt = (Button) findViewById(R.id.add_4_bt_a);
        addSixInTeamABt = (Button) findViewById(R.id.add_6_bt_a);
        addOneInTeamBBt = (Button) findViewById(R.id.add_1__bt_b);
        addTwoInTeamBBt = (Button) findViewById(R.id.add_2__bt_b);
        addThreeInTeamBBt = (Button) findViewById(R.id.add_3__bt_b);
        addFourInTeamBBt = (Button) findViewById(R.id.add_4__bt_b);
        addSixInTeamBBt = (Button) findViewById(R.id.add_6__bt_b);
        wktTeamABt = (Button) findViewById(R.id.wkt_a);
        wktTeamBBt = (Button) findViewById(R.id.wkt_b);
    }

    public void addOneToTeamA(View view1) {
        int run = 1;
        if(outTeamA <= 10) {
            scoreTeamA = scoreTeamA + run;
            displayScoreForTeamA(scoreTeamA);
            Log.d("Counter value in func", String.valueOf(counter));
            oversPerBallTeamA(String.valueOf(run));
        }else{
            showAlert();
        }
    }

    public void addTwoToTeamA(View view2) {
        int run = 2;
        if(outTeamA <= 10) {
            scoreTeamA = scoreTeamA + run;
            displayScoreForTeamA(scoreTeamA);
            oversPerBallTeamA(String.valueOf(run));
        }else{
            showAlert();
        }
    }

    public void addThreeToTeamA(View view3) {
        int run = 3;
        if(outTeamA <= 10){
        scoreTeamA = scoreTeamA + run;
        displayScoreForTeamA(scoreTeamA);
        oversPerBallTeamA(String.valueOf(run));
        }else{
        showAlert();
        }
    }

    public void addFourToTeamA(View view4) {
        int run = 4;
        if(outTeamA <= 10){
        scoreTeamA = scoreTeamA + run;
        displayScoreForTeamA(scoreTeamA);
        oversPerBallTeamA(String.valueOf(run));
        }else{
        showAlert();
    }
    }

    public void outTeamA(View view5) {
        if ( outTeamA <= 10 ) {
            outTeamA = outTeamA + 1;
            displayOutForTeamA(outTeamA);
            oversPerBallTeamA("W");
        } else {
            displayOutForTeamA(outTeamA - 1);
//            addOneInTeamABt.setEnabled(false);
//            addTwoInTeamABt.setEnabled(false);
//            addThreeInTeamABt.setEnabled(false);
//            addFourInTeamABt.setEnabled(false);
//            addSixInTeamABt.setEnabled(false);

            showAlert();
        }
    }

    public void addSixToTeamA(View view4) {
        int run = 6;
        scoreTeamA = scoreTeamA + 6;
        displayScoreForTeamA(scoreTeamA);
        oversPerBallTeamA(String.valueOf(run));
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreA = (TextView) findViewById(R.id.team_a_score);
        scoreA.setText(String.valueOf(score));
    }

    //
    public void displayOutForTeamA(int out) {
        TextView outA = (TextView) findViewById(R.id.team_a_wickets);
        outA.setText(String.valueOf(out));
    }
    // Team B Score
    public void addOneToTeamB(View view) {
        int run = 1;
        if(outTeamB<=10) {
            scoreTeamB = scoreTeamB + 1;
            displayScoreForTeamB(scoreTeamB);
            oversPerBallTeamB(String.valueOf(run));
        }else{
            showAlert();
        }
    }

    public void addTwoToTeamB(View view) {
        int run = 2;
        if(outTeamB <=10) {
            scoreTeamB = scoreTeamB + 2;
            displayScoreForTeamB(scoreTeamB);
            oversPerBallTeamB(String.valueOf(run));
        }else{
            showAlert();
        }
    }

    public void addThreeToTeamB(View view) {
        int run = 3;
        if(outTeamB <= 10) {
            scoreTeamB = scoreTeamB + 3;
            displayScoreForTeamB(scoreTeamB);
            oversPerBallTeamB(String.valueOf(run));
        }else{
            showAlert();
        }
    }

    public void addFourToTeamB(View view) {
        int run = 4;
        if(outTeamB <= 10) {
            scoreTeamB = scoreTeamB + 4;
            displayScoreForTeamB(scoreTeamB);
            oversPerBallTeamB(String.valueOf(run));
        }else{
            showAlert();
        }
    }

    public void addSixToTeamB(View view) {
        int run = 6;
        if(outTeamB <= 10 ) {
            scoreTeamB = scoreTeamB + 6;
            displayScoreForTeamB(scoreTeamB);
            oversPerBallTeamB(String.valueOf(run));
        }else{
            showAlert();
        }
    }

    public void outTeamB(View view) {
        if (outTeamB <= 10) {
            outTeamB = outTeamB + 1;
            displayOutForTeamB(outTeamB);
            oversPerBallTeamB("W");
        } else {
            displayScoreForTeamB(outTeamB - 1);
            showAlert();
        }
    }

    private void showAlert() {
        AlertDialog alert = new AlertDialog.Builder(this).create();
        alert.setTitle("ALert");
        alert.setMessage("Maximum wickets reached ");
        alert.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alert.show();
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreB = (TextView) findViewById(R.id.team_b_score);
        scoreB.setText(String.valueOf(score));
    }

    public void displayOutForTeamB(int out) {
        TextView outB = (TextView) findViewById(R.id.team_b_wickets);
        outB.setText(String.valueOf(out));
    }


    public void faultTeamA(View view) {
        scoreTeamA += 1;
        faultTeamA = faultTeamA + 1;
        displayFaultTeamA(faultTeamA);
        displayScoreForTeamA(scoreTeamA);
    }

    public void faultTeamB(View view) {
        scoreTeamB += 1;
        faultTeamB = faultTeamB + 1;
        displayFaultTeamB(faultTeamB);
    }

    public void displayFaultTeamA(int fault) {
        TextView txtFaultA = (TextView) findViewById(R.id.team_a_extra);
        txtFaultA.setText(String.valueOf(fault));
    }

    public void displayFaultTeamB(int fault) {
        TextView txtFaultB = (TextView) findViewById(R.id.team_b_extra);
        txtFaultB.setText(String.valueOf(fault));
    }

    ////
    public void resetAll(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        outTeamA = 0;
        outTeamB = 0;
        displayOutForTeamA(outTeamA);
        displayOutForTeamB(outTeamB);
        faultTeamA = 0;
        faultTeamB = 0;
        displayFaultTeamA(faultTeamA);
        displayFaultTeamB(faultTeamB);

//        addOneInTeamABt.setEnabled(true);
//        addTwoInTeamABt.setEnabled(true);
//        addThreeInTeamABt.setEnabled(true);
//        addFourInTeamABt.setEnabled(true);
//        addSixInTeamABt.setEnabled(true);
//        wktTeamABt.setEnabled(true);
//
//        addOneInTeamBBt.setEnabled(true);
//        addTwoInTeamBBt.setEnabled(true);
//        addThreeInTeamBBt.setEnabled(true);
//        addFourInTeamBBt.setEnabled(true);
//        addSixInTeamBBt.setEnabled(true);
//        wktTeamBBt.setEnabled(true);

        AlertDialog alert = new AlertDialog.Builder(this).create();
        alert.setTitle("ALert");
        alert.setMessage("New Match Started ");
        alert.setButton(Dialog.BUTTON_POSITIVE,"OK",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alert.show();
    }

    ArrayList<RunsByOver> runsByOverArrayListTeamA = new ArrayList<>();
    ArrayList<RunsByOver> runsByOverArrayListTeamB = new ArrayList<>();

    public void oversPerBallTeamA(String run) {

        GridView runListView = findViewById(R.id.run_list);

        TextView overTv = findViewById(R.id.over_tv_team_a);

        String overString = null;
        RunsByOver runsByOver = new RunsByOver(run);
        runsByOverArrayListTeamA.add(runsByOver);
        if (counter == 6) {
            Log.d("counter value before se", String.valueOf(counter));
            over = over + 1;
            counter = 0;
            Log.d("counter value", String.valueOf(counter));
            overTv.setText(String.valueOf(over));
            runAdapter.clear();

        } else {
            counter = counter + 1;
            overString = over + "." + counter;
            Log.d("Over", overString);
            overTv.setText(String.valueOf(overString));
            Log.d("counter value", String.valueOf(counter));
//                runsByOverArrayList.add(new RunsByOver(run));
//                for (RunsByOver runs : runsByOverArrayList){
            Log.i("Arraylist of runs ", String.valueOf(runsByOverArrayListTeamA.size()));
//                }
            runAdapter = new RunAdapter(this, runsByOverArrayListTeamA);
            runListView.setAdapter(runAdapter);
            runAdapter.notifyDataSetChanged();
        }
    }

    public void oversPerBallTeamB(String run) {

        GridView runListView = findViewById(R.id.run_list_aus);

        TextView overTv = findViewById(R.id.over_tv_team_b);

        String overString = null;
        RunsByOver runsByOver = new RunsByOver(run);
        runsByOverArrayListTeamB.add(runsByOver);
        if (counter == 6) {
            Log.d("counter value before se", String.valueOf(counter));
            over = over + 1;
            counter = 0;
            Log.d("counter value", String.valueOf(counter));
            overTv.setText(String.valueOf(over));
            runAdapter.clear();

        } else {
            counter = counter + 1;
            overString = over + "." + counter;
            Log.d("Over", overString);
            overTv.setText(String.valueOf(overString));
            Log.d("counter value", String.valueOf(counter));
//                runsByOverArrayList.add(new RunsByOver(run));
//                for (RunsByOver runs : runsByOverArrayList){
            Log.i("Arraylist of runs ", String.valueOf(runsByOverArrayListTeamB.size()));
//                }
            runAdapter = new RunAdapter(this, runsByOverArrayListTeamB);
            runListView.setAdapter(runAdapter);
            runAdapter.notifyDataSetChanged();
        }
    }

}