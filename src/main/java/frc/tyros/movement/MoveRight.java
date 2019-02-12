package frc.tyros.movement;


import frc.tyros.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class MoveRight extends TimedCommand {
    private DriveTrain driveTrain;
    private double speed;
    public MoveRight(double timeout, DriveTrain driveTrain, double speed) {
    	 super (timeout);
        this.driveTrain=driveTrain;
        this.speed=speed;
    	 requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
			driveTrain.setMecanumDriveCommand(0, speed, 0, 0);
    	
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