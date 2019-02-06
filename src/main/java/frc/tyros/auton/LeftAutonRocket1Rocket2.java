package frc.tyros.auton;

import frc.tyros.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class LeftAutonRocket1Rocket2 extends TimedCommand {

    private DriveTrain driveTrain;

	public LeftAutonRocket1Rocket2(double timeout,DriveTrain driveTrain) {
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
        //there are two ways to begin. You may either start at the edge of the platform facing forward and driveTrain.setMecanumDriveCommand(0.3, 0, 0, 0); and then driveTrain.setMecanumDriveCommand(0.3, 0.4, 0, 0); to drive up to rocket and turn to face it 45 deg with driveTrain.setMecanumDrive(0, 0, -0.125, 0);
        /*or you may start at the edge of the platform facing the the side of the field*/ driveTrain.setMecanumDriveCommand(0, 0.5, 0, 0); /*strafe to the spot then */ driveTrain.setMecanumDriveCommand(0, 0, 0.125, 0); //rotate 45 deg to the cargo spot
        driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up to spot, need prox and color sensor for reliability
        //place hatch
        driveTrain.setMecanumDriveCommand(-0.2, 0, 0, 0); //back up
        driveTrain.setMecanumDriveCommand(0, 0, -0.375, 0); //rotate 135 degrees toward human player
        driveTrain.setMecanumDriveCommand(0.6, 0, 0, 0); //drive up to human player. need prox and color sensor for reliability
        //pick up hatch
        driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); //to turn 90 degrees back facing the side of the field
        driveTrain.setMecanumDriveCommand(0, 0.6, 0, 0); //to strafe to other side of cargo
        driveTrain.setMecanumDriveCommand(0, 0, -0.125, 0); //to rotate toward rocket spot
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
