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

import Data.Guest;
import Data.GuestGui;
import Data.leagueGUI;
import Match.AllData;
import Match.PlayerGui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Zizo
 */
public class login extends JFrame {
  JComboBox combo;
  JLabel lba;
  JTextField txta;
  JLabel lbb;
  JTextField txtb;
  JButton offButton;
public login(){

    
   setSize(600,600);
   setTitle("login ");
   lba =new JLabel("Id :");
   txta=new JTextField("id");
   lbb =new JLabel("Password :");
   txtb=new JTextField("password");
   offButton=new JButton("login");
   offButton.addActionListener(new handler());
   combo=new JComboBox();
   combo.addItem("league manager");
   combo.addItem("club manager");
   combo.addItem("guest");
   combo.addItem("state manager");
   combo.addItem("timetable manager");
   combo.addItem("result manager");
   combo.addItem("admin");

   Container cp=getContentPane();
   cp.setLayout(new FlowLayout());
   cp.add(lba);
   cp.add(txta);
   cp.add(lbb);
   cp.add(txtb);
   cp.add(offButton);
   cp.add(combo);
  // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
        
        
        
    }




private class handler implements ActionListener{   
public void actionPerformed(ActionEvent arg0) {
String c=(String)combo.getSelectedItem();
if(c.equals("guest")){  
  Guest guest=new Guest();
  int x=guest.login(Integer.parseInt(txta.getText()),txtb.getText());
  System.out.println("tes2t  : "+x);

   if(x!=-1){
      System.out.println("test");
      guest=FootballManagerSystem.guests.get(x);
      GuestGui gui1=new GuestGui();
      gui1.setVisible(true);
  }
}else if(c.equals("league manager")){
LeagueManager manager=new LeagueManager();
int x=manager.login(Integer.parseInt(txta.getText()),txtb.getText());
if(x!=-1){
    leagueGUI gui1=new leagueGUI();
    gui1.setVisible(true);
}
}else if(c.equals("club manager")){
ClubManager manager=new ClubManager();
manager.load();
int x=manager.login(Integer.parseInt(txta.getText()),txtb.getText());
System.out.println("sdasd  "+x);
if(x!=-1){
manager=FootballManagerSystem.clubMangers.get(x);
PlayerGui p=new PlayerGui(manager.getState(),manager.getClubno());   
p.setVisible(true);


}}else if(c.equals("state manager")){
statManager manager=new statManager();
int x=manager.login(Integer.parseInt(txta.getText()),txtb.getText());
if(x!=-1){
manager=FootballManagerSystem.statManagers.get(x);
}
        }
else if(c.equals("timetable manager")){
TimeTableManager manager=new TimeTableManager();
int x=manager.login(Integer.parseInt(txta.getText()),txtb.getText());
if(x!=-1){
manager=FootballManagerSystem.timetablemangers.get(x);
}
        }
else if(c.equals("result manager")){
ResultManager manager=new ResultManager();
int x=manager.login(Integer.parseInt(txta.getText()),txtb.getText());
if(x!=-1){
manager=FootballManagerSystem.resultmanagers.get(x);
}}else if(c.equals("admin")){
    if(Integer.parseInt(txta.getText())==-19&&txtb.getText().equals("superadmin")){
    AllData data=new AllData();
    data.setVisible(true);
    }

}else{
JOptionPane.showMessageDialog(null, "Your Enterd Wrong info","Error info", JOptionPane.INFORMATION_MESSAGE);
}


}
}

}
