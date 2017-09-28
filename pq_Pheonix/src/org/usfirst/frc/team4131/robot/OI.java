package org.usfirst.frc.team4131.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4131.robot.commands.Climb;
import org.usfirst.frc.team4131.robot.commands.ExampleCommand;
import org.usfirst.frc.team4131.robot.commands.ExpelGear;
import org.usfirst.frc.team4131.robot.commands.ExtendPocket;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {


	
	//see constrain at bottom
	private Joystick leftStick = new Joystick(RobotMap.LEFT_JOYSTICK);
	public double getLeftSpeed() {return constrain(leftStick.getRawAxis(1));}
	
	private Joystick rightStick = new Joystick(RobotMap.RIGHT_JOYSTICK);
	public double getRightSpeed() {return constrain(rightStick.getRawAxis(1));}
	
	private Joystick auxStick = new Joystick(RobotMap.AUX_JOYSTICK);
	
	//
	private JoystickButton extendGear = new JoystickButton(rightStick, 5);
	private JoystickButton expelGear= new JoystickButton(rightStick, 1);
	
	private JoystickButton climb = new JoystickButton(auxStick, 6);
	
	
	public OI() {
		
		//help me
		extendGear.whileHeld(new ExtendPocket(true));
		extendGear.whenReleased(new ExtendPocket(false));
		
		expelGear.whileHeld(new ExpelGear(true));
		expelGear.whenReleased(new ExpelGear(false));
		
		climb.whileHeld(new Climb());
		
	}

	
	
	private double constrain(double value){
		return Math.max(-1, Math.min(1, value));
	}
}
