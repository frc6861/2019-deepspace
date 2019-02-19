package frc.tyros.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.tyros.OI;
import frc.tyros.subsystems.Ingestor;
import frc.tyros.commands.ExtendSolBall;
import frc.tyros.commands.RetractSolBall;

public class DeployBall extends CommandGroup {
    private Ingestor ingestor;
//private OI m_oi;
//this.m_oi = m_oi;

public DeployBall(OI m_oi) {

}

protected void initialize() {

}

// Called repeatedly when this Command is scheduled to run
protected void execute() {
    this.ingestor=ingestor;
    addSequential(new RunIngestorTimed(2, ingestor, 0.5));
    //addParallel(new ExtendSolBall());
    //addSequential(new RetractSolBall());
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