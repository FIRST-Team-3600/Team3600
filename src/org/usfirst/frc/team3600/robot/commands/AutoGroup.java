package org.usfirst.frc.team3600.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoGroup extends CommandGroup {
	
	public AutoGroup() {
		this.addSequential(new AutoLiftCommand());
		this.addSequential(new AutoDriveCommand());
	}
	
}
