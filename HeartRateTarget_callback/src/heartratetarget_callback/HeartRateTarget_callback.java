/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartratetarget_callback;

import javax.microedition.midlet.MIDlet;

/**
 *
 * @author SaveEarth
 */
public class HeartRateTarget_callback extends MIDlet implements Listeners {
    
    HeartRateSensor HR_Runner1;
    HeartRateSensor HR_Runner2;
    
    @Override
    public void startApp() {
        RunnerInfo Runner1 = new RunnerInfo();
        RunnerInfo Runner2 = new RunnerInfo();
        Runner1.setRestHR(65);
        Runner2.setRestHR(65);
        Runner1.setAge(20);
        Runner2.setAge(20);
        Runner1.setID(1);
        Runner2.setID(2);
       
        HR_Runner1 = new HeartRateSensor(Runner1);
        HR_Runner2 = new HeartRateSensor(Runner2);
        HR_Runner1.addListener(this);
        HR_Runner2.addListener(this);
        HR_Runner1.start();
        HR_Runner2.start();
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
    HR_Runner1.stop();
    HR_Runner2.stop();
    }
    
    
    public void maxHR(double hr){
            System.out.println("Heart Rate is exceeding Max HR");
    }
    
    public void minHR(double hr){
        System.out.println( " Heart Rate is Below Max HR");

    }
}
