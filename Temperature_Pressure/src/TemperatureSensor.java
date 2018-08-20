/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2e1;
import java.util.Timer;
/**
 *
 * @author SaveEarth
 */
public class TemperatureSensor extends Thread {
    
    public void run(){
        Timer runTimer = new Timer();
        TakeTemperature temperatureValue = new TakeTemperature();
        runTimer.schedule(temperatureValue ,0,15); 
        
}}
