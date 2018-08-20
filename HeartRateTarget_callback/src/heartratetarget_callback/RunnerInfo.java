/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartratetarget_callback;

/**
 *
 * @author SaveEarth
 */
public class RunnerInfo {
    int ID, Age, RestHR;
    public void setID(int id){
        ID = id;
    }
    
    public void setAge(int age){
        Age = age;
    }
    
    public void setRestHR(int rest_hr){
        RestHR = rest_hr;
    }
    
    public int getID(){
        return ID;
    }
    
    public int getAge(){
        return Age;
    }
    
    public int getRestHR(){
        return RestHR;
    }
    
}
