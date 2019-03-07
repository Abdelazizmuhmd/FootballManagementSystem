/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.*;
import FootballManagerSystem.FootballManagerSystem;
/**
 *
 * @author Khaled
 */
public class TimeTableDat extends JFrame {
    JTextField textfield1;
    JLabel label1;
    JLabel label2;
    JTextField textfield2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JTextField textfield3;
    JTextField textfield4;
    JTextField textfield5;
    JTextField textfield6;
    JButton Add;
    public TimeTableDat(){
     setTitle("TimeTable");
     setSize(900,900);
     this.setLayout(new FlowLayout()); 
     label1=new JLabel("First Club Name ");
     textfield1=new JTextField(10);
     
     label2 = new JLabel("Second Club Name");
     textfield2=new JTextField(10);
     
     label3 =new JLabel("Day");
     textfield3=new JTextField(5);
     
     label4=new JLabel("Month");
     textfield4=new JTextField(5);
     
     label5=new JLabel("Year");
     textfield5=new JTextField(5);
     
     label6=new JLabel("Match Time");
     textfield6=new JTextField(5);
     textfield6.setText("  :  PM");
     
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
     add(Add);
     Add.addActionListener(new press());
    }
    public void save() {
    try {
    ObjectOutputStream bin =new ObjectOutputStream(new FileOutputStream("/Users/Desktop/time.dat"));
    bin.writeObject(FootballManagerSystem.TTD);
    bin.close();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
        
    }
    }
    public class press implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            timetable t=new timetable();
            t.clubname1=textfield1.getText();
            t.clubname2=textfield2.getText();
            t.day=textfield3.getText();
            t.month=textfield4.getText();
            t.year=textfield5.getText();
            t.time=textfield6.getText();
            FootballManagerSystem.TTD.add(t);
            save();
            JOptionPane.showMessageDialog(null, "Added Successfully");
            textfield1.setText("");
            textfield2.setText("");
            textfield3.setText("");
            textfield4.setText("");
            textfield5.setText("");
            textfield6.setText("  :  PM");
        }
    
    }
}
