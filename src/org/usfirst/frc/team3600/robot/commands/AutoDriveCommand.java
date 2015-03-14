
package org.usfirst.frc.team3600.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3600.robot.Robot;

/**
 *
 */
public class AutoDriveCommand extends Command {

	
    public AutoDriveCommand() {
    	super("AutoDriveCommand");
        // Use requires() here to declare subsystem dependencies
        requires(Robot.DRIVE_SYSTEM);
        this.setTimeout(1.4);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Driving...");
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.DRIVE_SYSTEM.drive(0, 0, -0.6);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.DRIVE_SYSTEM.drive(0, 0, 0);
    	System.out.println("Done.");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	this.end();
    }
}
