package frc.tyros.auton;

import frc.tyros.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class LeftAutonCargoSide1Side2 extends TimedCommand {

    private DriveTrain driveTrain;

	public LeftAutonCargoSide1Side2(double timeout,DriveTrain driveTrain) {
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
             //there are two ways to begin. You may either start at the edge of the platform facing forward and driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); and then driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); to drive up to side spot 1 and turn to face it
        /*or you may start at the edge of the platform facing the direction you already need to be in and*/ driveTrain.setMecanumDriveCommand(0, -0.5, 0, 0); //strafe to the spot 
        driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up to spot, need prox and color sensor for reliability
            //place hatch
            driveTrain.setMecanumDriveCommand(-0.2, 0, 0, 0); //back up
            driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); //rotate 90 degrees toward human player
            driveTrain.setMecanumDriveCommand(0.6, 0, 0, 0); //drive up to human player. need prox and color sensor for reliability
            //pick up hatch
            driveTrain.setMecanumDriveCommand(0, 0, 0.5, 0); //to turn 180 degrees
            driveTrain.setMecanumDriveCommand(0.7, 0, 0, 0); //to drive farther to spot 2. if you want to go straight to spot 3 instead perhaps the value would be 0.8.
            driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); //to rotate toward cargo ship
            driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up, need prox and color sensor for reliability
            //place hatch
        }
    	

    // Called once after timeout
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
