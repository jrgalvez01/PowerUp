package org.usfirst.frc.team5534.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	
	@Override
	public void robotInit() {
		Onabots.Init();
	}
	
	@Override
	public void robotPeriodic() {
		Onabots.Periodic();
	}
	
	@Override
	public void autonomousInit() {
		ModeAuton.Init();
	}
	
	@Override
	public void autonomousPeriodic() {
		ModeAuton.Periodic();
	}
	
	@Override
	public void teleopInit() {
		ModeTeleop.Init();
	}
	
	@Override
	public void teleopPeriodic() {
		ModeTeleop.Periodic();
	}
	
	@Override
	public void disabledInit() {
		ModeDisabled.Init();
	}
	
	@Override
	public void disabledPeriodic() {
		ModeDisabled.Periodic();
	}
	
	@Override
	public void testInit() {}
	
	@Override
	public void testPeriodic() {}
	
}

