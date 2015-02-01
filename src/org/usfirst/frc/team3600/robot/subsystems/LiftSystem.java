
package org.usfirst.frc.team3600.robot.subsystems;

import org.usfirst.frc.team3600.robot.Robot;
import org.usfirst.frc.team3600.robot.RobotMap;
import org.usfirst.frc.team3600.robot.commands.LiftCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

// This is the system controlling the conveyer belt lifty thing.

public class LiftSystem extends Subsystem {
    
    CANTalon motor1 = new CANTalon(RobotMap.CAN_LIFT_ONE);
    
    public void initDefaultCommand() {
    	System.out.println("Setting CAN Control Modes...");
    	motor1.changeControlMode(CANTalon.ControlMode.PercentVbus);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new LiftCommand(Robot.oi.logitechA32));
    }
    
    public void setSpeed(double d) {
    	motor1.set(d);
    }
    
}

