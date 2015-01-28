package org.usfirst.frc.team3600.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3600.robot.commands.CANTestCommand;
import org.usfirst.frc.team3600.robot.commands.TestCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	static final int XBOX = 1;
	static final int LOGITECH_ATTACK_3 = 0;
	static final int LOGITECH_EXTREME_3D_PRO = 0;
	
	// The naming scheme of these buttons is:
	// [acronym of name of controller][name of button]
	// so x[box]Start
	// or l[ogitech]A[ttack]31
	
	//XBOX
	public Joystick xbox = new Joystick(XBOX);
	Button xA = new JoystickButton(xbox, 1); //HA
	Button xB = new JoystickButton(xbox, 2);
	Button xX = new JoystickButton(xbox, 3);
	Button xY = new JoystickButton(xbox, 4);
	Button xL1 = new JoystickButton(xbox, 5);
	Button xR1 = new JoystickButton(xbox, 6);
	Button xSelect = new JoystickButton(xbox, 7);
	Button xStart = new JoystickButton(xbox, 8);
	Button xL3 = new JoystickButton(xbox, 9);
	Button xR3 = new JoystickButton(xbox, 10);
	//END XBOX
	//LOGITECH ATTACK 3
	public Joystick logitechA3 = new Joystick(LOGITECH_ATTACK_3);
	Button lA31 = new JoystickButton(logitechA3, 1);
	Button lA32 = new JoystickButton(logitechA3, 2);
	Button lA33 = new JoystickButton(logitechA3, 3);
	Button lA34 = new JoystickButton(logitechA3, 4);
	Button lA35 = new JoystickButton(logitechA3, 5);
	Button lA36 = new JoystickButton(logitechA3, 6);
	Button lA37 = new JoystickButton(logitechA3, 7);
	Button lA38 = new JoystickButton(logitechA3, 8);
	Button lA39 = new JoystickButton(logitechA3, 9);
	Button lA310 = new JoystickButton(logitechA3, 10);
	Button lA311 = new JoystickButton(logitechA3, 11);
	//END LOGITECH ATTACK 3
	//LOGITECH EXTREME 3D PRO
	public Joystick logitechE3D = new Joystick(LOGITECH_EXTREME_3D_PRO);
	
	
	public OI() {
		lA31.whileHeld(new TestCommand(logitechA3));
		lA32.whileActive(new CANTestCommand());
	}
	
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

