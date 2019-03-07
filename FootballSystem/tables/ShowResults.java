/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;
import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.*;
import FootballManagerSystem.FootballManagerSystem;
/**
 *
 * @author Khaled
 */
public class ShowResults extends JFrame {
     public ShowResults(){
     setTitle("Show Rsults");
     setSize(900,900);
     this.setLayout(null); 
     int y=30;
     int x=30;
     load();
       for(int i=0;i<FootballManagerSystem.R.size();i++){
            JLabel label1=new JLabel();
            label1.setText(" "+FootballManagerSystem.R.get(i).getClubname1()+" "+FootballManagerSystem.R.get(i).getResults()
                +" "+
                    FootballManagerSystem.R.get(i).getClubname2());
            label1.setBounds(x, y, 400, 400);
            y=y+50;
            add(label1);
       }
       setVisible(true);
       
    }
      public void load()  {
     
    try {
    ObjectInputStream bin =new ObjectInputStream(new FileInputStream("/Users/Desktop/datta.dat/r.dat"));
    FootballManagerSystem.R=(ArrayList<results>)bin.readObject();
    bin.close();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
    } catch (ClassNotFoundException ex) {
    }    
    }
  
}
