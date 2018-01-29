package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Navigation {

	public static ADXRS450_Gyro Gyro = new ADXRS450_Gyro();
	
	public static void Init() {
		Gyro.reset();
		Gyro.calibrate();
		
		DriveEncoderR.reset(); 
		DriveEncoderR.setDistancePerPulse( Settings.DriveEncoderRatio );
		
	}
	
	public static void Periodic() {
		
	}
	
	public static void Reset() {
		Gyro.reset();
		
		DriveEncoderR.reset();
	}
	
	public static void Dashboard() {
		SmartDashboard.putNumber( "Heading" , Navigation.GetDirection() );
		SmartDashboard.putNumber( "Distance" , Navigation.GetDistance() );
		SmartDashboard.putNumber( "Drive Speed" , Navigation.GetDriveSpeed() );
		SmartDashboard.putNumber( "Turn Speed" , Navigation.GetTurnSpeed() );
		SmartDashboard.putNumber( "Front Range" , Navigation.GetFrontRange() );
//		SmartDashboard.putNumber( "Back Range" , GetBackRange() );
	}
	
//	public static String TelemetryHead() {
//		String result = "";
//		result += "Heading ";
//		result += "Distance ";
//		result += "DriveSpeed ";
//		result += "TurnSpeed ";
//		result += "FrontRange ";
//		result += "BackRange ";
//	}
	// More info is needed to complete the telemetry functions. 
	// "public static String TelemetryData"
	
	// ===
	
	public static Encoder DriveEncoderR = new Encoder (
			Ports.DIO_DriveEncoderR[0],
			Ports.DIO_DriveEncoderR[1],
			true	);
	
	public static double GetDistance() {
		return DriveEncoderR.getDistance();
	}
	
	public static double GetDriveSpeed() {
		return DriveEncoderR.getRate();
	}
	
	// ===
	
	public static double GetDirection() {
		return Gyro.getAngle();
	}
	
	public static double GetDelta( double Heading ) {
		return ( Heading - Gyro.getAngle() + 180 ) % 360 - 180;
	}
	
	public static double GetTurnSpeed() {
		return Gyro.getRate();
	}
	
	// ===
	
	public static Ultrasonic SonarFront = new Ultrasonic (
			Ports.DIO_SonarFront[0],
			Ports.DIO_SonarFront[1]
	);
	
	public static double GetFrontRange() {
		return SonarFront.getRangeInches();
	}
	
}
