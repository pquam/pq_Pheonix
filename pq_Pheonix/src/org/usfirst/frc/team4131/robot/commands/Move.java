package org.usfirst.frc.team4131.robot.commands;

import org.usfirst.frc.team4131.robot.Robot;

public class Move {

	
	public Move() {
		
		//requires(Robot.drive);
	}
	
	protected void init() {}
	
	public void execute() {
		
		Robot.drive.move(Robot.OI.getLeftSpeed(), Robot.OI.getRightSpeed());
	}
	
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		Robot.drive.move(0, 0);
	}
	protected void interrupted() {
		Robot.drive.move(0, 0);
	}
}
