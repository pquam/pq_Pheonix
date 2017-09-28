package org.usfirst.frc.team4131.robot.commands;

import org.usfirst.frc.team4131.robot.Robot;

public class ExpelGear {

	private boolean open;
	public ExpelGear(boolean open){
		//requires(Robot.gearClaw);
		this.open = open;
	}
	protected void execute(){
		if(open) Robot.gearClaw.open();
		else Robot.gearClaw.close();
	}
	protected boolean isFinished(){return true;}
}
