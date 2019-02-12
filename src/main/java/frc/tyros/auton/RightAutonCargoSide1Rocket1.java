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
public class RightAutonCargoSide1Rocket1 extends CommandGroup {

    private DriveTrain driveTrain;

	public RightAutonCargoSide1Rocket1(double timeout,DriveTrain driveTrain) {
        addSequential(new MoveRight(2, driveTrain, 0.5));
        addSequential(new MoveForward(0.5, driveTrain, 0.5));
        //place hatch
        addSequential(new MoveForward(0.5, driveTrain, -0.5));//backward
        addSequential(new TurnRight(0.5, driveTrain, -0.5));//turn left
        addSequential(new MoveForward(2, driveTrain, 0.5));
        //pick up hatch
        addSequential(new TurnRight(0.5, driveTrain, -0.5));//turn left
        addSequential(new MoveRight(1.5, driveTrain, -0.5));//left
        addSequential(new TurnRight(0.125, driveTrain, -0.5));//turn left
        addSequential(new MoveForward(0.5, driveTrain, 0.5));
        //place hatch
    }

        
        //there are two ways to begin. You may either start at the edge of the platform facing forward and driveTrain.setMecanumDriveCommand(0.5, 0, 0, 0); and then driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); to drive up to side spot 1 and turn to face it
        //or you may start at the edge of the platform facing the direction you already need to be in and driveTrain.setMecanumDriveCommand(0, -0.5, 0, 0); //strafe to the spot 
        //driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up to spot, need prox and color sensor for reliability
        //place hatch
        //driveTrain.setMecanumDriveCommand(-0.2, 0, 0, 0); //back up
        //driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); //rotate 90 degrees toward human player
        //driveTrain.setMecanumDriveCommand(0.6, 0, 0, 0); //drive up to human player. need prox and color sensor for reliability
        //pick up hatch
        //driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); //to turn 90 degrees toward side of field
        //driveTrain.setMecanumDriveCommand(0, 0.4, 0, 0); //to strafe toward rocket spot 1
        //driveTrain.setMecanumDriveCommand(0, 0, 0.125, 0); //to rotate 45 toward rocket spot 1
        //driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up, need prox and color sensor for reliability
        //place hatch

}
