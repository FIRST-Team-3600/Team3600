
package org.usfirst.frc.team3600.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3600.robot.Robot;

// This command will actually control the lift system. Not completed.

public class LiftCommand extends Command {
	
	Joystick stick;

    public LiftCommand(Joystick stick) {
    	super("LiftCommand");
        // Use requires() here to declare subsystem dependencies
        requires(Robot.LIFT_SYSTEM);
        this.stick = stick;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Initializing lift command...");
    }

    double speed;
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	speed = stick.getRawAxis(2);
    	System.out.println("Speed: " + speed);
    	Robot.LIFT_SYSTEM.setSpeed(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("Stopping lifting...");
    	Robot.LIFT_SYSTEM.setSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	this.end();
    }
}
