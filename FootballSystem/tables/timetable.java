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
public class timetable  implements Serializable{
    public String clubname1;
    public String clubname2;
    public String day;
    public String month;
    public String year;
    public String time;

    public String getClubname1() {
        return clubname1;
    }

    public String getClubname2() {
        return clubname2;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

   
    public String getTime() {
        return time;
    }
    
    
}
