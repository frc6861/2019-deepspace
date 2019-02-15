package frc.tyros.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.tyros.OI;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;


 //An example subsystem. You can replace me with your own Subsystem.
 
public class Elevator extends Subsystem {
  private WPI_TalonSRX elevatorMotor;
  private Encoder enc;
  private int ballCargoShip = 80; //80 cm from carpet
  private int hatchRocketandCargoShip = 48; //48 cm from carpet default bottom height
  private int ballLowRocketShip = 70; //70 cm from carpet
  private int hatchMidRocketShip = 119; //119 cm from carpet
  private int ballMidRocketShip = 141; //141 cm from carpet
  private int hatchTopRocketShip = 190; //190 cm from carpet
  private int ballTopRocketShip = 212; //212 cm from carpet

  // here. Call these fro

  public Elevator(OI m_oi){
    elevatorMotor = new WPI_TalonSRX(12);
    enc = new Encoder(0, 1, false, Encoder.EncodingType.k4X); //channel not final
    enc.setMaxPeriod(0.1);
    enc.setMinRate(10);
    enc.setDistancePerPulse(5);
    enc.setReverseDirection(true);
    enc.setSamplesToAverage(7);

    enc.reset();
  }
  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

  }

  public void driveElevator(double speed) /*Use Versaplanetary encoders to make this work*/{
    //depending on what button is pressed, speed = variable;
    elevatorMotor.set(speed);
  }


public double getcurrentPos() {
	return 0;
}

}