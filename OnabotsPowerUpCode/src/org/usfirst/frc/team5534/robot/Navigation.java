package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;

public class Navigation {

	public static ADXRS450_Gyro Gyro = new ADXRS450_Gyro();
	
	public static void Init() {
		Gyro.reset();
		
	}
	
	public static void Periodic() {
		
	}
	
}
