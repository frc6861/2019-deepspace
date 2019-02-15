package frc.tyros.auton;


import frc.tyros.movement.MoveForward;
import frc.tyros.movement.StopMoving;
import frc.tyros.movement.TurnRight;
import frc.tyros.movement.MoveRight;
import frc.tyros.subsystems.DriveTrain;
import frc.tyros.movement.StrafeRightMoveForward;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;


/**
 *
 */
public class LeftAutonCargoSide1Side2 extends CommandGroup {

    private DriveTrain driveTrain;

	public LeftAutonCargoSide1Side2(double timeout,DriveTrain driveTrain) {
        addSequential(new MoveRight(2, driveTrain, 0.5));
        addSequential(new MoveForward(0.5, driveTrain, 0.5));
        //place hatch
        addSequential(new MoveForward(0.5, driveTrain, -0.5));//backward
        addSequential(new TurnRight(0.5, driveTrain, 0.5));
        addSequential(new MoveForward(2, driveTrain, 0.5));
        //pick up hatch
        addSequential(new TurnRight(0.5, driveTrain, 0.5));
        addSequential(new MoveForward(2.5, driveTrain, 0.5));
        addSequential(new TurnRight(0.25, driveTrain, 0.5));
        addSequential(new MoveForward(0.5, driveTrain, 0.5));
        //place hatch
    }

    // Called just before this Command runs the first time
    
             //there are two ways to begin. You may either start at the edge of the platform facing forward and driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); and then driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); to drive up to side spot 1 and turn to face it
        //or you may start at the edge of the platform facing the direction you already need to be in and driveTrain.setMecanumDriveCommand(0, -0.5, 0, 0); //strafe to the spot 
        //driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up to spot, need prox and color sensor for reliability
            //place hatch
            //driveTrain.setMecanumDriveCommand(-0.2, 0, 0, 0); //back up
            //driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); //rotate 90 degrees toward human player
            //driveTrain.setMecanumDriveCommand(0.6, 0, 0, 0); //drive up to human player. need prox and color sensor for reliability
            //pick up hatch
            //driveTrain.setMecanumDriveCommand(0, 0, 0.5, 0); //to turn 180 degrees
            //driveTrain.setMecanumDriveCommand(0.7, 0, 0, 0); //to drive farther to spot 2. if you want to go straight to spot 3 instead perhaps the value would be 0.8.
            //driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); //to rotate toward cargo ship
            //driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up, need prox and color sensor for reliability
            //place hatch
}
