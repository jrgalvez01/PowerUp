package org.usfirst.frc.team5534.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Servo;

public class Vision {

	public static UsbCamera Camera;
	
	public static Servo CameraAzimuth = new Servo(Ports.CameraAzimuth);
	public static Servo CameraAltitude = new Servo(Ports.CameraAltitude);
	
	public static void Init() {
		Camera = CameraServer.getInstance().startAutomaticCapture();	
	    CameraAzimuth.set(0.5);
	    CameraAltitude.set(0.5);
	}
	
	public static void Periodic() {
		
	}
	
}
