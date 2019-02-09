package frc.tyros.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.XboxController;

import frc.tyros.OI;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Ingestor extends Subsystem {
    private WPI_TalonSRX leftMotor;
    private WPI_TalonSRX rightMotor;
    private Compressor compressor;
    private DoubleSolenoid solenoidW;
    private DoubleSolenoid solenoidL;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Ingestor() {
        compressor = new Compressor(0);
        leftMotor = new WPI_TalonSRX(13);
        rightMotor = new WPI_TalonSRX(2);
        solenoidW = new DoubleSolenoid(1, 2);
        solenoidL = new DoubleSolenoid(3, 4); // TODO get channel number, rename
        compressor.start();
    }

    
    public void extend() {
        solenoidW.set(DoubleSolenoid.Value.kForward);

    }

    public void retract() {
        solenoidW.set(DoubleSolenoid.Value.kReverse);
    }

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());

    }

    
}
