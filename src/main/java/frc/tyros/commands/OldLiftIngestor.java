package frc.tyros.commands;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import frc.tyros.OI;
import frc.tyros.subsystems.Ingestor;

public class OldLiftIngestor extends Command {
private double liftSpeed;
public OldLiftIngestor(OI oi, double d) {
    //requires(ingestor)
    this.liftSpeed = liftSpeed;
}

protected void initialize() {
    	
}

// Called repeatedly when this Command is scheduled to run
protected void execute() {

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