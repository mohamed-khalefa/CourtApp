package com.example.android.courtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ScoreTeamA = 0;
    int ScoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 3 point.
     */

    public void GetThreePointsA(View v) {
        ScoreTeamA = ScoreTeamA + 3;

        displayForTeamA(ScoreTeamA);

    }


    /**
     * Increase the score for Team A by 2 point.
     */
    public void GetTwoPointsA(View v) {
        ScoreTeamA = ScoreTeamA + 2;

        displayForTeamA(ScoreTeamA);


    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void GetOnePointsA(View v) {
        ScoreTeamA = ScoreTeamA + 1;

        displayForTeamA(ScoreTeamA);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a_team);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for Team B by 3 point.
     */
    public void GetThreePointsB(View v) {
        ScoreTeamB = ScoreTeamB + 3;

        displayForTeamB(ScoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 point.
     */

    public void GetTwoPointsB(View v) {
        ScoreTeamB = ScoreTeamB + 2;

        displayForTeamB(ScoreTeamB);

    }


    /**
     * Increase the score for Team B by 2 point.
     */
    public void GetOnePointsB(View v) {
        ScoreTeamB = ScoreTeamB + 1;


        displayForTeamB(ScoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_team);
        scoreView.setText(String.valueOf(score));

    }


    /**
     * reset button
     */

    public void ResetButton(View v) {
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamB(ScoreTeamA);
        displayForTeamA(ScoreTeamB);

    }


}
