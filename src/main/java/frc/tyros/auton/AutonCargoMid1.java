package frc.tyros.auton;


import frc.tyros.commands.ExtendSolFront;
import frc.tyros.commands.RetractSolFront;
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
          //addSequential(new ExtendSolFront());
          //addSequential(new RetractSolFront());
          addSequential(new MoveForward(2, driveTrain, -0.5));//move backward

    	
     }
}
