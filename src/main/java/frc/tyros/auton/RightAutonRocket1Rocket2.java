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
public class RightAutonRocket1Rocket2 extends CommandGroup {

    private DriveTrain driveTrain;

	public RightAutonRocket1Rocket2(double timeout,DriveTrain driveTrain) {
        addSequential(new MoveRight(2, driveTrain, -0.5));//left
        addSequential(new TurnRight(0.125, driveTrain, -0.5));//left
        addSequential(new MoveForward(0.5, driveTrain, 0.5));
        //addSequential(new ExtendSolFront());
        //addSequential(new RetractSolFront());
        addSequential(new MoveForward(0.5, driveTrain, -0.5));//backward
        addSequential(new TurnRight(0.375, driveTrain, 0.5));
        addSequential(new MoveForward(2, driveTrain, 0.5));
        //pick up hatch
        addSequential(new TurnRight(0.25, driveTrain, -0.5));//turn left
        addSequential(new MoveRight(2.5, driveTrain, -0.5));//left
        addSequential(new TurnRight(0.125, driveTrain, 0.5));
        addSequential(new MoveForward(0.5, driveTrain, 0.5));
        //addSequential(new ExtendSolFront());
        //addSequential(new RetractSolFront());
    }

        //there are two ways to begin. You may either start at the edge of the platform facing forward and driveTrain.setMecanumDriveCommand(0.3, 0, 0, 0); and then driveTrain.setMecanumDriveCommand(0.3, 0.4, 0, 0); to drive up to rocket and turn to face it 45 deg with driveTrain.setMecanumDrive(0, 0, -0.125, 0);
        //or you may start at the edge of the platform facing the the side of the field driveTrain.setMecanumDriveCommand(0, 0.5, 0, 0); /*strafe to the spot then */ driveTrain.setMecanumDriveCommand(0, 0, 0.125, 0); //rotate 45 deg to the cargo spot
        //driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up to spot, need prox and color sensor for reliability
        //place hatch
        //driveTrain.setMecanumDriveCommand(-0.2, 0, 0, 0); //back up
        //driveTrain.setMecanumDriveCommand(0, 0, -0.375, 0); //rotate 135 degrees toward human player
        //driveTrain.setMecanumDriveCommand(0.6, 0, 0, 0); //drive up to human player. need prox and color sensor for reliability
        //pick up hatch
        //driveTrain.setMecanumDriveCommand(0, 0, 0.25, 0); //to turn 90 degrees back facing the side of the field
        //driveTrain.setMecanumDriveCommand(0, 0.6, 0, 0); //to strafe to other side of cargo
        //driveTrain.setMecanumDriveCommand(0, 0, -0.125, 0); //to rotate toward rocket spot
        //driveTrain.setMecanumDriveCommand(0.2, 0, 0, 0); //to line up, need prox and color sensor for reliability
        //place hatch

}
