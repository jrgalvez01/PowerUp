package org.usfirst.frc.team5534.robot;

public class Ports {

	// Drivetrain
	public static int MotorLF = 0;
	public static int MotorLR = 1;
	public static int MotorRF = 2;
	public static int MotorRR = 3;
	
	// User Control
	public static int DriveStick = 0;
	
	// Encoders
	public static int[] DIO_DriveEncoderR = { 0 , 1 };
	
	// Sonar
	public static int[] DIO_SonarFront = { 2 , 3 };
	
	// Camera Periscope
	public static int CameraAltitude = 8;
	public static int CameraAzimuth = 9;
	
}
