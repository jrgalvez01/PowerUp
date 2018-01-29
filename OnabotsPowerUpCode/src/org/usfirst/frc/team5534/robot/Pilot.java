package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Pilot {

	public static Joystick DriveStick = new Joystick( Ports.DriveStick );
	
	public static void Init() {
	
		//Navigation.reset();
		
	}
	
	public static void Periodic() {
		
		
		
	}
	
	public static void Galvez() {
		
	}
	
	
	public static void Steensma() {
		double PowerD = DriveArcade.GetThrust();
		double PowerT = DriveArcade.GetTurn();
		Drivetrain.DriveArcade( PowerD, PowerT );

	}
	
	
	
}
