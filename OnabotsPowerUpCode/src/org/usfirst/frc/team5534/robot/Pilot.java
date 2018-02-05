package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.Joystick;
<<<<<<< HEAD
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * <h2>Pilot Class</h2>
 * Sets up different ways of driving based on who is piloting the 
 * @author FRC 5534 Onaway Onabots
 *
 */
=======

>>>>>>> parent of b148c3c... Take two
public class Pilot {
	
	public static Joystick DriveStick = new Joystick( Ports.DriveStick );
	
	public static void Init() {
	
		//Navigation.reset();
		
	}
	/**
	 * Periodic method.
	 * <p>
	 * Why is this here? It does nothing.
	 */
	public static void Periodic() {
		
		
		
	}
	/**
	 * <h2>Pilot.Galvez</h2>
	 * This is for when Jusus is your Pilot 
	 */
	public static void Galvez() {
		double PowerD = DriveArcade.GetThrust();
		double PowerT = DriveArcade.GetTurn();
		Drivetrain.DriveArcade( PowerD, PowerT );
		
		if(DriveStick.getRawButton(1)) {
			Vision.CameraAltitude.setAngle(90);
		}
		else {
			Vision.CameraAltitude.setAngle(0);
		}
	}
	
	
	public static void Steensma() {
		double PowerD = DriveArcade.GetThrust();
		double PowerT = DriveArcade.GetTurn();
		Drivetrain.DriveArcade( PowerD, PowerT );

	}
	
	
	
}
