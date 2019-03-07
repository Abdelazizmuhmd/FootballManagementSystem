/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Managers;

import Data.Guest;
import Match.Club;
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
/**
 *
 * @author Ahmad
 */
public class ClubManager extends User implements Serializable,IFile,Ilogin
{
  public  int clubn;
  public int state;
 public ClubManager searchWithHashMap(int Id){
    
 ClubManager x = FootballManagerSystem.ClubManagermap.get(Id);
 
return x;
}   

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getClubno() {
        return clubn;
    }

    public void setClubname(int clubname) {
        this.clubn = clubname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
    
    
    
    public void EditName(String newName)
{
this.setUserName(newName);
save();
}
public void EditPassword(String newpass){
this.setPassword(newpass);
save();
}

 /* public void ClubManagermap(){
  for(int i=0;i<FootballManagerSystem.ClubManagermap.size();i++){
  FootballManagerSystem.ClubManagermap.put(FootballManagerSystem.clubMangers.get(i).getId(),FootballManagerSystem.clubMangers.get(i));

    }}*/
   


    public int login(int id,String password)
    {
    int index=0;
    for(ClubManager x: FootballManagerSystem.clubMangers)
    {
    if(id==x.getId()&&password.equals(x.getPassword()))
    {
    return index;
    }
    index++;
    }
    return -1;
    }
    
    public void save()
    {
    try {
    ObjectOutputStream bin =new ObjectOutputStream(new FileOutputStream("/Users/Desktop/Data1.dat"));
    bin.writeObject(FootballManagerSystem.clubMangers);
    bin.close();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
        
    }
        //ClubManagermap();
    }
    public boolean SignUp(String name,String password,int age,int id) {
        this.setUserName(name);
        this.setPassword(password);
        this.setAge(age);
        this.setId(id);
        return true;
    }
   
        
   
    public void load()  
    {
    try {
    ObjectInputStream bin =new ObjectInputStream(new FileInputStream("/Users/Desktop/Data1.dat"));
    FootballManagerSystem.clubMangers=(ArrayList<ClubManager>)bin.readObject();
    bin.close();
    } catch (FileNotFoundException ex)
    {
    }catch(IOException e){
        
    } catch (ClassNotFoundException ex)
    {
    }
    //ClubManagermap();

    }
public void AddCoach()
{
    
}
public void CreateClub(Club myClub,String name,int trop){
}
public void AddTrophes()
{
    
}
}
