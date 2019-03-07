/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Data;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JOptionPane;
import FootballManagerSystem.FootballManagerSystem;
/**
 *
 * @author Zizo
 */
public class hashGui extends JFrame {
    JComboBox combo;
   JLabel idl;
   JLabel data;
   JTextField id;
    JButton search;
    public hashGui(){
        setSize(600,600);
        idl=new JLabel("id: ");
        this.setLayout(new FlowLayout());
        data=new JLabel();
        combo=new JComboBox();
        combo.addItem("guest");
        id=new JTextField("enter id");
        search=new JButton("search");
       
        add(combo);
        
        add(idl);
        add(id);
        add(search);
         add(data);
        search.addActionListener(new hasha());
        
    }
    
      private class hasha implements ActionListener{
          
        public void actionPerformed(ActionEvent ae) { 
            int key=Integer.parseInt(id.getText());
       String c=(String)combo.getSelectedItem();
       if(c.equals("guest")){
           Guest guest=new Guest();
      guest= FootballManagerSystem.guestmap.get(key);
      data.setText("this id name is : "+guest.getUserName()+"  his age is : "+guest.getAge());
       
       
       }
        }
       
   }
}
