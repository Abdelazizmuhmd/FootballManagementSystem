/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Managers;
import Match.PlayerGui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Zizo
 */
public class footballsystem extends JFrame {
    JButton offButton;
    JButton onButton;
    JLabel img;
    ImageIcon imageIcon;
    public footballsystem(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  setSize(500,350);
  imageIcon = new ImageIcon(new ImageIcon("/Users/Desktop/fm_2018_fb_og.0.jpg").getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT));
  img=new JLabel();
  img.setIcon(imageIcon);
  setTitle("footballsystem");
  offButton=new JButton("Sign up");
  onButton= new JButton("login");  
  offButton.addActionListener(new signupAction());
  onButton.addActionListener(new loginAction());
  Container cp=getContentPane();
  cp.setLayout(new FlowLayout());
  cp.add(offButton);
  cp.add(onButton);
  cp.add(img);
     }
    
    private  class signupAction implements ActionListener{
    public void actionPerformed(ActionEvent event){
    signup s=new signup();
    s.setVisible(true);
}
}
    private  class loginAction implements ActionListener{
    public void actionPerformed(ActionEvent event){
    login s=new login();
    s.setVisible(true);
}
}

    
    
}
