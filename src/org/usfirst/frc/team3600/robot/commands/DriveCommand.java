
package org.usfirst.frc.team3600.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3600.robot.Robot;

/**
 *
 */
public class DriveCommand extends Command {

	Joystick stick;
	//Joystick stick2;
	
	double deadzoneX = .15;
	double deadzoneY = .15;
	double deadzoneR = .1;
	
    public DriveCommand(Joystick stick/*, Joystick stick2*/) {
    	super("DriveCommand");
        // Use requires() here to declare subsystem dependencies
        requires(Robot.DRIVE_SYSTEM);
        this.stick = stick;
        //this.stick2 = stick2;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    double x;
    double y;
    double r;
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double x = -stick.getRawAxis(0);
    	double y = stick.getRawAxis(1);
    	double r = stick.getRawAxis(4);
    	
    	x = Math.abs(x) < deadzoneX ? 0 : x;
    	y = Math.abs(y) < deadzoneY ? 0 : y;
    	r = Math.abs(r) < deadzoneR ? 0 : r;
    	
    	//System.out.println(x + y + r);
    	Robot.DRIVE_SYSTEM.drive(x, r, y);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.DRIVE_SYSTEM.drive(0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	this.end();
    }
}
