package org.usfirst.frc.team4131.robot.subsystems;

import org.usfirst.frc.team4131.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;

public class Climber {

	
	private Talon motor;
	public Climber(){
		
		//figure this out
		motor = new Talon(RobotMap.CLIMBER_MOTOR1);
		Talon motor2 = new Talon(RobotMap.CLIMBER_MOTOR2);
		motor2.changeControlMode(TalonControlMode.Follower);
		motor2.set(RobotMap.CLIMBER_MOTOR1);
	}
	protected void initDefaultCommand(){}
	public void engage(){
		motor.set(0.5);
	}
	public void climb(){
		motor.set(1);
	}
	public void stop(){
		motor.set(0);
	}
	public void reverse(){
		motor.set(-0.7);
	}
}
