package org.usfirst.frc.team5534.robot;

public class Track {
	
	//CROSS BASELINE. The robot will drive straight until 
	//it crosses the baseline.
	
	public static void CrossBaseLine() {
	
		switch ( Stage.Number ) {
		
			case 0:
				AutoPilot.DriveStraight( 24 ); // 24 inches per second
				Stage.StopBeyondFowardDistance( 10.5 * 12 ); // 10.5 feet * 12 inches
				break;
		
			case 1:
				Drivetrain.Stop();
				break;
				
			default:
				Stage.Last();
				break;
		}
	}

}
