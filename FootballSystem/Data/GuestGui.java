/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Data;

import Match.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import tables.ChooseMatch;
import tables.ShowResults;
import tables.ShowTimeTable;

/**
 *
 * @author Ahmed Hassan
 */
public class GuestGui extends JFrame {
     JButton Timetable;
     JButton results;
     JButton match;
     JButton clubs;

      public GuestGui(){
      
        setSize(630,480);
        setTitle("guest");
        
        clubs=new JButton("show clubs");
        Timetable = new JButton("show TimeTable");
        results=new JButton("show results");
        match=new JButton("show match");
        
        setLayout(new FlowLayout());
        Timetable.addActionListener(new timetablea());
        results.addActionListener(new resultsa());
        match.addActionListener(new matcha());
        clubs.addActionListener(new clubsa());
        add(Timetable);
        add(results);
        add(match);
        add(clubs);
   
      
      }

 private class timetablea implements ActionListener{

 public void actionPerformed(ActionEvent arg) {
     ShowTimeTable s=new ShowTimeTable();
     
 }
}
  private class resultsa implements ActionListener{

 public void actionPerformed(ActionEvent arg) {
     ShowResults r=new ShowResults();
     
 }
}
   private class matcha implements ActionListener{

 public void actionPerformed(ActionEvent arg) {
     
     ChooseMatch m=new ChooseMatch();
 }
}
      private class clubsa implements ActionListener{

 public void actionPerformed(ActionEvent arg) {
     clubs s=new clubs(0);
     s.setVisible(true);
     
 }
}

}
