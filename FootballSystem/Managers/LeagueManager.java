/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Data.User;
import Data.IFile;
import FootballManagerSystem.FootballManagerSystem;
import java.io.*;
import java.util.ArrayList;
import Data.Ilogin;
import Data.OurException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeagueManager extends User implements Serializable,IFile,Ilogin
{
public void EditName(String newName)
{
    try {
        this.setUserName(newName);
    } catch (OurException ex) {
ex.getMessage();     }
save();
}
public void EditPassword(String newpass){
    try {
        this.setPassword(newpass);
    } catch (OurException ex) {
ex.getMessage();     }
save();
}

   
public int login(int id,String password)
    {
    int index=0;
    for(LeagueManager x: FootballManagerSystem.LeagueMangers)
    {
    if(id==x.getId()&&password==x.getPassword())
    {
    return index;
    }
    index++;
    }
    return -1;
    }
 public boolean SignUp(String name,String password,int age,int id) {
    try {
        this.setUserName(name);
        this.setAge(age);
        this.setId(id);
        this.setPassword(password);

    } catch (OurException ex) {
ex.getMessage();     }

        return true;
    }
   
        
   
    
    public void save()
    {
    try {
    ObjectOutputStream bin =new ObjectOutputStream(new FileOutputStream("/Users/Desktop/Data3.dat"));
    bin.writeObject(FootballManagerSystem.LeagueMangers);
    bin.close();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
        
    }
        
    }

    
    public void load()  
    {
    try {
    ObjectInputStream bin =new ObjectInputStream(new FileInputStream("/Users/Desktop/Data3.dat"));
    FootballManagerSystem.LeagueMangers=(ArrayList<LeagueManager>)bin.readObject();
    bin.close();
    } catch (FileNotFoundException ex)
    {
    }catch(IOException e){
        
    } catch (ClassNotFoundException ex)
    {
    }

    }
    
    
    
    
    
    
    
   /* @Override
    public void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    */
    
}
