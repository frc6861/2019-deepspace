package frc.tyros.auton;

import frc.tyros.movement.MoveBackward;
import frc.tyros.movement.MoveForward;
import frc.tyros.movement.StopMoving;
import frc.tyros.movement.TurnRight;
import frc.tyros.movement.TurnLeft;
import frc.tyros.movement.MoveLeft;
import frc.tyros.movement.MoveRight;
import frc.tyros.subsystems.DriveTrain;
import frc.tyros.movement.StrafeLeftMoveForward;
import frc.tyros.movement.StrafeRightMoveForward;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftAutonCargoMid1CargoSide1 extends CommandGroup {

    private DriveTrain driveTrain;

	public LeftAutonCargoMid1CargoSide1(double timeout,DriveTrain driveTrain) {
        addSequential(new MoveForward(2, driveTrain));
        addSequential(new StopMoving(0.01, driveTrain));
        //use mechanism to push hatch "DispenseTimed or whatever"
        addSequential(new MoveBackward(2, driveTrain));
        addSequential(new StopMoving(0.01, driveTrain));
        addSequential(new TurnRight(0.5, driveTrain));
        addSequential(new MoveRight(0.5, driveTrain));
        addSequential(new MoveForward(3, driveTrain));
        //use mechanism to pick up hatch
        addSequential(new TurnRight(0.5, driveTrain));
        addSequential(new MoveForward(4, driveTrain));
        addSequential(new TurnRight(0.25, driveTrain));
        addSequential(new MoveForward(0.5, driveTrain));
        //use mechanism to push hatch
        
    }

    
 /*protected void execute() {
    driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); //I believe the first value was forward at 50%.
    driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); // Use color sensor code to follow white line 
    driveTrain.setMecanumDriveCommand(0, 0, 0, 0); //if(proximity sensor detects cargo ship == true) 
    //use mechanism to push hatch
    driveTrain.setMecanumDriveCommand(-0.5, 0, 0, 0); //Use color sensor to follow white line until it no longer sees it
    driveTrain.setMecanumDriveCommand(0, 0, 0.5, 0); //to rotate 180 degrees
    driveTrain.setMecanumDriveCommand(0, 0.5, 0, 0); //to strafe and align with human player
    driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); //to drive up to human player. Will need to use color sensor and prox sensor for reliability
    //pick up the hatch
    driveTrain.setMecanumDriveCommand(0, 0, 0.5, 0); //to rotate 180 degrees
    driveTrain.setMecanumDriveCommand(0.7, 0, 0, 0); //to get to side 1 spot
    driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); //to rotate 90 degrees toward cargo ship
    driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up, need color and prox sensor for reliability
    //use mechanism to push hatch
*/
}
