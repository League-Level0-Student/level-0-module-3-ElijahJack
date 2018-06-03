//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		
		if (color.equals("red")) {
	bob.setPenColor(250,0,0);
}
		else if (color.equals("blue")) {
	bob.setPenColor(0,0,250);
}
		else if (color.equals("green")) {
	bob.setPenColor(0,250,0);
}
        //6. If the user doesn’t enter anything, choose a random color
else {
	bob.setRandomPenColor();
}

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bob.setPenWidth(10);
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
bob.penDown();
for(int i=0; i<12; i++) {
bob.setSpeed(40);
bob.move(200);
bob.turn(150);
}
	}
}
