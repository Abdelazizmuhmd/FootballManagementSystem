/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import FootballManagerSystem.FootballManagerSystem;
import java.io.ObjectOutputStream;
/**
 *
 * @author Khaled
 */
public class StatsticsData extends JFrame{
    

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JTextField textfield1;
    JTextField textfield2;
    JTextField textfield3;
    JTextField textfield4;
    JTextField textfield5;
    JTextField textfield6;
    JTextField textfield7;
    JTextField textfield8;
    JButton Add;
    public StatsticsData(){
     setTitle("Statstics");
     setSize(900,900);
     this.setLayout(new FlowLayout()); 
     label1=new JLabel("First Club Name");
     label2=new JLabel("Second Club Name");
     label3=new JLabel("Result");
     label4=new JLabel("Best Goal Keeper");
     label5=new JLabel("Possesssion");
     label6=new JLabel("Best Player");
     label7=new JLabel("Yellow Cards");
     label8=new JLabel("Red Cards");
     textfield1=new JTextField(10);
     textfield2=new JTextField(10);
     textfield3=new JTextField(10);
     textfield3.setText("  -  ");
     textfield4=new JTextField(10);
     textfield5=new JTextField(10);
     textfield5.setText(" % -  % ");
     textfield6=new JTextField(10);
     textfield7=new JTextField(10);
     textfield7.setText("  -  ");
     textfield8=new JTextField(10);
     textfield8.setText("  -  ");
     Add=new JButton("Add");
    
     
     add(label1);
     add(textfield1);
     add(label2);
     add(textfield2);
     add(label3);
     add(textfield3);
     add(label4);
     add(textfield4);
     add(label5);
     add(textfield5);
     add(label6);
     add(textfield6);
     add(label7);
     add(textfield7);
     add(label8);
     add(textfield8);
     add(Add);
     Add.addActionListener(new press());
     setVisible(true);
    }
    public void save() {
    try {
    ObjectOutputStream bin =new ObjectOutputStream(new FileOutputStream("/Users/Desktop/datta.dat/Statstics.dat"));
    bin.writeObject(FootballManagerSystem.S);
    bin.close();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
        
    }
    }
    public class press implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            stat t=new stat();
            t.clubname1=textfield1.getText();
            t.clubname2=textfield2.getText();
            t.Results=textfield3.getText();
            t.bestgoalkeeper=textfield4.getText();
            t.Possession=textfield5.getText();
            t.bestplayer=textfield6.getText();
            t.yellowcards=textfield7.getText();
            t.redcards=textfield8.getText();
            FootballManagerSystem.S.add(t);
            save();
            JOptionPane.showMessageDialog(null, "Added Successfully");
            textfield1.setText("");
            textfield2.setText("");
            textfield3.setText("  -  ");
            textfield4.setText("");
            textfield5.setText(" % -  %");
            textfield6.setText("");
            textfield7.setText("  -  ");
            textfield8.setText("  -  ");
            
        }
    
    }
}
