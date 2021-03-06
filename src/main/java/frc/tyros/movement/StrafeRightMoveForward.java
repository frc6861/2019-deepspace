package frc.tyros.movement;


import frc.tyros.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class StrafeRightMoveForward extends TimedCommand {
    private DriveTrain driveTrain;
    private double yspeed;
    private double xspeed;
    public StrafeRightMoveForward(double timeout, DriveTrain driveTrain, double yspeed, double xspeed) {
    	 super (timeout);
        this.driveTrain=driveTrain;
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    	 requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
			driveTrain.setMecanumDriveCommand(yspeed, xspeed, 0, 0);
    	
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