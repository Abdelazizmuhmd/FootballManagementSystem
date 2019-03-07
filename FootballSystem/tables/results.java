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
public class results implements Serializable {
    public String clubname1;
    public String clubname2;  
    public String Results;

    public String getResults() {
        return Results;
    }

    public String getClubname1() {
        return clubname1;
    }

    public String getClubname2() {
        return clubname2;
    }
    
}
