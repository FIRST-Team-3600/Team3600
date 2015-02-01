
package org.usfirst.frc.team3600.robot.subsystems;

import org.usfirst.frc.team3600.robot.Robot;
import org.usfirst.frc.team3600.robot.RobotMap;
import org.usfirst.frc.team3600.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
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
    
    RobotDrive driver = new RobotDrive(fLeft, bLeft, fRight, bRight);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveCommand(Robot.oi.logitechA3, Robot.oi.logitechA32));
    }
    
    public void drive(double x, double y, double r) {
    	driver.mecanumDrive_Cartesian(x, y, r, 0);
    }
    
}

