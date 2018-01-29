package org.usfirst.frc.team5534.robot;

public class AutoPilot {

	public static double LastPowerD = 0;
	public static double LastPowerT = 0;
	
	public static double LastHeading = 0;
	
	public static void AdjustDriveSpeed( double Speed ) {
		double error = Speed - Navigation.GetDriveSpeed();
		LastPowerD  += error * 0.0001;
	}
	
	public static void AdjustTurnSpeed( double Speed ) {
		double error = Speed - Navigation.GetTurnSpeed();
		LastPowerT  += error * 0.0001;
	}
	
	// ===
	
	public static void MinimumDrivePower() {
		if ( LastPowerD < 0 ) { 
			LastPowerD = Math.min( -Settings.MinimumDrivePower , LastPowerD ); }
		if ( LastPowerD > 0 ) {
			LastPowerD = Math.max( +Settings.MinimumDrivePower, LastPowerD ); }
		}
	
	public static void MinimumTurnPower() {
		if ( LastPowerT < 0 ) {
			LastPowerT = Math.min( -Settings.MinimumTurnPower , LastPowerT ); }
		if ( LastPowerT > 0 ) {
			LastPowerT = Math.max( +Settings.MinimumTurnPower , LastPowerT ); }
		}
	
	// ===
	
	public static void AdjustToFrontRange( double Range ) {
		double error = Navigation.GetFrontRange() - Range;
		double speed = error;
		if ( error < 0 ) { speed = Math.min( speed , -30 ); } // Maximum Speed
		if ( error > 0 ) { speed = Math.max( speed , 30 );  } // of 30 in/sec
		AdjustDriveSpeed( speed );
	}
	
	public static void AdjustToHeading( double Heading ) {
		double error = Navigation.GetDelta( Heading ); // Change in turn degrees
		double speed = error;
		if ( error < 0 ) { speed = Math.min( speed , -30 ); } // Maximum Speed
		if ( error > 0 ) { speed = Math.max( speed , +30 ); } // of 30 deg/sec
		LastHeading = Heading;
		AdjustTurnSpeed( error );
	}

//	public static void AdjustToTarget() {
//		double error = Vision.GetTargetX() / Settings.CameraPixelsPerDegree;
//		double speed = error;
//		if ( error < 0 ) { speed = Math.min( speed , -30 ); } // Max Speed 
//		if ( error > 0 ) { speed = Math.max( speed , +30 ); } // of 30 deg/sec
//		LastHeading = Navigation.GetDirection() + error;
//		AdjustTurnSpeed( error );
//	}

	// ===
	
	public static void DriveStraight ( double Speed ) {
		AdjustDriveSpeed( Speed );
		AdjustToHeading( LastHeading );
		MinimumDrivePower();
		Drivetrain.DriveArcade( LastPowerD , LastPowerT);
	}
	
	public static void DriveToSurface( double Range ) {
		AdjustToFrontRange( Range );
		AdjustToHeading( LastHeading );
		MinimumDrivePower();
		Drivetrain.DriveArcade( LastPowerD , LastPowerT );
	}
	
//	public static void DriveToTarget() {
//		AdjustToFrontRange( 10 );
//		AdjustToTarget();
//		MinimumDrivePower();
//		Drivetrain.DriveArcade( LastPowerD , LastPowerT );
//	}
	
	public static void TurnToHeading( double Heading ) {
		LastPowerD = 0;
		AdjustToHeading( Heading );
		MinimumTurnPower();
		Drivetrain.DriveArcade( LastPowerD , LastPowerT );
	}
	
//	public static void TurnToTarget() {
//		LastPowerD = 0;
//		AdjustToTarget();
//		MinimumTurnPower();
//		Drivetrain.DriveArcade( LastPowerD , LastPowerT );
//	}
	
	public static void TurnAtSpeed( double Speed ) {
		LastPowerD = 0;
		AdjustTurnSpeed( Speed );
		MinimumTurnPower();
		Drivetrain.DriveArcade( LastPowerD , LastPowerT );
	}
	
}
