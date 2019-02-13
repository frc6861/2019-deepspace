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
public class AutonCargoMid1 extends CommandGroup {

    private DriveTrain driveTrain;

	public AutonCargoMid1(double timeout,DriveTrain driveTrain) {
   

    
          addSequential(new MoveForward(2, driveTrain, 0.5));
          //addSequential(new StopMoving(0.01, driveTrain));
          //use mechanism to push hatch "DispenseTimed or whatever"
          addSequential(new MoveForward(2, driveTrain, -0.5));//move backward
          //addSequential(new StopMoving(0.01, driveTrain));

        /*driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); //I believe the first value was forward at 50%.
            driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); // Use color sensor code to follow white line 
            driveTrain.setMecanumDriveCommand(0, 0, 0, 0); //if(proximity sensor detects cargo ship == true) 
            //Use mechanism to push hatch;
            driveTrain.setMecanumDriveCommand(-0.5, 0, 0, 0); //Use color sensor to follow white line until it no longer sees it
            driveTrain.setMecanumDriveCommand(0, 0, 0, 0); //to stop*/
    	
     }
}
