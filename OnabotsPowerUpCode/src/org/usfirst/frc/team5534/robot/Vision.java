package org.usfirst.frc.team5534.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;

public class Vision {

	public static UsbCamera Camera;
	
	public static void Init() {
		Camera = CameraServer.getInstance().startAutomaticCapture();	
	}
	
	public static void Periodic() {
		
	}
	
}
