package org.usfirst.frc.team4131.robot.subsystems;

import org.usfirst.frc.team4131.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class GearClaw {

	
	private DoubleSolenoid solenoid = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.GEAR_CLAW1, RobotMap.GEAR_CLAW2);
	
	protected void initDefaultCommand(){
		
	}
	public void open(){
		solenoid.set(DoubleSolenoid.Value.kForward);
	}
	public void close(){
		solenoid.set(DoubleSolenoid.Value.kReverse);
	}
}
