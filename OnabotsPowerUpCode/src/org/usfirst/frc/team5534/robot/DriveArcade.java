package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.XboxController;

public class DriveArcade {

	public static Joystick DriveStick = new Joystick( Ports.DriveStick );
	
	public static double GetThrust() {
		
		return -DriveStick.getY();
	}
	
	public static double GetTurn() {
		
		return DriveStick.getX()/3;
		
	}
}
