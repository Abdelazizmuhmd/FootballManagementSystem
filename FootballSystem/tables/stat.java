/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.io.Serializable;

/**
 *
 * @author Khaled
 */
public class stat implements Serializable  {
     public String clubname1;
     public String clubname2;  
     public String Results;
     public String bestgoalkeeper;
     public String Possession;
     public String bestplayer;
     public String yellowcards;
     public String redcards;

    public String getClubname1() {
        return clubname1;
    }

    public String getClubname2() {
        return clubname2;
    }

    public String getResults() {
        return Results;
    }

    public String getBestgoalkeeper() {
        return bestgoalkeeper;
    }

    public String getPossession() {
        return Possession;
    }

    public String getBestplayer() {
        return bestplayer;
    }

    public String getYellowcards() {
        return yellowcards;
    }

    public String getRedcards() {
        return redcards;
    }

}
