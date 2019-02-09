package frc.tyros.movement;


import frc.tyros.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class MoveForward extends TimedCommand {
	private DriveTrain driveTrain;
    public MoveForward(double timeout, DriveTrain driveTrain) {
    	 super (timeout);
    	this.driveTrain=driveTrain;
    	 requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
			driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    // protected boolean isFinished() {
    //}
    

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}