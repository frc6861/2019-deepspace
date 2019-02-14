package frc.tyros.commands;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import frc.tyros.OI;
import frc.tyros.subsystems.Ingestor;

public class RunIngestor extends Command {
private double ingestorSpeed;
private Ingestor ingestor;
public RunIngestor(OI m_oi, double ingestorSpeed) {
    requires(ingestor);
    this.ingestor = m_oi.getIngestor();
    this.ingestorSpeed = ingestorSpeed;

}

protected void initialize() {
    	
}

// Called repeatedly when this Command is scheduled to run
protected void execute() {
    ingestor.driveMotors(ingestorSpeed);
}

//  Make this return true when this Command no longer needs to run execute()
protected boolean isFinished() {
    return false;
}

// Called once after isFinished returns true
protected void end() {
    ingestor.driveMotors(0);
}

// Called when another command which requires one or more of the same
// subsystems is scheduled to run
protected void interrupted() {
}
}