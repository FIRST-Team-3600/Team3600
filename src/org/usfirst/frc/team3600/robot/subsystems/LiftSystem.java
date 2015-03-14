
package org.usfirst.frc.team3600.robot.subsystems;

import org.usfirst.frc.team3600.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

// This is the system controlling the conveyer belt lifty thing.

public class LiftSystem extends Subsystem {
    
    CANTalon motor1 = new CANTalon(RobotMap.CAN_LIFT_ONE);
    VictorSP motor2 = new VictorSP(RobotMap.LIFT_SECONDARY);
    
    double d = 0;
    
    public void initDefaultCommand() {
    	System.out.println("Setting CAN Control Modes...");
    	motor1.changeControlMode(CANTalon.ControlMode.PercentVbus);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double d) { //Edd
    	this.d = d;
    	motor1.set(d);
    	motor2.set(d);
    }
    
    /*@SuppressWarnings("deprecation")
	public void log() {
    	SmartDashboard.putDouble("LiftSpeed", d);
    }*/
    
}

