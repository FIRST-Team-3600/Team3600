
package org.usfirst.frc.team3600.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3600.robot.Robot;

/**
 *
 */
public class CANTestCommand extends Command {
	
	Joystick stick;

    public CANTestCommand(Joystick stick) {
    	super("TestCommand");
        // Use requires() here to declare subsystem dependencies
        requires(Robot.TEST_SUBSYSTEM);
        this.stick = stick;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Testing...");
    }

    double z;
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	z = stick.getX();
    	if (Math.abs(z) < .1) {
    		z = 0;
    	}
    	System.out.println(z);
    	Robot.TEST_SUBSYSTEM.setSpeed(z);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("Stopping testing...");
    	Robot.TEST_SUBSYSTEM.setSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	this.end();
    }
}
