package frc.tyros.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.Encoder;

import frc.tyros.OI;
import frc.tyros.commands.Drive;

public class DriveTrain extends Subsystem {
	
	private WPI_TalonSRX leftFront; 
	private WPI_TalonSRX rightFront;
	private WPI_TalonSRX leftRear;
	private WPI_TalonSRX rightRear;
    private MecanumDrive mecanumDrive;
	private XboxController gamePad;
	private Encoder enc1;
    private Encoder enc2;
    private Encoder enc3;
    private Encoder enc4;

    
	public DriveTrain(OI m_oi) {
    	leftFront = new WPI_TalonSRX(0);
    	rightFront = new WPI_TalonSRX(14);
    	leftRear= new WPI_TalonSRX(1);
    	rightRear = new WPI_TalonSRX(15);
    	mecanumDrive = new MecanumDrive(leftFront,leftRear,rightFront,rightRear);
		gamePad=m_oi.getGamePad();
		enc1 = new Encoder(0, 2, false, Encoder.EncodingType.k4X); //channel not final
        enc1.setMaxPeriod(0.1);
        enc1.setMinRate(10);
        enc1.setDistancePerPulse(5);
        enc1.setReverseDirection(true);
        enc1.setSamplesToAverage(7);

        enc2 = new Encoder(0, 3, false, Encoder.EncodingType.k4X); //channel not final
        enc2.setMaxPeriod(0.1);
        enc2.setMinRate(10);
        enc2.setDistancePerPulse(5);
        enc2.setReverseDirection(true);
        enc2.setSamplesToAverage(7);

        enc3 = new Encoder(0, 4, false, Encoder.EncodingType.k4X); //channel not final
        enc3.setMaxPeriod(0.1);
        enc3.setMinRate(10);
        enc3.setDistancePerPulse(5);
        enc3.setReverseDirection(true);
        enc3.setSamplesToAverage(7);

        enc4 = new Encoder(0, 5, false, Encoder.EncodingType.k4X); //channel not final
        enc4.setMaxPeriod(0.1);
        enc4.setMinRate(10);
        enc4.setDistancePerPulse(5);
        enc4.setReverseDirection(true);
        enc4.setSamplesToAverage(7);

        gamePad=m_oi.getGamePad();
        enc1.reset();
        enc2.reset();
        enc3.reset();
        enc4.reset();
    }
  
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Drive(this,gamePad));
    }


	public void setMecanumDriveCommand(double ySpeed, double xSpeed, double zRotation, double gyroAngle) {
		mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation);
    	
	}
}