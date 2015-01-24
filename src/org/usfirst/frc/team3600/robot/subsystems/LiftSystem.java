
package org.usfirst.frc.team3600.robot.subsystems;

import org.usfirst.frc.team3600.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftSystem extends Subsystem {
    
    CANTalon motor1 = new CANTalon(RobotMap.LIFT_ONE);
    CANTalon motor2 = new CANTalon(RobotMap.LIFT_TWO);
    
    public void initDefaultCommand() {
    	motor1.changeControlMode(CANTalon.ControlMode.Position);
    	motor2.changeControlMode(CANTalon.ControlMode.Follower);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void test() {
    	motor1.setPosition(10);
    }
    
}

