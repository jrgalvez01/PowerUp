package org.usfirst.frc.team5534.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Servo;
/**
 * Vision Class
 * <p>
 * Sets up the camera and the servos to control camera view.
 * @author FRC 5534 Onaway Onabots
 *
 */
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
