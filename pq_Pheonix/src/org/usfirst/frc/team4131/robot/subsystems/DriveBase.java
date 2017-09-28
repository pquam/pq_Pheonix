package org.usfirst.frc.team4131.robot.subsystems;

import org.usfirst.frc.team4131.robot.RobotMap;
import org.usfirst.frc.team4131.robot.commands.Move;

import edu.wpi.first.wpilibj.Talon;

public class DriveBase {

	
	private Talon[] leftMotor, rightMotor;
	
	public DriveBase() {
		
		//left motor
		leftMotor = new Talon[2];
		leftMotor[0] = new Talon(RobotMap.DRIVE_LEFT[0]);
		leftMotor[1] = new Talon(RobotMap.DRIVE_LEFT[1]);
		//leftMotor.setInverted(RobotMap.DRIVE_LEFT_INVERTED);
		
		//right motor
		rightMotor = new Talon[2];
		rightMotor[0] = new Talon(RobotMap.DRIVE_RIGHT[0]);
		rightMotor[1] = new Talon(RobotMap.DRIVE_RIGHT[1]);
		//rightMotor.setInverted(RobotMap.DRIVE_RIGHT_INVERTED);
	}
	
	protected void initDefaultCommand(){
		//setDefaultCommand(new Move());
	}
	
	public void move(double left, double right) {
		
		leftMotor[0].set(left);
		rightMotor[0].set(right);
		
		leftMotor[1].set(left);
		rightMotor[1].set(right);
	}

	public void resetAngle() {
		// TODO Auto-generated method stub
		
	}

	public void resetDistance() {
		// TODO Auto-generated method stub
		
	}
}
