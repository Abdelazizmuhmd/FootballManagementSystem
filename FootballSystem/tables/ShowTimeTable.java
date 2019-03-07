/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import FootballManagerSystem.FootballManagerSystem;
import javax.swing.*;
/**
 *
 * @author Khaled
 */
public class ShowTimeTable extends JFrame {
    public ShowTimeTable(){
     setTitle("Show Time Table");
     setSize(900,900);
     this.setLayout(null); 
     int y=30;
     int x=30;
     load();
       for(int i=0;i<FootballManagerSystem.TTD.size();i++){
            JLabel label1=new JLabel();
            label1.setText(" "+FootballManagerSystem.TTD.get(i).getClubname1()+" Vs  "+
                    FootballManagerSystem.TTD.get(i).getClubname2()+"day: "+FootballManagerSystem.TTD.get(i).getDay()+
                    " month:  "+FootballManagerSystem.TTD.get(i).getMonth()+"  year: "+FootballManagerSystem.TTD.get(i).getYear()+
                    " hour:   "+FootballManagerSystem.TTD.get(i).getTime());
            label1.setBounds(x, y, 400, 400);
            y=y+50;
            add(label1);
       }
       setVisible(true);
       
    }
      public void load()  {
     
    try {
    ObjectInputStream bin =new ObjectInputStream(new FileInputStream("/Users/Desktop/time.dat"));
    FootballManagerSystem.TTD=(ArrayList<timetable>)bin.readObject();
    bin.close();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
    } catch (ClassNotFoundException ex) {
    }    
    }
  
         
}
