package frc.tyros.subsystems;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ProximitySensor extends Subsystem {

    private Ultrasonic ultra = new Ultrasonic(1,1);
    private double range;
    
    public ProximitySensor() {
        ultra.setAutomaticMode(true);
    }
    
    public void ultrasonicRange() {
        double range = ultra.getRangeMM();
    }

    @Override
    protected void initDefaultCommand() {

    }
}