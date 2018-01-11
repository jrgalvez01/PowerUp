package org.usfirst.frc.team5534.robot;

public class ModeTeleop {

	
	public static void Init() {
		
	}
	
	public static void Periodic() {
	
		double PowerD = DriveArcade.GetThrust();
		double PowerT = DriveArcade.GetTurn();
		Drivetrain.DriveArcade( PowerD, PowerT );
	}
	
}
