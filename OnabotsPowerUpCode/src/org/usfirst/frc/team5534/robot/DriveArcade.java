package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.XboxController;
/**
 * DriveArchade
 * <p>
 * Unknown what this does.  Does not seem to be called or referanced anywhere else.
 * @author Unknown
 *
 */
public class DriveArcade {

	public static Joystick DriveStick = new Joystick( Ports.DriveStick );
	
	public static double GetThrust() {
		
		return DriveStick.getY();
	}
	
	public static double GetTurn() {
		
		return DriveStick.getX()/3;
		
	}
}
