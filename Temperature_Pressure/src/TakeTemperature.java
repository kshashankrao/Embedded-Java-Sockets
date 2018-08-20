/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2e1;
import java.util.TimerTask;
/**
 *
 * @author SaveEarth
 */
public class TakeTemperature extends TimerTask{
    double tempValue;
    public void run(){
        Thermometer temp = new Thermometer();
        tempValue = temp.getCurrentTemperature();
        if (tempValue < 5){
            System.out.println("The temperature is below 5" + tempValue);
        }
        if (tempValue > 38){
            System.out.println("The temperature is above 38" + tempValue);
        }
        else{
            System.out.println("The temperature is between 5 and 38 " + tempValue);
        }
    }
}
