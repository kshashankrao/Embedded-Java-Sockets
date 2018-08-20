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
public class TakePressure extends TimerTask{
    double PressValue;
    public void run(){
        Pressure press = new Pressure();
        PressValue = press.getCurrentPressure();
        if (PressValue < 40){
            System.out.println("The Pressure is below 40" + PressValue);
        }
        if (PressValue > 38){
            System.out.println("The Pressure is above 80" + PressValue);
        }
    }
}
