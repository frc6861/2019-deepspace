package frc.tyros.commands;

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

public class ClockwiseTurn extends CommandGroup {

    private DriveTrain driveTrain;

	public ClockwiseTurn(double timeout,DriveTrain driveTrain) {
        addSequential(new TurnRight(0.25, driveTrain));
        addSequential(new StopMoving(0.01, driveTrain));
    }
}