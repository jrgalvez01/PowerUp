package org.usfirst.frc.team5534.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;

public class Vision {

	public static UsbCamera Camera;
	
	public static Servo CameraAzimuth = new Servo(Ports.CameraAzimuth);
	public static Servo CameraAltitude = new Servo(Ports.CameraAltitude);
	
	public static void Init() {
		Camera = CameraServer.getInstance().startAutomaticCapture();
		CameraAzimuth.setAngle(180);
		Timer.delay(1);
		CameraAzimuth.setAngle(0);
		Timer.delay(1);
		CameraAzimuth.setAngle(90);
		Timer.delay(1);
		CameraAzimuth.setDisabled();
	}
	
	public static void Periodic() {
		
	}
	
}
