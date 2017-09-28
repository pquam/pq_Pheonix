package org.usfirst.frc.team4131.robot.commands;

import org.usfirst.frc.team4131.robot.Robot;

public class ExtendPocket {

		private boolean extend;
		public ExtendPocket(boolean extend){
			//requires(Robot.gearPocket);
			this.extend = extend;
		}
		protected void execute(){
			if(extend) Robot.gearPocket.extend();
			else Robot.gearPocket.retract();
		}
		protected boolean isFinished(){return true;}
}
