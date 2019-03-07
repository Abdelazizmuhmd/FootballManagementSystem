/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Data;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import FootballManagerSystem.FootballManagerSystem;
import Match.ClubGui;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ahmed Hassan
 */
public class leagueGUI extends JFrame {
     JLabel league;
     JButton add;
     JComboBox combo;

     public leagueGUI(){
     combo=new JComboBox();
     combo.addItem("state 1");
     combo.addItem("state 2");
     combo.addItem("state 3");
     league=new JLabel("choose state->>");
     this.setLayout(new FlowLayout());
     setTitle("league");
     setSize(600,600);
     add=new JButton("add clubs");
     add.addActionListener(new submita());
     this.add(add);
     this.add(league);
     this.add(combo);
     setSize(600,600);

    }
   private  class submita implements ActionListener{
   public void actionPerformed(ActionEvent event){
     String c=(String)combo.getSelectedItem();
     ClubGui clubg;
     if(c=="state 1"){
     clubg=new ClubGui(1);
     clubg.setVisible(true);

     }else if(c=="state 2"){
     clubg=new ClubGui(2);
     clubg.setVisible(true);

     }
     else if(c=="state 3"){
     clubg=new ClubGui(3);
     clubg.setVisible(true);
               }


}
}
   
    
}
