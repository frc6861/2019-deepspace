/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.tyros;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.tyros.subsystems.DriveTrain;
import frc.tyros.subsystems.Elevator;
import frc.tyros.subsystems.Ingestor;
import frc.tyros.auton.AutonOverride;
import frc.tyros.commands.Climb;
import frc.tyros.commands.Drive;
import frc.tyros.commands.LiftIngestor;
import frc.tyros.commands.RaiseElevator;
import frc.tyros.commands.RunIngestor;
import frc.tyros.auton.AutonCargoMid1;
import frc.tyros.auton.LeftAutonCargoMid1CargoSide1;
import frc.tyros.auton.LeftAutonCargoMid1Mid2;
import frc.tyros.auton.LeftAutonCargoSide1Rocket1;
import frc.tyros.auton.LeftAutonCargoSide1Side2;
import frc.tyros.auton.LeftAutonRocket1Rocket2;
import frc.tyros.auton.RightAutonCargoMid1CargoSide1;
import frc.tyros.auton.RightAutonCargoMid1Mid2;
import frc.tyros.auton.RightAutonCargoSide1Rocket1;
import frc.tyros.auton.RightAutonCargoSide1Side2;
import frc.tyros.auton.RightAutonRocket1Rocket2;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  //private ExampleSubsystem m_subsystem = new ExampleSubsystem();
  private OI m_oi;
  private DriveTrain driveTrain; 
  private Elevator elevator;
  private Ingestor ingestor;
  

  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();
  
  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    m_oi = new OI();
    driveTrain = new DriveTrain(m_oi);
    elevator = new Elevator(m_oi);
    ingestor = new Ingestor(m_oi);

    // chooser.addOption("My Auto", new MyAutoCommand());
    SmartDashboard.putData("Auto mode", m_chooser);
		m_chooser = new SendableChooser();
    m_chooser.addObject("LeftAutonCargoMid1CargoSide1", new LeftAutonCargoMid1CargoSide1(15,driveTrain));
    m_chooser.addObject("LeftAutonCargoMid1Mid2", new LeftAutonCargoMid1Mid2(15,driveTrain));
    m_chooser.addObject("LeftAutonCargoSide1Rocket1", new LeftAutonCargoSide1Rocket1(15,driveTrain));
    m_chooser.addObject("LeftAutonCargoSide1Side2", new LeftAutonCargoSide1Side2(15,driveTrain));
    m_chooser.addObject("LeftAutonRocket1Rocket2", new LeftAutonRocket1Rocket2(15,driveTrain));
    m_chooser.addObject("RightAutonCargoMid1CargoSide1", new RightAutonCargoMid1CargoSide1(15,driveTrain));
    m_chooser.addObject("RightAutonCargoMid1Mid2", new RightAutonCargoMid1Mid2(15,driveTrain));
    m_chooser.addObject("RightAutonCargoSide1Rocket1", new RightAutonCargoSide1Rocket1(15,driveTrain));
    m_chooser.addObject("RightAutonCargoSide1Side2", new RightAutonCargoSide1Side2(15,driveTrain));
    m_chooser.addObject("RightAutonRocket1Rocket2", new RightAutonRocket1Rocket2(15,driveTrain));
		m_chooser.addDefault("AutonCargoMid1", new AutonCargoMid1(15,driveTrain));
		SmartDashboard.putData("Autonomous mode chooser", m_chooser);
  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    
  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();
    

    /*
     * String autoSelected = SmartDashboard.getString("Auto Selector",
     * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
     * = new MyAutoCommand(); break; case "Default Auto": default:
     * autonomousCommand = new ExampleCommand(); break; }
     */

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
    
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
    
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }



  public DriveTrain getDriveTrain() {
		return driveTrain;
	}

	public void setDriveTrain(DriveTrain driveTrain) {
		this.driveTrain = driveTrain;
  }
  
  public Elevator getElevator() {
    return elevator;
  }

  public void setElevator(Elevator elevator) {
    this.elevator = elevator;
  }

  public Ingestor getIngestor() {
    return ingestor;
  }

  public void setIngestor(Ingestor ingestor) {
    this.ingestor = ingestor;
  }

	public OI getM_oi() {
		return m_oi;
	}

	public void setM_oi(OI m_oi) {
		this.m_oi = m_oi;
	}
}
