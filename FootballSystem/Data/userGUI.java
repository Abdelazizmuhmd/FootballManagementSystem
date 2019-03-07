/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//
//  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Data;
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Matrix
 */
public class userGUI extends JFrame{
  

    public userGUI(String Title){
      setTitle(Title);
      setSize(900,900);
      
      Container u = getContentPane();
      u.setLayout(new FlowLayout()); 
      JLabel label4 =new JLabel("Name");
      JTextField textfield4=new JTextField(10);
      JLabel Label5=new JLabel("Password");
      JTextField Textfield5=new JTextField(10);
      JLabel Label6=new JLabel("Agre");
      JTextField Textfield6=new JTextField(10);
      JLabel Label7=new JLabel("ID");
      JTextField Textfield7=new JTextField(10);

      JButton button2=new JButton("Enter");
      u.add(label4);
      u.add(textfield4);
      u.add(Label5);
      u.add(Textfield5);
      u.add(Label6);
      u.add(Textfield6);
      u.add(Label7);
      u.add(Textfield7);
     
      u.add(button2);
    }


}
