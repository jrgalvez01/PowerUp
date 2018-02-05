/**
 * Drivetrain class.
 * 
 */
package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.Spark;

/**
 * Drivetrain Class
 * <p>
 * This will define all the motors and setup some methods.
 * @author fRC 5534 Onaway Onabots
 *
 */
public class Drivetrain {
	
	public static Spark MotorLF = new Spark( Ports.MotorLF );
	public static Spark MotorRF = new Spark( Ports.MotorRF );
	public static Spark MotorLR = new Spark( Ports.MotorLR );
	public static Spark MotorRR = new Spark( Ports.MotorRR );
	
	public static double PowerL = 0;
	public static double PowerR = 0;
	
	/**
	 * Init method.
	 * called from Onabots.  It's called once to setup and initialize the
	 * left motors to be inverted in direction from the right side motors.
	 * Also sets the starting Power to zero.
	 * @see Onabots#Init()
	 */
	public static void Init() {
		MotorLF.setInverted( true );
		MotorLR.setInverted( true );
		
		PowerL = 0;
		PowerR = 0;
	}
	
	/**
	 * Drivetrain.Periodic() method
	 * <p>
	 * This is called from the Onabots.Periodic and updates the motors based on PowerL 
	 * and PowerR are set to from the driver joystick is doing.
	 * @see Onabots#Periodic()
	 * 
	 */
	public static void Periodic() {
		
		MotorLF.set(PowerL); MotorRF.set(PowerR);
		MotorLR.set(PowerL); MotorRR.set(PowerR);
		
	}
	/**
	 * DriveArcade method
	 * @param PowerD	PowerD is the thrust or y axis on the joystick
	 * @param PowerT	PowerT is the turn or the x axis on the joystick
	 */
	public static void DriveArcade( double PowerD, double PowerT ) {
		PowerL = PowerD + PowerT ;
		PowerR = PowerD - PowerT ;
	}
	/**
	 * Stop method
	 * <p>
	 * Sets the PowerL and PowerR to zero to stop the motors.
	 */
	public static void Stop() {
		PowerL = 0;
		PowerR = 0;
	}
}
