package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Potentiometer {
	
	public static DigitBoard DB = DigitBoard.getInstance();
	
	public static final String LeftStation = "Left Station";
	public static final String DoNothing = "Pout";
	
	public static String autonSelected = DoNothing;
	
	public static void Dashboard() {
		DB.writeDigits( Potentiometer.autonSelected );
		
		SmartDashboard.putBoolean( "Button_A" , DB.getA()				  );
		SmartDashboard.putBoolean( "Button_B" , DB.getB()				  );
		SmartDashboard.putNumber( "Potentiometer" , DB.getPotentiometer() );
		SmartDashboard.putString( "Auton Mode" , autonSelected 			  );
	}
	
	public static void AutonSelector() {
		
		double voltage = 2 * DB.getPotentiometer();
		
		if ( voltage < 1 ) { autonSelected = DoNothing; }
		
		else if ( voltage < 2 ) { autonSelected = LeftStation; }
		
		else { autonSelected = DoNothing; }
		
	}
	
}
