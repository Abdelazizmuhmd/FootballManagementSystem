/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Match;

import javax.swing.*;
import FootballManagerSystem.FootballManagerSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Zizo
 */
public class clubs extends JFrame{
    
    JLabel club;
    JButton open;
    int y;
    String n;
    int leaguen;
    public clubs(int ln){
        leaguen=ln;
    setSize(600,600);
    y=30;
    for(int i=0;i<FootballManagerSystem.leagues.get(ln).clubs.size();i++){
    this.setLayout(null);
    System.out.println("this is ln:"+ln);
          
    n=FootballManagerSystem.leagues.get(ln).clubs.get(i).getName();
    club=new JLabel(n);
    open=new JButton("open");
    open.setActionCommand(""+i);
    club.setBounds(20,y,140,90);
    open.setBounds(170,y+34,140,30);
     open.addActionListener(new cluba());

    y+=30;
    this.add(club);
    this.add(open);
    }

    
    }

   
      private class cluba implements ActionListener{
        public void actionPerformed(ActionEvent ae) { 
            ae.getSource();
       int x=Integer.parseInt(ae.getActionCommand());

       players p=new players(leaguen,x);
       p.setVisible(true);
        }
       
   }
}
