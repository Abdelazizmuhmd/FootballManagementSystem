/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Managers;
import FootballManagerSystem.FootballManagerSystem;

import Data.*;
import Match.ClubGui;
import Match.Player;
import Match.PlayerGui;
import Match.players;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import tables.StatsticsData;
import tables.*;


/**
 *
 * @author Zizo
 */
public class signup extends JFrame {
    JLabel lba;
    JTextField txta;
    JLabel lbb;
    JTextField txtb;
    JLabel lbc;
    JTextField txtc;
    JButton submit;
    int id;  
    JComboBox combo;
    Guest newguest;
 
public signup(){
    
  setSize(600,600);
  setTitle("sign up");
  lba =new JLabel("name :");
  txta=new JTextField("name");
  lbb =new JLabel("password :");
  txtb=new JTextField("password");
  lbc =new JLabel("age :");
  txtc=new JTextField("age");
  submit=new JButton("submit");
  combo=new JComboBox();
  combo.addItem("league manager");
  combo.addItem("club manager");
  combo.addItem("guest");
  combo.addItem("state manager");
  combo.addItem("timetable manager");
  combo.addItem("result manager");
  id=idload();




  submit.addActionListener(new handler());
 


  
  Container cp=getContentPane();
  cp.setLayout(new FlowLayout());
  cp.add(lba);
  cp.add(txta);
  cp.add(lbb);
  cp.add(txtb);
  cp.add(lbc);
  cp.add(txtc);
  cp.add(submit);
  cp.add(combo);
  //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


  
    
    }

 private class handler implements ActionListener{

 public void actionPerformed(ActionEvent arg) {
     if(txta.getText().isEmpty()){
         try {
             throw new OurException("textfiled is empty");
         } catch (OurException ex) {
         }
     }

  String c=(String)combo.getSelectedItem();

  
if(c.equals("guest")){
   Guest guest1=new Guest();
         try {
             guest1.setUserName(txta.getText());
             guest1.setPassword(txtb.getText());
   guest1.setAge(Integer.parseInt(txtc.getText()));
         } catch (OurException ex) {
System.out.println(ex.getMessage());    
       }
 
   guest1.setId(id);
   idsave(id);
   JOptionPane.showMessageDialog(null, "Your id is:"+id,"your id", JOptionPane.INFORMATION_MESSAGE);

   FootballManagerSystem.guests.add(guest1);
   guest1.save();
   GuestGui gui1=new GuestGui();
   gui1.setVisible(true);
  
}else if(c.equals("league manager")){
    
   LeagueManager leaguemanager1=new LeagueManager();
         try {
             leaguemanager1.setUserName(txta.getText());
                leaguemanager1.setPassword(txtb.getText());
   leaguemanager1.setAge(Integer.parseInt(txtc.getText()));
         } catch (OurException ex) {
System.out.println(ex.getMessage());    
        
         }

   leaguemanager1.setId(id);
   idsave(id);
   JOptionPane.showMessageDialog(null, "Your id is:"+id,"your id", JOptionPane.INFORMATION_MESSAGE);
   FootballManagerSystem.LeagueMangers.add(leaguemanager1);
   leaguemanager1.save();
   leagueGUI gui1=new leagueGUI();
   gui1.setVisible(true);
   

}else if(c.equals("club manager")){
    ClubManager clubmanger1=new ClubManager();

    clubmanger1.setUserName(txta.getText());
    clubmanger1.setPassword(txtb.getText());
    clubmanger1.setAge(Integer.parseInt(txtc.getText()));
    clubmanger1.setId(id);
    idsave(id);
    int state=Integer.parseInt(JOptionPane.showInputDialog("league degree?"));
    String w=JOptionPane.showInputDialog("What is your club?");
    clubmanger1.setState(state);
    JOptionPane.showMessageDialog(null, "Your id is:"+id,"your id", JOptionPane.INFORMATION_MESSAGE);
    
   for(int i=0;i<FootballManagerSystem.leagues.get(state).clubs.size();i++){
       if(FootballManagerSystem.leagues.get(state).clubs.get(i).getName().equals(w)){
       clubmanger1.setClubname(i);
       FootballManagerSystem.clubMangers.add(clubmanger1);
       clubmanger1.save();
       PlayerGui p=new PlayerGui(state,i);   
       p.setVisible(true);
       break;
       }
   }
  
}else if(c.equals("state manager")){
    statManager statmanger=new statManager();

         try {
       statmanger.setUserName(txta.getText());
      statmanger.setPassword(txtb.getText());
    statmanger.setAge(Integer.parseInt(txtc.getText()));
         } catch (OurException ex) {
System.out.println(ex.getMessage());    
         }
  
    statmanger.setId(id);
    idsave(id);
    JOptionPane.showMessageDialog(null, "Your id is:"+id,"your id", JOptionPane.INFORMATION_MESSAGE);
    FootballManagerSystem.statManagers.add(statmanger);
    statmanger.save();
StatsticsData s=new StatsticsData();
}else if(c.equals("timetable manager")){
    TimeTableManager timetableManger=new TimeTableManager();
         try {
             timetableManger.setUserName(txta.getText());
                 timetableManger.setPassword(txtb.getText());
    timetableManger.setAge(Integer.parseInt(txtc.getText()));
         } catch (OurException ex) {
System.out.println(ex.getMessage());    
         }

    timetableManger.setId(id);
    idsave(id);
    JOptionPane.showMessageDialog(null, "Your id is:"+id,"your id", JOptionPane.INFORMATION_MESSAGE);
    FootballManagerSystem.timetablemangers.add(timetableManger);
    timetableManger.save();
   TimeTableDat t=new TimeTableDat();
   t.setVisible(true);
 
 
}else if(c.equals("result manager")){
    ResultManager resultmanger=new ResultManager();
         try {
             resultmanger.setUserName(txta.getText());
                resultmanger.setPassword(txtb.getText());
    resultmanger.setAge(Integer.parseInt(txtc.getText()));
         } catch (OurException ex) {

System.out.println(ex.getMessage());    
         }
 
    resultmanger.setId(id);
    idsave(id);
    JOptionPane.showMessageDialog(null, "Your id is:"+id,"your id", JOptionPane.INFORMATION_MESSAGE);
    FootballManagerSystem.resultmanagers.add(resultmanger);
    resultmanger.save();
   results r=new results();
  
}
         
         
        }
        
   
   
   
   
   }
   
    public static void idsave(Integer idinc)
    {
    try {
        idinc++;
            ObjectOutputStream bin =new ObjectOutputStream(new FileOutputStream("/Users/Desktop/id.dat"));
            bin.writeObject(idinc);
            bin.close();
        } catch (FileNotFoundException ex) {
        }catch(IOException e){
        
        }
    
    }
      
    public static Integer idload() 
    {
        Integer x=1;
           try {
            ObjectInputStream bin =new ObjectInputStream(new FileInputStream("/Users/Desktop/id.dat"));
        x=(Integer)bin.readObject();
            bin.close();
        } catch (FileNotFoundException ex) {
            return x;
        }catch(IOException e){
        
        } catch (ClassNotFoundException ex) {
            return x;
        }
               return x;

    }
}
