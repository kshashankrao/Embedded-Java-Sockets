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
public class Pressure {
    private static final double BASE_PRESSURE = 30.0;
    private final Random randomGenerator = new Random();
    
    public double getCurrentPressure (){
        System.out.println("Pressure: ");
        return BASE_PRESSURE + (randomGenerator.nextDouble() - 0.5) * 10;
    }
    
}
