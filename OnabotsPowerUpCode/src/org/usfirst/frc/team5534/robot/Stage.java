package org.usfirst.frc.team5534.robot;

public class Stage {
	
	public static double AutonStartTime;
	public static double AutonFinalTime;
	
	public static double StageStartTime;
	public static double StageStartDistance;
	
	public static int Number;
	public static boolean ReadyToAdvance;
	
	
	public static void Init() {
	
		AutonStartTime = System.currentTimeMillis();
		StageStartTime = AutonStartTime;
		Number = 0;
		
	}
	
	public static void Next() {
		if ( ReadyToAdvance == true ) {
			StageStartDistance = Navigation.GetDistance();
			StageStartTime = System.currentTimeMillis();
			Number++;
		}
	}

	public static void Reset() {
		ReadyToAdvance = true;
	}
	
	public static void Last() {
		ReadyToAdvance = false;
	}
	
	// ===
	
	public static double GetAutonDuration() {
		return ( System.currentTimeMillis() - AutonStartTime ) / 1000.0;
	}
	
	public static double GetStageTime() {
		return ( System.currentTimeMillis() - StageStartTime ) / 1000.0;
	}
	
	public static double GetStageDistance() {
		return Navigation.GetDistance() - StageStartDistance;
	}
	
	// ===
	
	public static void StopBeyondFowardDistance( double distance ) {
		if ( GetStageDistance() < distance ) {
			ReadyToAdvance = false; 
		}
		else {
			Drivetrain.Stop();
		}
	}
	
	public static void StopBeyondReverseDistance ( double distance ) {
		if ( GetStageDistance() > -distance ) {
			ReadyToAdvance = false;
		}
		else {
			Drivetrain.Stop();
		}
	}
	
	
	
}
