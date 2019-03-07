/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Match;

import FootballManagerSystem.FootballManagerSystem;
import javax.swing.*;

/**
 *
 * @author Zizo
 */
public class players extends JFrame {
    JLabel player;
    int y;
  public  players(int ln,int cn){
        y=30;
    setSize(600,600);
    setLayout(null);
    for(int i=0;i<FootballManagerSystem.leagues.get(ln).clubs.get(cn).players.size();i++){
    this.setLayout(null);
    player=new JLabel();
    player.setText("player name is: "+FootballManagerSystem.leagues.get(ln).clubs.get(cn).players.get(i).getName()+
            "   player age is: "+FootballManagerSystem.leagues.get(ln).clubs.get(cn).players.get(i).getAge()+
            "   Player postion is : "+FootballManagerSystem.leagues.get(ln).clubs.get(cn).players.get(i).getPosition());
    player.setBounds(30, y, 500, 60);
    
    this.add(player);
    y+=20;}
    }
}
