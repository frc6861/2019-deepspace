package frc.tyros.commands;

import frc.tyros.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends Command {
	private DriveTrain driveTrain;
    private XboxController gamePad;
    
    public Drive(DriveTrain driveTrain,XboxController gamePad) {
    this.driveTrain=driveTrain;
    this.gamePad = gamePad;
    requires(driveTrain);
    
    
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.setMecanumDriveCommand(gamePad.getX(GenericHID.Hand.kLeft), -0.75*gamePad.getY(GenericHID.Hand.kLeft), 0.5*gamePad.getX(GenericHID.Hand.kRight), 0);
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