
package org.usfirst.frc.team3600.robot.subsystems;

import org.usfirst.frc.team3600.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftSystem extends Subsystem {
    
    Talon motor1 = new Talon(RobotMap.LIFT_ONE);
    Talon motor2 = new Talon(RobotMap.LIFT_TWO);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
}

