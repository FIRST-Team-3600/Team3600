
package org.usfirst.frc.team3600.robot.subsystems;

import org.usfirst.frc.team3600.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftSystem extends Subsystem {
    
    CANTalon motor1 = new CANTalon(RobotMap.CAN_LIFT_ONE);
    CANTalon motor2 = new CANTalon(RobotMap.CAN_LIFT_TWO);
    
    public void initDefaultCommand() {
    	System.out.println("Setting CAN Control Modes...");
    	motor1.changeControlMode(CANTalon.ControlMode.PercentVbus);
    	motor2.changeControlMode(CANTalon.ControlMode.Follower);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double d) {
    	motor1.set(d);
    	motor2.set(motor1.getDeviceID());
    }
    
}

