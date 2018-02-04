package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * <h2>Pilot Class</h2>
 * Sets up different ways of driving based on who is piloting the 
 * @author FRC 5534 Onaway Onabots
 *
 */
public class Pilot {
	
	public static Joystick DriveStick = new Joystick( Ports.DriveStick );
	
	public static void Init() {
	
		//Navigation.reset();
		
	}
	
	public static void Periodic() {
		
		
		
	}
	
	public static void Galvez() {
		double PowerD = DriveArcade.GetThrust();
		double PowerT = DriveArcade.GetTurn();
		Drivetrain.DriveArcade( PowerD, PowerT );
		
		if(DriveStick.getRawButton(1)) {
		
		if(Vision.CameraAzimuth.getAngle() != 90) {
		
			Vision.CameraAzimuth.setAngle(90);
		}
		else {
			Vision.CameraAzimuth.setDisabled();
		}
	}
		SmartDashboard.putNumber("CameraAzimuth" , Vision.CameraAzimuth.getAngle());

		

	}
	
	
	public static void Steensma() {
		double PowerD = DriveArcade.GetThrust();
		double PowerT = DriveArcade.GetTurn();
		Drivetrain.DriveArcade( PowerD, PowerT );

	}
	
	
	
}
