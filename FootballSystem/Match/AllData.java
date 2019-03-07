/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Match;

import Data.hashGui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//FootballManagerSystem.FootballManagerSystem;
/**
 *
 * @author Zizo
 */
public class AllData extends JFrame{
    
    JLabel league;
    JButton open;
    JButton hash;
    int y=20;
    
  public  AllData(){
    this.setLayout(null);
    this.setSize(600,600);
    for(int i=0;i<FootballManagerSystem.FootballManagerSystem.leagues.size();i++){
    open =new JButton();
    league=new JLabel();
    league.setText("league Degree "+FootballManagerSystem.FootballManagerSystem.leagues.get(i).state);
    league.setBounds(20,y,140,90);
    open.setBounds(170,y+34,140,30);
    open.setActionCommand(""+i);
    open.addActionListener(new leaguea());
    open.setText("open "+FootballManagerSystem.FootballManagerSystem.leagues.get(i).state);
    this.add(league);
    this.add(open);
    y+=20;
    }
    hash=new JButton("SEARCH BY ID");
    hash.addActionListener(new hasha());
    this.add(hash);
    hash.setBounds(80, 180, 140, 40);
    }
  private class leaguea implements ActionListener{
        public void actionPerformed(ActionEvent ae) { 
            ae.getSource();
           int y= Integer.parseInt(ae.getActionCommand());
          System.out.println("this  noyy"+y);
          clubs clubs=new clubs(y);
          clubs.setVisible(true);
        }
       
   }
    private class hasha implements ActionListener{
        public void actionPerformed(ActionEvent ae) { 
           hashGui search=new hashGui();
           search.setVisible(true);
        }
       
   }
   
    
}
