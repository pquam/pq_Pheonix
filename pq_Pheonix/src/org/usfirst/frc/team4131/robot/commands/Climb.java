package org.usfirst.frc.team4131.robot.commands;

import org.usfirst.frc.team4131.robot.Robot;

public class Climb {

	
	public Climb() {
		//requires(Robot.climber);
	}
	protected void initialize(){
		
	}
	protected void execute(){
		Robot.climber.climb();
	}
	protected boolean isFinished() {
		return false;
	}
	protected void end(){
		Robot.climber.stop();
	}
	protected void interrupted(){
		Robot.climber.stop();
	}
}
