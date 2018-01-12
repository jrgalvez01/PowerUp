package org.usfirst.frc.team5534.robot;

public class Onabots {

	public static void Init() {
		Drivetrain.Init();
		Navigation.Init();
	}
	
	public static void Periodic() {
		Drivetrain.Periodic();
		Elevator.Periodic();
	}
}
