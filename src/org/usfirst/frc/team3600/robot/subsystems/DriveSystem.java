
package org.usfirst.frc.team3600.robot.subsystems;

import org.usfirst.frc.team3600.robot.Robot;
import org.usfirst.frc.team3600.robot.RobotMap;
import org.usfirst.frc.team3600.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSystem extends Subsystem {
    
    Talon fLeft = new Talon(RobotMap.FRONT_LEFT);
    Talon fRight = new Talon(RobotMap.FRONT_RIGHT);
    Talon bLeft = new Talon(RobotMap.BACK_LEFT);
    Talon bRight = new Talon(RobotMap.BACK_RIGHT);
    
    double x = 0;
    double y = 0;
    double r = 0;
    
    Sendable xSendable;
    Sendable ySendable;
    Sendable rSendable;
    
    RobotDrive driver = new RobotDrive(fLeft, bLeft, fRight, bRight);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new DriveCommand(Robot.oi.xbox/*, Robot.oi.logitechA32*/));
    }
    
    public void drive(double x, double y, double r) {
    	this.x = x;
    	this.y = y;
    	this.r = r;
    	driver.mecanumDrive_Cartesian(x, y, r, 0);
    }
    
    
    
    /*@SuppressWarnings("deprecation")
	public void log() {
    	SmartDashboard.putDouble("x", x);
    	SmartDashboard.putDouble("y", y);
    	SmartDashboard.putDouble("r", r);
    }*/
    
}

