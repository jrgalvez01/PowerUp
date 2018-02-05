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
	
	/**
	 * GetThrust
	 * This gets what the y axis on the joystick is doing.
	 * @return	Y axis of joystick.
	 */
	public static double GetThrust() {
		
		return -DriveStick.getY();
	}
	/**
	 * GetTurn
	 * @return	X axis of the joystick.
	 */
	public static double GetTurn() {
		
		return DriveStick.getX()/3; //why is it divided by 3?
		
	}
}
