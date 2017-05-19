package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 + * This activity keeps track of the basketball score for 2 teams.
 + */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Tracks the score for Team A
    int scoreHome = 0;

    // Tracks the score for Team B
    int scoreVisitor = 0;

    // Tracks Yellow cards for Home Team
    int homeYellow = 0;

    // Tracks Red Cards for Home Team
    int homeRed = 0;

    // Tracks Yellow cards for Visitor Team
    int visitorYellow = 0;

    // Tracks Red Cards for Visitor Team
    int visitorRed = 0;



    /**
     * Increase the red cards for home team by 1
     */
    public void addRedCardForHome(View v) {
        homeRed = homeRed + 1;
        redForHome(homeRed);
    }

    /**
     * Increase the yellow cards for home team by 1.
     */
    public void addYellowCardForHome(View v) {
        homeYellow = homeYellow + 1;
        yellowForHome(homeYellow);
    }

    /**
     * Increase the goal for Home Team by 1.
     */
    public void addOneForHome(View v) {
        scoreHome = scoreHome + 1;
        displayForTeamA(scoreHome);
    }

    /**
     * Increase the red card for visitor by 1.
     */
    public void addRedCardForVisitor(View v) {
        visitorRed = visitorRed + 1;
        redForVisitor(visitorRed);
    }

    /**
     * Increase the yellow card for visitor by 1.
     */
    public void addYellowCardForVisitor(View v) {
        visitorYellow = visitorYellow + 1;
        yellowForVisitor(visitorYellow);
    }

    /**
     * Increase the score for Visitor by 1 goal.
     */
    public void addOneForVisitor(View v) {
        scoreVisitor = scoreVisitor + 1;
        displayForTeamB(scoreVisitor);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreHome = 0;
        scoreVisitor = 0;
        visitorYellow = 0;
        visitorRed = 0;
        homeYellow = 0;
        homeRed = 0;
        displayForTeamA(scoreHome);
        displayForTeamB(scoreVisitor);
        yellowForHome(homeYellow);
        yellowForVisitor(visitorYellow);
        redForHome(homeRed);
        redForVisitor(visitorRed);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display yellow card for Home Team.
     */
    public void yellowForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_yello_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display red card for Home Team.
     */
    public void redForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display yellow card for Visitor Team.
     */
    public void yellowForVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_yello_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display red card for Visitor Team.
     */
    public void redForVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_red_card);
        scoreView.setText(String.valueOf(score));
    }

}