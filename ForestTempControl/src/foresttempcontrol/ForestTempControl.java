/*
Name: Kadapanatham Shashank Rao
 */
package foresttempcontrol;
import javax.microedition.midlet.MIDlet;
public class ForestTempControl extends MIDlet implements Listeners{
    TemperatureSensor temp1;
    TemperatureSensor temp2;
    TemperatureSensor temp3;
    @Override
    public void startApp() {
        
        
            
            temp1 = new TemperatureSensor(38);
            temp2 = new TemperatureSensor(38);
            temp3 = new TemperatureSensor(38);
            temp1.addListener(this);
            temp2.addListener(this);
            temp3.addListener(this);
            temp1.start();
              temp2.start();
                temp3.start();
        
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
        temp1.stop();
        temp2.stop();
        temp3.stop();
    }

    @Override
    public void MaxTempReached (double temp) {
         System.out.println(" Temperature is above the upper limit: " + temp + " irrigation pumps must be opened.");
    }

    @Override
    public void MinTempReached (double temp) {
                System.out.println("Temperature is under the upper limit " + temp + " no actions required.");
    }

}