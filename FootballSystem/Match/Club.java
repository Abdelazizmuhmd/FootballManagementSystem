/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Match;

import Data.Guest;
import FootballManagerSystem.FootballManagerSystem;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Club implements Serializable
{     
 public String Name;
 public String Num_Cups;
public ArrayList<Player>players=new ArrayList<Player>(); 
    
  
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNum_Cups() {
        return Num_Cups;
    }

    public void setNum_Cups(String Num_Cups) {
        this.Num_Cups = Num_Cups;
    }

 
    
}
