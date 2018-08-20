/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartratetarget_callback;
import java.util.Timer;
import java.util.ArrayList;
/**
 *
 * @author SaveEarth
 */
public class HeartRateSensor extends Thread{
    
    ArrayList<Listeners> listeners;
    RunnerInfo runner;
    public HeartRateSensor(RunnerInfo Runner){
        listeners = new ArrayList<>();
        this.runner = Runner;
    }
    
    public void addListener(Listeners newListener){
        listeners.add(newListener);
    }
    
    @Override
    public void run(){
        Timer runTimer = new Timer();
        TakeHeartRate heartrate = new TakeHeartRate(runner,listeners);
        runTimer.schedule(heartrate,0,5000);
    }
     void stop(){
        interrupt();
    }
}

