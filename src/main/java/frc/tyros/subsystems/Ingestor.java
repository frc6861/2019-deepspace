package frc.tyros.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Solenoid;

import frc.tyros.OI;
import frc.tyros.commands.LiftIngestor;
import frc.tyros.commands.RunIngestor;
import frc.tyros.movement.MoveForward;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Ingestor extends Subsystem {
    private WPI_TalonSRX leftMotor;
    private WPI_TalonSRX rightMotor;
    private Compressor compressor;
    private DoubleSolenoid solenoidW;
    private DoubleSolenoid solenoidL;
    private Solenoid solenoidB;
    private DoubleSolenoid solenoidBH;
    private XboxController gamepad;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Ingestor(OI m_OI) {
        compressor = new Compressor(0);
        leftMotor = new WPI_TalonSRX(13);
        rightMotor = new WPI_TalonSRX(2);
        solenoidW = new DoubleSolenoid(1, 2);
        solenoidL = new DoubleSolenoid(3, 4); // TODO get channel number, rename(fine for now, can be changed later)
        solenoidB = new Solenoid(5);
        solenoidBH = new DoubleSolenoid(6, 7);
        compressor.start();
    }

        // for pnuematics for wedge pickup

    public void extend() {
        solenoidW.set(DoubleSolenoid.Value.kForward);
    }

    public void retract() {
        solenoidW.set(DoubleSolenoid.Value.kReverse);
    }
    // for pnuematics for adjustment

    public void lift() {
        solenoidL.set(DoubleSolenoid.Value.kForward);
    }

    public void lower() {
        solenoidL.set(DoubleSolenoid.Value.kReverse);
    }

    public void extendBall() {
        solenoidB.set(true);
    }

    public void retractBall() {
        solenoidB.set(false);
    }

    public void backExtend() {
        solenoidBH.set(DoubleSolenoid.Value.kForward);
    }

    public void backRetract() {
        solenoidBH.set(DoubleSolenoid.Value.kReverse);
    }

    public void driveMotors(double speed){
        leftMotor.set(speed);
        rightMotor.set(-speed);
    }

    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    
    }

    
}

