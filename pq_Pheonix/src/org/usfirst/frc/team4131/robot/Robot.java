
package org.usfirst.frc.team4131.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import org.usfirst.frc.team4131.robot.subsystems.Climber;
import org.usfirst.frc.team4131.robot.subsystems.DriveBase;
import org.usfirst.frc.team4131.robot.subsystems.GearClaw;
import org.usfirst.frc.team4131.robot.subsystems.GearPocket;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	//subsystems
	public static final DriveBase drive = new DriveBase();
	public static final GearPocket gearPocket = new GearPocket();
	public static final GearClaw gearClaw = new GearClaw();
	public static final Climber climber = new Climber();
	public static OI OI = new OI();
	
	//electronics
	public static final Compressor compressor = new Compressor(RobotMap.PCM_ID);
	
	private SendableChooser<Command> auton = new SendableChooser<>();
	private Command autonomousCommand = null;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		
		drive.resetAngle();
		drive.resetDistance();
		compressor.clearAllPCMStickyFaults();
		compressor.setClosedLoopControl(true);
		
		//add auton command
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
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		drive.resetAngle();
		drive.resetDistance();
		autonomousCommand = auton.getSelected();
		if(autonomousCommand != null) autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		
		if(autonomousCommand != null) autonomousCommand.cancel();
		gearClaw.close();
		gearPocket.retract();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
