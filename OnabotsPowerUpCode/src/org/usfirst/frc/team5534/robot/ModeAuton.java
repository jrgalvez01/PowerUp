package org.usfirst.frc.team5534.robot;

public class ModeAuton {

	public static void Init() {
		Drivetrain.Stop();
		
		Navigation.Reset();
	
		Stage.Init();
	}
	
	public static void Periodic() {
		Stage.Reset();
		switch ( Potentiometer.autonSelected ) {

		case Potentiometer.LeftStation : Station.Baseline();		break;
		case Potentiometer.DoNothing : Station.DoNothing(); 		break;
		//case Potentiometer.MiddleStation: 						break;
		//case Potentiometer.RightStation:							break;
		

		default: break;
		
		}
		
	}
}
