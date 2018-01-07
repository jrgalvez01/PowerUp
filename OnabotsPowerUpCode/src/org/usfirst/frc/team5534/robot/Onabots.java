package org.usfirst.frc.team5534.robot;

public class Onabots {

	public static void Init() {
		
	}
	
	public static void Periodic() {
		Drivetrain.Periodic();
		Elevator.Periodic();
	}
}
