package frc.tyros.auton;

import frc.tyros.movement.MoveForward;
import frc.tyros.movement.StopMoving;
import frc.tyros.movement.TurnRight;
import frc.tyros.movement.MoveRight;
import frc.tyros.subsystems.DriveTrain;
import frc.tyros.movement.StrafeLeftMoveForward;
import frc.tyros.movement.StrafeRightMoveForward;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightAutonCargoMid1Mid2 extends CommandGroup {

    private DriveTrain driveTrain;

	public RightAutonCargoMid1Mid2(double timeout,DriveTrain driveTrain) {
        addSequential(new MoveForward(2, driveTrain, 0.5));
        addSequential(new StopMoving(0.01, driveTrain));
        //use mechanism to push hatch "DispenseTimed or whatever"
        addSequential(new MoveForward(2, driveTrain, -0.5));//backward
        addSequential(new StopMoving(0.01, driveTrain));
        addSequential(new TurnRight(0.5, driveTrain, -0.5));//turn left
        addSequential(new MoveRight(0.5, driveTrain, -0.5));//left
        addSequential(new MoveForward(3, driveTrain, 0.5));
        //use mechanism to pick up hatch
        addSequential(new TurnRight(0.5, driveTrain, -0.5));//turn left
        addSequential(new StrafeLeftMoveForward(2, driveTrain));
        addSequential(new MoveForward(0.5, driveTrain, 0.5));
        
        
    }



        /*    driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); //I believe the first value was forward at 50%.
            driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); // Use color sensor code to follow white line 
            driveTrain.setMecanumDriveCommand(0, 0, 0, 0); //if(proximity sensor detects cargo ship == true) 
            //use mechanism to push hatch
            driveTrain.setMecanumDriveCommand(-0.5, 0, 0, 0); //Use color sensor to follow white line until it no longer sees it
            driveTrain.setMecanumDriveCommand(0, 0, 0.5, 0); //to rotate 180 degrees
            driveTrain.setMecanumDriveCommand(0, 0.5, 0, 0); //to strafe and align with human player
            driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); //to drive up to human player. Will need to use color sensor and prox sensor for reliability
            //pick up the hatch
            driveTrain.setMecanumDriveCommand(0, 0, 0.5, 0); //to rotate 180 degrees
            driveTrain.setMecanumDriveCommand(0.6, 0.3, 0, 0); //to strafe to other middle spot
            driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up, need color sensor and prox sensor for reliability
        */    //use mechanism to push hatch
    	


}
