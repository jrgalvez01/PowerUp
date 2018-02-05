package org.usfirst.frc.team5534.robot;
/**
 * <h2>Onabots Class</h2>
 * The
 * @author FRC 5534 Onaway Onabots
 *
 */
public class Onabots {

	public static void Init() {
		Drivetrain.Init();
		Navigation.Init();
		Vision.Init();
		
	}
	/**
	 * This is basicly the main loop of the robot.
	 */
	public static void Periodic() {
		Drivetrain.Periodic(); 
		Elevator.Periodic();
		Dashboard.Periodic();
		ModeTeleop.Periodic();
	}
}
