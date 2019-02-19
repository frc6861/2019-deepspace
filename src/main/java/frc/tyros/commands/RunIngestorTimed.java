package frc.tyros.commands;


import frc.tyros.subsystems.Ingestor;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class RunIngestorTimed extends TimedCommand {
    private Ingestor ingestor;
    private double speed;
    public RunIngestorTimed(double timeout, Ingestor ingestor, double speed) {
    	 super (timeout);
        this.ingestor=ingestor;
        this.speed=speed;
    	 requires(ingestor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
			ingestor.driveMotors(speed); //used to be 0.5
    	
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