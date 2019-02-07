package frc.tyros.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.XboxController;

import frc.tyros.OI;


/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Ingestor extends Subsystem {
  private WPI_TalonSRX IngestorLeft;
  private WPI_TalonSRX IngestorRight;
  private Compressor compressor;
  private Solenoid solenoidW1;
  private Solenoid solenoidW2;

  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  public static void Ingestor() {
    compressor = new Compressor(0);
    leftMotor = new WPI_TalonSRX(13);
    rightMotor = new WPI_TalonSRX(2);
    


    boolean doubleK;
    boolean enabled = compressor.enabled();
    boolean pressureSwitch = compressor.getPressureSwitchValue();
    double current = compressor.getCompressorCurrent();
    DoubleSolenoid solenoidW = new DoubleSolenoid(1,2);
    boolean left = new getLeftSolenoid();
    boolean right = new getRightSolenoid();
    
    SolenoidW(port, port); {
      boolean doubleK = true;
      left = new Solenoid(slot, port1);
      right = new Solenoid(slot, port2);
      System.out.println("Double MySolenoid enabled on ports " + port1 + " and " + port2 + "");
    }

    extend(); {
      left.set(true);
      right.set(true);

      if(doubleK) {
        left.set(false);
        right.set(false);
      }
    }

    retract(); {
      left.set(false);
      right.set(false);

      if(doubleK) {
        left.set(true);
        right.set(true);
      }
    }
  
  
    
    public boolean getLeftSolenoid() {
      return left.get();
    }

    public boolean getRightSolenoid() {
      boolean otherLeft = right.get();
      return right.get();
    }

  }
   

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

  }
}
