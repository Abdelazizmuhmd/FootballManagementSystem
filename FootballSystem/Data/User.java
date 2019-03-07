/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  Created by Abdelaziz mohamed on 7/12/18.
//  Copyright © 2018 Abdelaziz mohamed. All rights reserved.
//

package Data;
import java.io.*;
/**
 *
 * @author Ahmad
 */
public  abstract class User implements Serializable
{
public String  userName;
public String password;
public int Age;
public int id;
/*private static int count=0 ;


   User(){
   id = count++;
   }

*/


    public int getAge() {
       
        return Age;
    }

    public void setAge(int Age) throws OurException {
        if(Age<0){
        throw new OurException("age is smaller than 0");
        
        }else{
                this.Age = Age;
}
    }


    public void setUserName(String userNamee)throws OurException  {
        if(userNamee.length()>40){
                throw new OurException("name is can't be greater than 40");

        }else{
        this.userName = userNamee;}
    }

    public void setPassword(String password)throws OurException {
if(password.length()>40){
    throw new OurException("name is can't be greater than 40");
       }else{
    this.password=password;
}

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
   

    public String getUserName() {
        return userName;}

    public String getPassword() {
        return password;
    }
        
        

}


