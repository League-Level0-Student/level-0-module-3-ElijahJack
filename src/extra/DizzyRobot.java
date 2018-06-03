//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String spins = JOptionPane.showInputDialog("On a scale from 1-10, how dizzy do you want the robot to be?");
 // 1. Use the dance method to make the robot spin.
int 	amount = Integer.parseInt(spins);
DizzyRobot.dance(amount);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.setSpeed(10);
			robot.turn(360);
		}
	}
}

