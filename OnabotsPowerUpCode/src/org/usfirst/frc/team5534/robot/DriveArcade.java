package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.Joystick;

public class DriveArcade {

	public static Joystick DriveStick = new Joystick( Ports.DriveStick );
	
	public static double GetThrust() {
		
		System.out.println( -DriveStick.getY());
		return -DriveStick.getY();
	}
	
	public static double GetTurn() {
		
		return DriveStick.getTwist();
		
	}
}
