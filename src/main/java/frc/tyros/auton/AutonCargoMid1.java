package frc.tyros.auton;

import frc.tyros.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class AutonCargoMid1 extends TimedCommand {

    private DriveTrain driveTrain;

	public AutonCargoMid1(double timeout,DriveTrain driveTrain) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        this.driveTrain=driveTrain;
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
            driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); //I believe the first value was forward at 50%.
            driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); // Use color sensor code to follow white line 
            driveTrain.setMecanumDriveCommand(0, 0, 0, 0); //if(proximity sensor detects cargo ship == true) 
            //Use mechanism to push hatch;
            driveTrain.setMecanumDriveCommand(-0.5, 0, 0, 0); //Use color sensor to follow white line until it no longer sees it
            driveTrain.setMecanumDriveCommand(0, 0, 0, 0); //to stop
    	}
    

    // Called once after timeout
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
