/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2e1;

import javax.microedition.midlet.MIDlet;

/**
 *
 * @author SaveEarth
 */
public class T2E1 extends MIDlet {   
    
    @Override
    public void startApp() {
        
        System.out.println("Hello");
        TemperatureSensor temp1 = new TemperatureSensor();
        TemperatureSensor temp2 = new TemperatureSensor();
        TemperatureSensor temp3 = new TemperatureSensor();
        PressureSensor press1 = new PressureSensor();
        PressureSensor press2 = new PressureSensor();
        PressureSensor press3 = new PressureSensor();

        temp1.start();
        temp2.start();
        temp3.start();
        press1.start();
        press2.start();
        press3.start();
        
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
    }
}
