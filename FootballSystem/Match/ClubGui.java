/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Match;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import FootballManagerSystem.FootballManagerSystem;

public class ClubGui extends JFrame
{
  JTextField name;
  JTextField cups;
  JButton addplayer;
  JButton submit;
  JLabel namel;
  int state;
  JLabel cupsl;
   public ClubGui(int s){
       state=s;
     setTitle("Club");
      setSize(600,600);
     this.setLayout(new FlowLayout()); 
     namel =new JLabel("Club Name");
     name=new JTextField("name here");
     cupsl=new JLabel("Number Of Cups");
     cups=new JTextField("Number of Cups");
     submit=new JButton("submit");
     addplayer=new JButton("add Player");
     submit.addActionListener(new submita());
     addplayer.addActionListener(new adda());
      
     this.add(namel);
     this.add(name);
     this.add(cupsl);
     this.add(cups);
     this.add(addplayer);
     this.add(submit);

     this.setVisible(true);
 
    } 
   private class submita implements ActionListener{
        public void actionPerformed(ActionEvent e) { 
         
         FootballManagerSystem.leagues.get(state-1).save();
     JOptionPane.showMessageDialog(null, "saved successfily","save", JOptionPane.INFORMATION_MESSAGE);

        }
       
   }
     private class adda implements ActionListener{
           public void actionPerformed(ActionEvent ae) { 
           Club club1=new Club();
           club1.setName(name.getText());
           club1.setNum_Cups(cups.getText());     
           FootballManagerSystem.leagues.get(state-1).clubs.add(club1);
           PlayerGui player1=new PlayerGui(state-1,-1);
           player1.setVisible(true);
        }
       
   }
   
}
