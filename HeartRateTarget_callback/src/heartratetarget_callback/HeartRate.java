package heartratetarget_callback;
import java.util.Random;
/**
 *
 * @author SaveEarth
 */
public class HeartRate {
    
    RunnerInfo runner;
    double  Intensity, maxHR, Age,restingHR, med;
    double targetHeartRate;
    public HeartRate(RunnerInfo Runner){
        runner = Runner;
    }
    
    public double getHeartRate(){
        Age = runner.getAge();
        maxHR = 220 - Age;
        restingHR = runner.getRestHR();
        Intensity = new Random().nextInt(100);
        targetHeartRate = ((maxHR - restingHR) * (Intensity / 100)) + restingHR;
        //System.out.println("MAXHR: " + maxHR +" Intensity " + Intensity + " HR " + targetHeartRate );
        return targetHeartRate;
    }
}
