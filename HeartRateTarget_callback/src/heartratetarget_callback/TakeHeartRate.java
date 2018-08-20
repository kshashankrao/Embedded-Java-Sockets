/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartratetarget_callback;

import java.util.ArrayList;
import java.util.TimerTask;

/**
 *
 * @author SaveEarth
 */
public class TakeHeartRate extends TimerTask{
    double currentHeartRate,Age;
    RunnerInfo runner;
    double MinIntensity, MaxIntensity,MinHeartRate,MaxHeartRate, restingHR,maxHR;
    ArrayList<Listeners> CurrentListeners;
    
    public TakeHeartRate(RunnerInfo Runner,ArrayList<Listeners> listeners)
    {   
        this.runner = Runner;
        CurrentListeners = listeners;
    }
  
    @Override
    public void run(){
        
        HeartRate heartrate = new HeartRate(runner);
        currentHeartRate = heartrate.getHeartRate();
        Age = runner.getAge();
        maxHR = 220 - Age;
        restingHR = runner.getRestHR();
        MinIntensity = 60;
        MaxIntensity = 70;
        MinHeartRate = ((maxHR - restingHR) * (MinIntensity / 100)) + restingHR;
        MaxHeartRate = ((maxHR - restingHR) * (MaxIntensity / 100)) + restingHR;
        
        if(currentHeartRate > MaxHeartRate){
            for(Listeners c: CurrentListeners){
                c.maxHR(currentHeartRate);
            }
            //System.out.println("Runner ID: " + runner.getID()+ " Heart Rate is exceeding Max HR");
        }
        else if (currentHeartRate < MinHeartRate){
            for(Listeners c: CurrentListeners){
                c.minHR(currentHeartRate);
            }
            //System.out.println("Runner ID: " + runner.getID()+ " Heart Rate is Below Max HR");
        }
    }
}
