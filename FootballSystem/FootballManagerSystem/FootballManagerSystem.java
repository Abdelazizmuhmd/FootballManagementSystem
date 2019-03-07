//  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package FootballManagerSystem;
import Data.*;
import Managers.*;
import java.util.*;
import java.io.*;
import Managers.*;
import Match.*;
import java.awt.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.*;
import tables.results;
import tables.stat;
import tables.timetable;



public class FootballManagerSystem 
{public static ArrayList<timetable> TTD=new ArrayList<timetable>();
public static ArrayList<results> R=new ArrayList<results>();
public static ArrayList<stat> S=new ArrayList<stat>();
    public static ArrayList<Guest> guests=new ArrayList<Guest>();
    public static ArrayList<TimeTableManager> timetablemangers=new ArrayList<TimeTableManager>();
    public static ArrayList<statManager> statManagers=new ArrayList<statManager>();
    public static ArrayList<ResultManager> resultmanagers=new ArrayList<ResultManager>();
    public static ArrayList<ClubManager> clubMangers=new ArrayList<ClubManager>();
  //  public static ArrayList<coach> coachs=new ArrayList<coach>();
    public static ArrayList<LeagueManager> LeagueMangers=new ArrayList<LeagueManager>();
    public static ArrayList<FinanceManagement> FinanceManagers=new ArrayList<FinanceManagement>();
    public static HashMap<Integer,Guest>guestmap=new HashMap<Integer,Guest>();
    public static HashMap<Integer,ClubManager>ClubManagermap;
    //public static HashMap<Integer,coach>Coachmap =new  HashMap<Integer,coach>();
    public static HashMap<Integer,LeagueManager>LeagueManagermap;
    public static HashMap<Integer,FinanceManagement>FinanceManagementmap;
    public static ArrayList<Club> clubs =new ArrayList<Club>();
    public static ArrayList<League> leagues =new ArrayList<League>();

    
    public static void main(String[] args)  
            
    {
        
    
        
        footballsystem a=new footballsystem();
        a.setVisible(true);
        
        
        
      for (int i=0;i<3;i++){
      League  league1=new League();
      int add=i+1;
      league1.setState("state "+add);
      leagues.add(league1);
      
        }
        
        leagues.get(0).load();
            try{
       File clipFile = new File("/Users/Desktop/xx.wav"); 
       AudioInputStream audioStrmObj = AudioSystem.getAudioInputStream(clipFile);
       AudioFormat format = audioStrmObj.getFormat();
       DataLine.Info info = new DataLine.Info(Clip.class, format); 
       Clip audioClip = (Clip) AudioSystem.getLine(info);
       audioClip.open(audioStrmObj);
       audioClip.loop(Clip.LOOP_CONTINUOUSLY);
       }catch(Exception e){
    } 
Guest guest=new Guest();
guest.load();
        
        
    }
    
    
    
    
    
    
    
    
  
       
   
}
    

