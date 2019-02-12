package frc.tyros.commands;

import frc.tyros.subsystems.DriveTrain;
import frc.tyros.subsystems.Elevator;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import frc.tyros.OI;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.tyros.commands.MoveElevatorUp;
import frc.tyros.commands.MoveElevatorDown;
import frc.tyros.commands.StopElevator;
/**
 *
 */
public class RaiseElevator extends CommandGroup {
    private Elevator elevator;
    private Encoder enc;
    private XboxController gamePad;
    private double pos;
    
    public RaiseElevator(OI m_oi, double pos) {
        this.elevator=m_oi.getElevator();
        this.pos = pos;
        this.enc = enc;

        int count = enc.get();
        double distance = enc.getDistance();
        double rate = enc.getRate();
        boolean direction = enc.getDirection();
         requires(elevator);
    

        while(pos-elevator.getcurrentPos()>0){
            addSequential(new MoveElevatorUp(0.045, elevator));
            addSequential(new StopElevator(0.005, elevator));
        }
        while(pos-elevator.getcurrentPos()<0){
            addSequential(new MoveElevatorDown(0.045, elevator));
            addSequential(new StopElevator(0.005, elevator));
        }
        addSequential(new MoveElevatorUp(0.5, elevator));
        addSequential(new StopElevator(0.1, elevator));
        //DOUBLE CHECK TRUE HEIGHT OF BALL AT BOTTOM OF ELEVATOR
        /*Use Versaplanetary encoders to make this work*/
    }
}