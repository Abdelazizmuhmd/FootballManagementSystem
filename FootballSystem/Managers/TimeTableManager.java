/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Managers;

import Data.Guest;
import Data.OurException;
import Data.User;
import FootballManagerSystem.FootballManagerSystem;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zizo
 */
public class TimeTableManager extends User{
     public int login(int idd,String passwordl)
    {
    int index=0;
    for(TimeTableManager x: FootballManagerSystem.timetablemangers)
    {
 

   
    if(idd==x.getId()&&passwordl.equals(x.getPassword()))
    {
       
      
    return index;
        
    }
    index++;
    }
    
    
    
    return -1;
    }
    
    public void save() {
    try {
    ObjectOutputStream bin =new ObjectOutputStream(new FileOutputStream("/Users/Desktop/mangerda.dat"));
    bin.writeObject(FootballManagerSystem.guests);
    bin.close();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
        
    }


    }

    public void load()  {
        
    try {
                    System.out.println("the id is " +" the password is ");

    ObjectInputStream bin =new ObjectInputStream(new FileInputStream("/Users/Desktop/mangerda.dat"));
    FootballManagerSystem.guests=(ArrayList<Guest>)bin.readObject();
    bin.close();
    } catch (FileNotFoundException ex) {
 System.out.println("File not found");
    }catch(IOException e){
         System.out.println("io");
    } catch (ClassNotFoundException ex) {
 System.out.println("class not");
    }
    
    
    
    }
  

 public void EditName(String newName)
{
         try {
             this.setUserName(newName);
         } catch (OurException ex) {
ex.getMessage();
         }
save();
}
public void EditPassword(String newpass){
         try {
             this.setPassword(newpass);
         } catch (OurException ex) {
ex.getMessage();
         }
save();
}


   
    public boolean SignUp(String name,String password,int age,int id) {

        try {
         this.setUserName(name);
        this.setAge(age);
        this.setId(id);

        this.setPassword(password);
         } catch (OurException ex) {
ex.getMessage();
         }
        return true;
    }
   
        
   
    
}
