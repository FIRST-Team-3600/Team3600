
package org.usfirst.frc.team3600.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3600.robot.commands.AutoGroup;
import org.usfirst.frc.team3600.robot.subsystems.DriveSystem;
import org.usfirst.frc.team3600.robot.subsystems.LiftSystem;
import org.usfirst.frc.team3600.robot.subsystems.TestSubsystem;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

/*
 * ROBOCOP
 *                ____
 *               |____|
 *               {____}
 *           ____\____/____
 *          /              \
 *          |   |      |   |
 *          |   |      |   |
 *          /   |______|   \
 *          \---|      |\---
 *              |   |  |
 *              |   |  |
 *              |___|__|_
 *              |____\___\
 */
public class Robot extends IterativeRobot {

	public static TestSubsystem TEST_SUBSYSTEM;
	public static LiftSystem LIFT_SYSTEM;
	public static DriveSystem DRIVE_SYSTEM;
	public static OI oi;
	
	CameraServer camera;
	
    Command autonomousCommand;
    
    //AnalogSensor ultraDist;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	camera = CameraServer.getInstance();
    	camera.setQuality(50);
    	camera.startAutomaticCapture("cam0");
    	
    	TEST_SUBSYSTEM = new TestSubsystem();
    	LIFT_SYSTEM = new LiftSystem();
    	DRIVE_SYSTEM = new DriveSystem();
		oi = new OI();
		
//		ultraDist = new AnalogSensor(new AnalogInput(0));
        // instantiate the command used for the autonomous period
        autonomousCommand = new AutoGroup();
		
        SmartDashboard.putData(DRIVE_SYSTEM);
        SmartDashboard.putData(LIFT_SYSTEM);
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        log();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    //int count = 0;
    public void teleopPeriodic() {
    	/*count++;
    	if (count >= 50) {
    		System.out.println("UltraVolt: " + ultraDist.sensor.getVoltage());
    		System.out.println("UltraDist: " + ultraDist.getSonicDist());
    		count = 0;
    	}*/
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
    
    private static void log() {
    	DRIVE_SYSTEM.log();
    	LIFT_SYSTEM.log();
    }
}
