/**
 * Drivetrain class.
 * 
 */
package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.Spark;


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
	 * Peridic() method
	 * @see Onabots#Periodic()
	 * 
	 */
	public static void Periodic() {
		
		MotorLF.set(PowerL); MotorRF.set(PowerR);
		MotorLR.set(PowerL); MotorRR.set(PowerR);
		
	}
	/**
	 * DriveArcade method
	 * @param PowerD	PowerD is used for?
	 * @param PowerT	PowerT is used for?
	 */
	public static void DriveArcade( double PowerD, double PowerT ) {
		PowerL = PowerD - PowerT ;
		PowerR = PowerD + PowerT ;
	}
	
	public static void Stop() {
		PowerL = 0;
		PowerR = 0;
	}
}
