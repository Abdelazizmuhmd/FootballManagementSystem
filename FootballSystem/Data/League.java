/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import FootballManagerSystem.FootballManagerSystem;
import Match.Club;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ahmad
 */
public class League implements Serializable
{
   public String state;
   public  ArrayList<Club> clubs=new ArrayList<Club>();
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
 public void save() {
    try {
     System.out.println("saved");

    ObjectOutputStream bin =new ObjectOutputStream(new FileOutputStream("/Users/Desktop/leaguedata.dat"));
    bin.writeObject(FootballManagerSystem.leagues);
    bin.close();
    
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
        
    }


    }

    
    public void load()  {
        
    try {
                    System.out.println("loaded");

    ObjectInputStream bin =new ObjectInputStream(new FileInputStream("/Users/Desktop/leaguedata.dat"));
    FootballManagerSystem.leagues=(ArrayList<League>)bin.readObject();
    bin.close();
    } catch (FileNotFoundException ex) {
 System.out.println("File not found");
    }catch(IOException e){
         System.out.println("io");
    } catch (ClassNotFoundException ex) {
 System.out.println("class not");
    }
    }
  
    
}
