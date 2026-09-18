/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registration;

/**
 *
 * @author Student
 */
public class Registration { //start of class
    
    public boolean checkUserName(String username){// start of username method
        if(username.contains("@") && username.length()== 3){
            return true;
        }else{
            return false;
        }

    }//end of username method


}//end of class
    

