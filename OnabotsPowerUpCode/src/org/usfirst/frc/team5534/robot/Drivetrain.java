package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.Spark;


public class Drivetrain {
	
	public static Spark MotorLF = new Spark( Ports.MotorLF );
	public static Spark MotorRF = new Spark( Ports.MotorRF );
	public static Spark MotorLR = new Spark( Ports.MotorLR );
	public static Spark MotorRR = new Spark( Ports.MotorRR );
	
	public static double PowerL;
	public static double PowerR;

	public static void Init() {
		MotorRF.setInverted( true );
		MotorRR.setInverted( true );
		
		PowerL = 0;
		PowerR = 0;
	}
	
	public static void Periodic() {
		
		MotorLF.set(PowerL); MotorRF.set(PowerR);
		MotorLR.set(PowerL); MotorRR.set(PowerR);
		
	}
	
	public static void DriveArcade( double PowerD, double PowerT ) {
		PowerL = PowerD; // + PowerT ;
		PowerR = PowerD; // - PowerT ;
	}
	
	public static void Stop() {
		PowerL = 0;
		PowerR = 0;
	}
}
