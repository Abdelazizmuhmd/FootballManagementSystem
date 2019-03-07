/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Data;
import Data.IFile;
import FootballManagerSystem.FootballManagerSystem;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Guest extends User implements Serializable,IFile,Ilogin{
    
    
    public int login(int idd,String passwordl)
    {
    int index=0;
    for(Guest x: FootballManagerSystem.guests)
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
    ObjectOutputStream bin =new ObjectOutputStream(new FileOutputStream("/Users/Desktop/datta.dat"));
    bin.writeObject(FootballManagerSystem.guests);
    bin.close();
        System.out.println("save hash");

    guestmap();
    } catch (FileNotFoundException ex) {
    }catch(IOException e){
        
    }


    }
public Guest searchWithHashMap(int Id){
    
 Guest x = FootballManagerSystem.guestmap.get(Id);
 
return x;
}
    
    public void load()  {
        
    try {
          System.out.println("the id is " +" the password is ");

    ObjectInputStream bin =new ObjectInputStream(new FileInputStream("/Users/Desktop/datta.dat"));
    FootballManagerSystem.guests=(ArrayList<Guest>)bin.readObject();
    bin.close();
    } catch (FileNotFoundException ex) {
 System.out.println("File not found");
    }catch(IOException e){
         System.out.println("io");
    } catch (ClassNotFoundException ex) {
 System.out.println("class not");
    }
    System.out.println("load hash");
guestmap();
    
    
    
    }
    public void guestmap(){
            System.out.println(" hash");

    for(int i=0;i<FootballManagerSystem.guests.size();i++){
   FootballManagerSystem.guestmap.put(FootballManagerSystem.guests.get(i).getId(),FootballManagerSystem.guests.get(i));

}}

  /*public  String ChoiceLeague(){
        
    }
   public   String ShowTimeTable(){
        
    }
 public String ShowResults(){
    
}
 public String ShowPlayers(){
    
}
    public  String ShowManOfTheMatch(){
        
    }
    public  String BuyTicket(){
        
    }
    public  String GuessResult(){
        
    }*/
  /*  public boolean insert() {
       return true;
    }

    
    public int search() {
       
    }

    
    public boolean update() {
       
    }

    
    public boolean delete() {
    
    }
*/public void EditName(String newName)
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
        this.setPassword(password);
        this.setAge(age);
        this.setId(id);
        } catch (OurException ex) {
            ex.getMessage();
        }
       
        
        return true;
    }
   
        
   

    
   
    }
    
      