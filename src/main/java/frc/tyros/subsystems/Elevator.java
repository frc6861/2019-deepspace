package frc.tyros.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Elevator extends Subsystem {
  private WPI_TalonSRX elevatorMotor;
  private int ballCargoShip = 80; //80 cm from carpet
  private int hatchRocketandCargoShip = 48; //48 cm from carpet default bottom height
  private int ballLowRocketShip = 70; //70 cm from carpet
  private int hatchMidRocketShip = 119; //119 cm from carpet
  private int ballMidRocketShip = 141; //141 cm from carpet
  private int hatchTopRocketShip = 190; //190 cm from carpet
  private int ballTopRocketShip = 212; //212 cm from carpet
  
  // here. Call these fro

  public Elevator(){
    elevatorMotor = new WPI_TalonSRX(12);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

  }

  public void driveElevator(double speed) {
    elevatorMotor.set(speed);
  }

}