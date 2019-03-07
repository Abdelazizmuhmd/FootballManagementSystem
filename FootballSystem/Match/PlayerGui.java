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

/**
 *
 * @author Khaled
 */
public class PlayerGui extends JFrame{
  JLabel normal;
  JLabel namel;
  JTextField namet;
  JButton button;
  JLabel agel;
  JTextField aget;
  JLabel postionl;
  JTextField postiont;
  int state;
  int clubn;
    public PlayerGui(int s,int w){
        clubn=w;
        state=s;
      setTitle("Player");
      setSize(600,600);
      
      this.setLayout(new FlowLayout());
      normal=new JLabel("Enter The Player Data");
      namel=new JLabel("Name");
      namet=new JTextField("name");
      button=new JButton("Enter");
      agel=new JLabel("age: ");
      aget=new JTextField("age");
      postionl=new JLabel("postion: ");
      postiont=new JTextField("postion");
     
      this.add(namel);
      this.add(namet);
      this.add(normal);
      this.add(agel);
      this.add(aget);
      this.add(postionl);
      this.add(postiont);
      this.add(button);

      this.setVisible(true);
      button.addActionListener(new press());
      
    }
        private class press implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
          Player player1=new Player();
          player1.setName(namet.getText());
          player1.setAge(aget.getText());
          player1.setPosition(postiont.getText());   
          if(clubn==-1) {
          clubn=FootballManagerSystem.leagues.get(state).clubs.size()-1;
          }
          System.out.println("this is my size"+FootballManagerSystem.leagues.get(state).clubs.size());
          FootballManagerSystem.leagues.get(state).clubs.get(clubn).players.add(player1);
          FootballManagerSystem.leagues.get(state).save();
          namet.setText("name");
          aget.setText("age");
          postiont.setText("postion");
          JOptionPane.showMessageDialog(null, "Player add successfily","player", JOptionPane.INFORMATION_MESSAGE);
          


        }
       
   }
    
}
