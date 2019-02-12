package frc.tyros.commands;

import frc.tyros.subsystems.DriveTrain;
import frc.tyros.subsystems.Elevator;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import frc.tyros.OI;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class MoveElevatorUp extends TimedCommand {
	private Elevator elevator;
    public MoveElevatorUp(double timeout, Elevator elevator) {
    	 super (timeout);
    	this.elevator=elevator;
    	 requires(elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
            elevator.driveElevator(0.5);
    	
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