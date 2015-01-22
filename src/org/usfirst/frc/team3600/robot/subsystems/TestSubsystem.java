
package org.usfirst.frc.team3600.robot.subsystems;

import org.usfirst.frc.team3600.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TestSubsystem extends Subsystem {
    
    Talon talon = new Talon(RobotMap.TEST_MOTOR);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double s) {
    	talon.set(s);
    }
    
}

