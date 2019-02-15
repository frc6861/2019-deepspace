package frc.tyros.auton;
import frc.tyros.movement.StopMoving;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.tyros.OI;

public class AutonOverride extends Command {
public AutonOverride(OI m_oi) {
}

protected void initialize() {
    	
}

// Called repeatedly when this Command is scheduled to run
protected void execute() {
    Scheduler.getInstance().removeAll();
    //UNSURE IF CORRECT! DO NOT TRUST IT JUST YET!
}

//  Make this return true when this Command no longer needs to run execute()
protected boolean isFinished() {
    return false;
}

// Called once after isFinished returns true
protected void end() {
}

// Called when another command which requires one or more of the same
// subsystems is scheduled to run
protected void interrupted() {
}
}