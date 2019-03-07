/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import FootballManagerSystem.FootballManagerSystem;
/**
 *
 * @author Khaled
 */
public class ChooseMatch extends JFrame {
    String[] Matches = { "Match1", "Match2", "Match3", "Match4", "Match5","Match6","Match7" ,"Match8" ,"Match9" ,"Match10"  };
    JComboBox combobox1;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JLabel label10;
    int x=30;
    int y=30;
    public ChooseMatch(){
    setTitle("Choosing Match");
    setSize(900,900);
    setLayout(new FlowLayout()); 
    combobox1=new JComboBox(Matches);
    add(combobox1);
    
    
    
    combobox1.addActionListener(new press());
    
    setVisible(true);
    

    }
    public class press implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(combobox1.getSelectedItem()=="Match1"){
              load();
       
            label1=new JLabel();
            label1.setText(" "+FootballManagerSystem.S.get(0).getClubname1()+"  "+FootballManagerSystem.S.get(0).getClubname2()+"=>Result  "+FootballManagerSystem.S.get(0).getResults()+"=>BestGoal Keeper  "+FootballManagerSystem.S.get(0).getBestgoalkeeper()+"=>Possession  "+FootballManagerSystem.S.get(0).getPossession()+"=>Best Player  "+FootballManagerSystem.S.get(0).getBestplayer()+"=>Yellow Cards  "+FootballManagerSystem.S.get(0).getYellowcards()+"=> Red Cards  "+FootballManagerSystem.S.get(0).getRedcards());
            label1.setBounds(x, y, 900, 900);
            y=y+50;
            add(label1);
            setVisible(true);
            }else if(combobox1.getSelectedItem()=="Match2"){
              load();
       
            label2=new JLabel();
            label2.setText(" "+FootballManagerSystem.S.get(1).getClubname1()+"  "+FootballManagerSystem.S.get(1).getClubname2()+"=>Result  "+FootballManagerSystem.S.get(1).getResults()+"=>BestGoal Keeper  "+FootballManagerSystem.S.get(1).getBestgoalkeeper()+"=>Possession  "+FootballManagerSystem.S.get(1).getPossession()+"=>Best Player  "+FootballManagerSystem.S.get(1).getBestplayer()+"=>Yellow Cards  "+FootballManagerSystem.S.get(1).getYellowcards()+"=> Red Cards  "+FootballManagerSystem.S.get(1).getRedcards());
            label2.setBounds(x, y, 900, 900);
            y=y+90;
            add(label2);
            setVisible(true);
            }else if(combobox1.getSelectedItem()=="Match3"){
            load();
        
             label3=new JLabel();
             label3.setText(" "+FootballManagerSystem.S.get(2).getClubname1()+"  "+FootballManagerSystem.S.get(2).getClubname2()+"=>Result  "+FootballManagerSystem.S.get(2).getResults()+"=>BestGoal Keeper  "+FootballManagerSystem.S.get(2).getBestgoalkeeper()+"=>Possession  "+FootballManagerSystem.S.get(2).getPossession()+"=>Best Player  "+FootballManagerSystem.S.get(2).getBestplayer()+"=>Yellow Cards  "+FootballManagerSystem.S.get(2).getYellowcards()+"=> Red Cards  "+FootballManagerSystem.S.get(2).getRedcards());

            label3.setBounds(x, y, 900, 900);
            y=y+130;
            add(label3);
            setVisible(true);
            }else if(combobox1.getSelectedItem()=="Match4"){
            load();
       
             label4=new JLabel();
            
                        label4.setText(" "+FootballManagerSystem.S.get(3).getClubname1()+"  "+FootballManagerSystem.S.get(3).getClubname2()+"=>Result  "+FootballManagerSystem.S.get(3).getResults()+"=>BestGoal Keeper  "+FootballManagerSystem.S.get(3).getBestgoalkeeper()+"=>Possession  "+FootballManagerSystem.S.get(3).getPossession()+"=>Best Player  "+FootballManagerSystem.S.get(3).getBestplayer()+"=>Yellow Cards  "+FootballManagerSystem.S.get(3).getYellowcards()+"=> Red Cards  "+FootballManagerSystem.S.get(3).getRedcards());

            label4.setBounds(x, y, 900, 900);
            y=y+170;
            add(label4);
            setVisible(true);
            }else if(combobox1.getSelectedItem()=="Match5"){
            load();
       
             label5=new JLabel();
            label5.setText(" "+FootballManagerSystem.S.get(4).getClubname1()+"  "+FootballManagerSystem.S.get(4).getClubname2()+"=>Result  "+FootballManagerSystem.S.get(4).getResults()+"=>BestGoal Keeper  "+FootballManagerSystem.S.get(4).getBestgoalkeeper()+"=>Possession  "+FootballManagerSystem.S.get(4).getPossession()+"=>Best Player  "+FootballManagerSystem.S.get(4).getBestplayer()+"=>Yellow Cards  "+FootballManagerSystem.S.get(4).getYellowcards()+"=> Red Cards  "+FootballManagerSystem.S.get(4).getRedcards());
            label5.setBounds(x, y, 900, 900);
            y=y+210;
            add(label5);
            setVisible(true);
            }else if(combobox1.getSelectedItem()=="Match6"){
            load();
       
             label6=new JLabel();
            label6.setText(" "+FootballManagerSystem.S.get(5).getClubname1()+"  "+FootballManagerSystem.S.get(5).getClubname2()+"=>Result  "+FootballManagerSystem.S.get(5).getResults()+"=>BestGoal Keeper  "+FootballManagerSystem.S.get(5).getBestgoalkeeper()+"=>Possession  "+FootballManagerSystem.S.get(5).getPossession()+"=>Best Player  "+FootballManagerSystem.S.get(5).getBestplayer()+"=>Yellow Cards  "+FootballManagerSystem.S.get(5).getYellowcards()+"=> Red Cards  "+FootballManagerSystem.S.get(5).getRedcards());
            label6.setBounds(x, y, 900, 900);
            y=y+250;
            add(label6);
            setVisible(true);
            }else if(combobox1.getSelectedItem()=="Match7"){
            load();
       
             label7=new JLabel();
            label7.setText(" "+FootballManagerSystem.S.get(6).getClubname1()+"  "+FootballManagerSystem.S.get(6).getClubname2()+"=>Result  "+FootballManagerSystem.S.get(6).getResults()+"=>BestGoal Keeper  "+FootballManagerSystem.S.get(6).getBestgoalkeeper()+"=>Possession  "+FootballManagerSystem.S.get(6).getPossession()+"=>Best Player  "+FootballManagerSystem.S.get(6).getBestplayer()+"=>Yellow Cards  "+FootballManagerSystem.S.get(6).getYellowcards()+"=> Red Cards  "+FootballManagerSystem.S.get(6).getRedcards());
            label7.setBounds(x, y, 900, 900);
            y=y+290;
            add(label7);
            setVisible(true);
            }else if(combobox1.getSelectedItem()=="Match8"){
            load();
       
             label8=new JLabel();
            label8.setText(" "+FootballManagerSystem.S.get(7).getClubname1()+"  "+FootballManagerSystem.S.get(7).getClubname2()+"=>Result  "+FootballManagerSystem.S.get(7).getResults()+"=>BestGoal Keeper  "+FootballManagerSystem.S.get(7).getBestgoalkeeper()+"=>Possession  "+FootballManagerSystem.S.get(7).getPossession()+"=>Best Player  "+FootballManagerSystem.S.get(7).getBestplayer()+"=>Yellow Cards  "+FootballManagerSystem.S.get(7).getYellowcards()+"=> Red Cards  "+FootballManagerSystem.S.get(7).getRedcards());
            label8.setBounds(x, y, 900, 900);
            y=y+330;
            add(label8);
            setVisible(true);
            }else if(combobox1.getSelectedItem()=="Match9"){
            load();
       
            label9=new JLabel();
            label9.setText(" "+FootballManagerSystem.S.get(8).getClubname1()+"  "+FootballManagerSystem.S.get(8).getClubname2()+"=>Result  "+FootballManagerSystem.S.get(8).getResults()+"=>BestGoal Keeper  "+FootballManagerSystem.S.get(8).getBestgoalkeeper()+"=>Possession  "+FootballManagerSystem.S.get(8).getPossession()+"=>Best Player  "+FootballManagerSystem.S.get(8).getBestplayer()+"=>Yellow Cards  "+FootballManagerSystem.S.get(8).getYellowcards()+"=> Red Cards  "+FootballManagerSystem.S.get(8).getRedcards());
            label9.setBounds(x, y, 900, 900);
            y=y+370;
            add(label9);
            setVisible(true);
            }else if(combobox1.getSelectedItem()=="Match10"){
            load();
       
            label10=new JLabel();
            label10.setText(" "+FootballManagerSystem.S.get(9).getClubname1()+"  "+FootballManagerSystem.S.get(9).getClubname2()+"=>Result  "+FootballManagerSystem.S.get(9).getResults()+"=>BestGoal Keeper  "+FootballManagerSystem.S.get(9).getBestgoalkeeper()+"=>Possession  "+FootballManagerSystem.S.get(9).getPossession()+"=>Best Player  "+FootballManagerSystem.S.get(9).getBestplayer()+"=>Yellow Cards  "+FootballManagerSystem.S.get(9).getYellowcards()+"=> Red Cards  "+FootballManagerSystem.S.get(9).getRedcards());
            label10.setBounds(x, y, 900, 900);
            y=y+410;
            add(label10);
            setVisible(true);
            }
        }
    
    }
    public void load()  {
     
    try {
    ObjectInputStream bin =new ObjectInputStream(new FileInputStream("/Users/Desktop/datta.dat/Statstics.dat"));
    FootballManagerSystem.S=(ArrayList<stat>)bin.readObject();
    bin.close();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
    } catch (ClassNotFoundException ex) {
    }    
    }
}