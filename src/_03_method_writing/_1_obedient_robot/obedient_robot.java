package _03_method_writing._1_obedient_robot;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class obedient_robot {
static Robot bot = new Robot();
static void setColor() {
	String c=JOptionPane.showInputDialog("Blue or Yellow or Red?");
	if(c.equalsIgnoreCase("Blue")) {
		bot.setPenColor(Color.BLUE);
	}
	else if(c.equalsIgnoreCase("yellow")) {
		bot.setPenColor(Color.YELLOW);
	}
	else if(c.equalsIgnoreCase("red")) {
		bot.setPenColor(Color.RED);
	}
	else {
		bot.setPenColor(Color.BLACK);
	}
	}
static void drawSqare() {

	
	bot.setSpeed(80);
	bot.penDown();
	
	for(int i =0;i<4;i++) {
	bot.move(200);
	bot.turn(-90);
	}
	}
static void drawTriangle() {

	bot.setSpeed(80);
	bot.penDown();
	bot.turn(30);
	for(int i=0;i<3;i++) {

		
	
	bot.move(200);
	bot.turn(120);
	}
}
static void drawCircle() {
	bot.setSpeed(200);
	bot.penDown();
	for(int i=0; i<360;i++) {
bot.move(2);
bot.turn(1);
}
}
public static void main(String[] args) {
		setColor();
		String shape = JOptionPane.showInputDialog("Square or Triangle or Circle?");
	if(shape.equalsIgnoreCase("square")) {
		drawSqare();
	}
	else if(shape.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	else{
		drawCircle();
	}
	
		
		
	
}

}
