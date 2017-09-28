package org.usfirst.frc.team4131.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final int PDP_ID = 61, PCM_ID = 62;
	
	
	public static final int LEFT_JOYSTICK = 0;
	public static final int RIGHT_JOYSTICK = 1;
	public static final int AUX_JOYSTICK = 2;
	
	//Motors
		//drive
		public static final int DRIVE_LEFT[] = {2, 3};
		public static final int DRIVE_RIGHT[] = {5, 6};
		
		//climbing
		//Motors
		//public static final int CLIMBER[] = {};
		
		
		//solenoids
		public static final int GEAR_POCKET1 = 1;
		public static final int GEAR_POCKET2 = 7;
		public static final int GEAR_CLAW1 = 2;
		public static final int GEAR_CLAW2 = 3;
		
		//constants
		
		public static final int DRIVE_WHEEL_RADIUS = 2;
		public static final double DRIVE_WHEEL_CIRCUMFERENCE = 2 * Math.PI * DRIVE_WHEEL_RADIUS;
		public static final boolean DRIVE_LEFT_INVERTED = false, DRIVE_RIGHT_INVERTED = true;
}
