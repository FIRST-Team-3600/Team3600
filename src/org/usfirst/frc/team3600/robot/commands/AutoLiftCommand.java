
package org.usfirst.frc.team3600.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3600.robot.Robot;

// This command will actually control the lift system. Not completed.

public class AutoLiftCommand extends Command {
	

    public AutoLiftCommand() {
    	super("AutoLiftCommand");
        // Use requires() here to declare subsystem dependencies
        requires(Robot.LIFT_SYSTEM);
        this.setTimeout(2);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Lifting...");
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.LIFT_SYSTEM.setSpeed(-0.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.LIFT_SYSTEM.setSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	this.end();
    }
}
