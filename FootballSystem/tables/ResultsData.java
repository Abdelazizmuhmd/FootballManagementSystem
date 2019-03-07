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
import java.io.ObjectOutputStream;
import FootballManagerSystem.FootballManagerSystem;
/**
 *
 * @author Khaled
 */
public class ResultsData extends JFrame {
    JTextField textfield1;
    JLabel label1;
    JLabel label2;
    JTextField textfield2;
    JTextField textfield3;
    JButton Add;
    public ResultsData(){
     setTitle("Results");
     setSize(900,900);
     this.setLayout(new FlowLayout()); 
     label1=new JLabel("First Club Name ");
     textfield1=new JTextField(10);
     label2 = new JLabel("Second Club Name");
     textfield2=new JTextField(5);
     textfield2.setText("  -  ");
     textfield3=new JTextField(10);    
     Add=new JButton("Add");
     
     add(label1);
     add(textfield1);
     add(textfield2);
     add(label2);
     add(textfield3);
     add(Add);
     Add.addActionListener(new press());
     setVisible(true);
    }
    public void save() {
    try {
    ObjectOutputStream bin =new ObjectOutputStream(new FileOutputStream("/Users/Desktop/datta.dat/r.dat"));
    bin.writeObject(FootballManagerSystem.R);
    bin.close();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
        
    }
    }
    public class press implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            results t=new results();
            t.clubname1=textfield1.getText();
            t.clubname2=textfield3.getText();
            t.Results=textfield2.getText();
            FootballManagerSystem.R.add(t);
            save();
            JOptionPane.showMessageDialog(null, "Added Successfully");
            textfield1.setText("");
            textfield2.setText("  -  ");
            textfield3.setText("");
            
        }
    
    }
}
