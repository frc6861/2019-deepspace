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
import frc.tyros.subsystems.Elevator;
import frc.tyros.commands.RaiseElevator;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  private  XboxController gamePad1, gamePad2;
  private JoystickButton buttonY,buttonX,buttonA,buttonB,buttonLB,buttonBack,buttonRB,buttonStart,buttonClickLeft,buttonClickRight,buttonLT,buttonRT;
	private CameraServer camera;
  
  public OI(){
    gamePad1 = new XboxController(0);
    gamePad2 = new XboxController(0);

    buttonA = new JoystickButton(gamePad1,1);//Run ingestor inward
    buttonB = new JoystickButton(gamePad1,2);//Run ingestor outward
    buttonX = new JoystickButton(gamePad1,3);//Flip up ingestor (to pick up hatches)
    buttonY = new JoystickButton(gamePad1,4);//Put down ingestor
    buttonLB = new JoystickButton(gamePad1,5);//Deploy hatch
    buttonRB = new JoystickButton(gamePad1,6);//Shoot ball
    buttonBack = new JoystickButton(gamePad1,7);//Auton Override
    buttonStart = new JoystickButton(gamePad1,8);
    buttonClickLeft = new JoystickButton(gamePad2,9);//Rotate 90° Anticlockwise (? QOL)
    buttonClickRight = new JoystickButton(gamePad1,10);//Rotate 90° Clockwise (? QOL)
    buttonLT = new JoystickButton(gamePad1,11);
    buttonRT = new JoystickButton(gamePad1,12);
    
    buttonA = new JoystickButton(gamePad2,1);//Elevator to Level 3 (To shoot ball into cargo ship)
    buttonB = new JoystickButton(gamePad2,2);//Elevator to Level 1 (Bottom hatch for rocket and cargo)
    buttonX = new JoystickButton(gamePad2,3);//Elevator to Level 2 (Bottom rocket port)
    buttonY = new JoystickButton(gamePad2,4);//Climb
    buttonLB = new JoystickButton(gamePad2,5);//Elevator to Level 4 (Middle rocket hatch)
    buttonRB = new JoystickButton(gamePad2,6);//Elevator to Level 5 (Middle rocket port)
    buttonBack = new JoystickButton(gamePad2,7);//AutonOverride
    buttonStart = new JoystickButton(gamePad2,8);
    buttonClickLeft = new JoystickButton(gamePad2,9);
    buttonClickRight = new JoystickButton(gamePad2,10);
    buttonLT = new JoystickButton(gamePad2,11);//Elevator to Level 6 (Top rocket hatch)
    buttonRT = new JoystickButton(gamePad2,12);//Elevator to Level 7 (Top rocket port)
    CameraServer.getInstance().startAutomaticCapture();


  }
  public XboxController getGamePad() {
		return null;
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