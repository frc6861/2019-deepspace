package frc.tyros.subsystems;

import edu.wpi.first.wpilibj.Spark;


import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Ingestor extends Subsystem {
    private Spark ingestorLeft;
    private Spark ingestorRight;

    public Ingestor() {
        ingestorLeft = new Spark(13);
        ingestorRight = new Spark(2);
    }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    }
    public void driveIngestor(double speed) {
        ingestorLeft.set(speed);
        ingestorRight.set(-speed);
    }


}


