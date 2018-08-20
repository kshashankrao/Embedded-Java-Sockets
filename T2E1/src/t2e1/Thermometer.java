/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2e1;
import java.util.Random;

/**
 *
 * @author SaveEarth
 */
public class Thermometer {
    private static final double BASE_TEMPERATURE = 25.0;
    private final Random randomGenerator = new Random();
    
    public double getCurrentTemperature (){
        System.out.println("Temperature: ");
        return BASE_TEMPERATURE + (randomGenerator.nextDouble() - 0.5) * 10;
    }
}
