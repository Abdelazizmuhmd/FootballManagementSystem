/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Managers;

import Data.User;
import Data.IFile;
import FootballManagerSystem.FootballManagerSystem;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import Data.Ilogin;
import Data.OurException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmad
 */

public class FinanceManagement extends User implements Serializable,IFile,Ilogin
{public void EditName(String newName) throws OurException
{
this.setUserName(newName);
save();
}
public void EditPassword(String newpass){
    try {
        this.setPassword(newpass);
        save();
    } catch (OurException ex) {
            ex.getMessage();
    }
}

    public int login(int id,String password)
    {
    int index=0;
    for(FinanceManagement x: FootballManagerSystem.FinanceManagers)
    {
    if(id==x.getId()&&password==x.getPassword()){
    return index;
    }
    index++;
    }
    return -1;
    }
    
    public void save()
    {
    try {
    ObjectOutputStream bin =new ObjectOutputStream(new FileOutputStream("/Users/Desktop/Data2.dat"));
    bin.writeObject(FootballManagerSystem.FinanceManagers);
    bin.close();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
        
    }
        
    }
 public boolean SignUp(String name,String password,int age,int id) {
    try {
        this.setUserName(name);
    } catch (OurException ex) {
ex.getMessage();    }
    try {
        this.setPassword(password);
    } catch (OurException ex) {
ex.getMessage();     }
    try {
        this.setAge(age);
    } catch (OurException ex) {
ex.getMessage();     }
        
    this.setId(id);
        return true;
    }
   
        
   
    
    public void load()  
    {
    try {
    ObjectInputStream bin =new ObjectInputStream(new FileInputStream("/Users/Desktop/Data2.dat"));
    FootballManagerSystem.FinanceManagers=(ArrayList<FinanceManagement>)bin.readObject();
    bin.close();
    } catch (FileNotFoundException ex)
    {
    }catch(IOException e){
        
    } catch (ClassNotFoundException ex)
    {
    }
 
  
    // public  void PayCheck(){
        
   // }
   // public  void MakeContract(){
        
    //}

}
}
