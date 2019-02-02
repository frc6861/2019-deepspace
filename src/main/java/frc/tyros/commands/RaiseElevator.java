package frc.tyros.commands;

import frc.tyros.subsystems.DriveTrain;
import frc.tyros.subsystems.Elevator;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RaiseElevator extends Command {
	private Elevator elevator;
    private XboxController gamePad;
    
    public RaiseElevator(Elevator elevator,XboxController gamePad) {
    this.elevator=elevator;
    this.gamePad = gamePad;
    requires(elevator);
    
    
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	elevator.driveElevator(gamePad.getTriggerAxis(GenericHID.Hand.kRight)); //Not sure if this is correct, will test when we get a robot @mechanical
    }

    //  Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}