package frc.tyros.commands;

import frc.tyros.subsystems.DriveTrain;
import frc.tyros.subsystems.Elevator;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import frc.tyros.OI;


/**
 *
 */
public class RaiseElevator extends Command {
	private Elevator elevator;
    private XboxController gamePad;
    private double pos;
    
    public RaiseElevator(OI m_oi, double pos) {
        this.elevator=m_oi.getElevator();
        this.pos = pos;
    requires(elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        elevator.driveElevator(pos-73.5); //DOUBLE CHECK TRUE HEIGHT OF BALL AT BOTTOM OF ELEVATOR
        /*Use Versaplanetary encoders to make this work*/
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