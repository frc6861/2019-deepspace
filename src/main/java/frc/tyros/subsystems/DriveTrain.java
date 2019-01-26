package frc.tyros.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.tyros.OI;
import frc.tyros.commands.DriveWithJoyStick;

public class DriveTrain extends Subsystem {
	
	private WPI_TalonSRX leftFront1; 
	private WPI_TalonSRX rightFront1;
	private WPI_TalonSRX leftRear1;
	private WPI_TalonSRX rightRear1;
    private MecanumDrive mecanumDrive;
    private XboxController gamePad;
    private OI m_oi;
	


	public DriveTrain(OI m_oi) {
    	leftFront1 = new WPI_TalonSRX(1);
    	rightFront1 = new WPI_TalonSRX(3);
    	leftRear1 = new WPI_TalonSRX(2);
    	rightRear1 = new WPI_TalonSRX(4);

    	
    	mecanumDrive = new MecanumDrive(leftFront1,leftRear1,rightFront1,rightRear1);
    	gamePad=m_oi.getGamePad();
    	this.m_oi=m_oi;
    	
    }
    

    public OI getM_oi() {
		return m_oi;
	}


	public void setM_oi(OI m_oi) {
		this.m_oi = m_oi;
	}


	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoyStick(this,gamePad));
           }


	public void setMecanumDriveCommand(double x, double d, double e, int i) {
	}
}