/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.tyros;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.CameraServer;
import frc.tyros.commands.RaiseElevator;
import frc.tyros.commands.RetractSol;
import frc.tyros.auton.AutonOverride;
import frc.tyros.commands.Climb;
import frc.tyros.commands.ExtendSol;
import frc.tyros.commands.LiftIngestor;
import frc.tyros.commands.LowerIngestor;
import frc.tyros.commands.RunIngestor;
import frc.tyros.subsystems.DriveTrain;
import frc.tyros.subsystems.Elevator;
import frc.tyros.subsystems.Ingestor;
import frc.tyros.commands.AntiClockwiseTurn;
import frc.tyros.commands.ClockwiseTurn;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  private XboxController gamePad1, gamePad2;
  private JoystickButton buttonY1, buttonX1, buttonA1, buttonB1, buttonLB1, buttonBack1, buttonRB1, buttonStart1,
      buttonClickLeft1, buttonClickRight1, buttonLT1, buttonRT1, buttonY2, buttonX2, buttonA2, buttonB2, buttonLB2,
      buttonBack2, buttonRB2, buttonStart2, buttonClickLeft2, buttonClickRight2, buttonLT2, buttonRT2;
  private CameraServer camera;
  private Elevator elevator;
  private DriveTrain driveTrain;
  private Ingestor ingestor;

  public OI() {
    gamePad1 = new XboxController(0);
    gamePad2 = new XboxController(0);

    buttonA1 = new JoystickButton(gamePad1, 1);// Run ingestor inward
    buttonB1 = new JoystickButton(gamePad1, 2);// Run ingestor outward
    buttonX1 = new JoystickButton(gamePad1, 3);// Flip up ingestor (to pick up hatches)
    buttonY1 = new JoystickButton(gamePad1, 4);// Put down ingestor
    buttonLB1 = new JoystickButton(gamePad1, 5);// Deploy hatch
    buttonRB1 = new JoystickButton(gamePad1, 6);// Shoot ball
    buttonBack1 = new JoystickButton(gamePad1, 7);// Auton Override
    buttonStart1 = new JoystickButton(gamePad1, 8);
    buttonClickLeft1 = new JoystickButton(gamePad2, 9);// Rotate 90° Anticlockwise (? QOL)
    buttonClickRight1 = new JoystickButton(gamePad1, 10);// Rotate 90° Clockwise (? QOL)
    buttonLT1 = new JoystickButton(gamePad1, 11);
    buttonRT1 = new JoystickButton(gamePad1, 12);

    buttonA2 = new JoystickButton(gamePad2, 1);// Elevator to Level 3 (To shoot ball into cargo ship)
    buttonB2 = new JoystickButton(gamePad2, 2);// Elevator to Level 1 (Bottom hatch for rocket and cargo)
    buttonX2 = new JoystickButton(gamePad2, 3);// Elevator to Level 2 (Bottom rocket port)
    buttonY2 = new JoystickButton(gamePad2, 4);// Climb
    buttonLB2 = new JoystickButton(gamePad2, 5);// Elevator to Level 4 (Middle rocket hatch)
    buttonRB2 = new JoystickButton(gamePad2, 6);// Elevator to Level 5 (Middle rocket port)
    buttonBack2 = new JoystickButton(gamePad2, 7);// AutonOverride
    buttonStart2 = new JoystickButton(gamePad2, 8);
    buttonClickLeft2 = new JoystickButton(gamePad2, 9);
    buttonClickRight2 = new JoystickButton(gamePad2, 10);
    buttonLT2 = new JoystickButton(gamePad2, 11);// Elevator to Level 6 (Top rocket hatch)
    buttonRT2 = new JoystickButton(gamePad2, 12);// Elevator to Level 7 (Top rocket port)
    CameraServer.getInstance().startAutomaticCapture();

  }

  public XboxController getGamePad() {
    return null;
  }

  public void Init() {
    buttonA1.whenPressed(new RunIngestor(this, -0.5)); // run ingestor inward
    buttonB1.whenPressed(new RunIngestor(this, 0.5)); // run ingestor outward
    buttonX1.whenPressed(new LiftIngestor(this)); // put ingestor up to pick up hatches
    buttonY1.whenPressed(new LowerIngestor(this)); // put ingestor back down
    buttonClickLeft1.whenPressed(new AntiClockwiseTurn(0.26, driveTrain)); // rotate left 90 deg
    buttonClickRight1.whenPressed(new ClockwiseTurn(0.26, driveTrain)); // rotate right 90 deg
    buttonLB1.whenPressed(new ExtendSol(this));
    buttonRB1.whenPressed(new RetractSol(this));
    buttonBack1.whileHeld(new AutonOverride(this));
    buttonA2.whenPressed(new RaiseElevator(this, 80)); // ballCargoShip
    buttonX2.whenPressed(new RaiseElevator(this, 48)); // hatchRocketandCargoShip
    buttonB2.whenPressed(new RaiseElevator(this, 70)); // ballLowRocketShip
    buttonLB2.whenPressed(new RaiseElevator(this, 119)); // hatchMidRocketShip
    buttonLT2.whenPressed(new RaiseElevator(this, 141)); // ballMidRocketShip
    buttonRT2.whenPressed(new RaiseElevator(this, 190)); // hatchTopRocketShip
    buttonRB2.whenPressed(new RaiseElevator(this, 212)); // ballTopRocketShip
    buttonBack2.whenPressed(new AutonOverride(this));
    buttonY2.whileHeld(new Climb(this));
  }

  public Elevator getElevator() {
    return elevator;
  }

  public void setElevator() {
    this.elevator = elevator;
  }

  public Ingestor getIngestor() {
    return ingestor;
  }
}

//// CREATING BUTTONS
// One type of button is a joystick button which is any button on a
//// joystick.
// You create one by telling it which joystick it's on and which button
// number it is.
// Joystick stick = new Joystick(port);
// Button button = new JoystickButton(stick, buttonNumber);

// There are a few additional built in buttons you can use. Additionally,
// by subclassing Button you can create custom triggers and bind those to
// commands the same as any other Button.

//// TRIGGERING COMMANDS WITH BUTTONS
// Once you have a button, it's trivial to bind it to a button in one of
// three ways:

// Start the command when the button is pressed and let it run the command
// until it is finished as determined by it's isFinished method.
// button.whenPressed(new ExampleCommand());

// Run the command while the button is being held down and interrupt it once
// the button is released.
// button.whileHeld(new ExampleCommand());

// Start the command when the button is released and let it run the command
// until it is finished as determined by it's isFinished method.
// button.whenReleased(new ExampleCommand());