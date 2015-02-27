package org.usfirst.frc.team3600.robot;

import edu.wpi.first.wpilibj.*;

public class AnalogSensor {
	
	public static final double LV_MAXSONAR_SCALE = 0.0781249925494194 / 12;
	
	AnalogInput sensor;
	
	public AnalogSensor(AnalogInput sensor) {
		this.sensor = sensor;
	}
	
	public double getSonicDist() {
		return sensor.getVoltage() / LV_MAXSONAR_SCALE;
	}
	
}
