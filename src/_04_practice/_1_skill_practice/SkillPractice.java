package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		
	
				SkillPractice skills = new SkillPractice();
			           skills.skill1();
			           skills.skill2();
			           skills.skill3();
			           skills.skill4();
			           skills.skill5();
	}
		void skill1() {
			String d =JOptionPane.showInputDialog("How many dimes do you have?");
			int c =Integer.parseInt(d);
			JOptionPane.showMessageDialog(null, "you have "+10*c +" cents");
			String t=JOptionPane.showInputDialog("How tall are you in inches?");
			int t1 = Integer.parseInt(t);
			if( t1 < 36) {
			JOptionPane.showMessageDialog(null, "Eat your wetties");
			}
		}
		void skill2() {
			for(int i=1;i<31;i++) {
				if(i%3==0) {
					System.out.println(i);
				}
			}
		}
		void skill3() {
	Random a = new Random();
	int b= a.nextInt(20);
	System.out.println(b);
	int c=a.nextInt(10);
	System.out.println(c);
	JOptionPane.showMessageDialog(null, b-c);
}
		void skill4() {
	String city= JOptionPane.showInputDialog("Which city do you live in?");
	if(city.equalsIgnoreCase("San Diego")) {
		JOptionPane.showMessageDialog(null,"You are living in US's finest city");
	}
	else {
		JOptionPane.showMessageDialog(null,"Move to San Diego!");
		}
	int cars;
		String homecar = JOptionPane.showInputDialog("How many cars do your family have");
		cars=Integer.parseInt(homecar);
		if(cars==0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation" );
		}
		else if(cars==1){
			JOptionPane.showMessageDialog(null, "I guess it's BWM");
		}
		else {
			JOptionPane.showMessageDialog(null, "The total wheel numbers are "+4*cars);
		}
	
}
		void skill5() {
	String school =JOptionPane.showInputDialog("What is the name of your school?");
	JOptionPane.showMessageDialog(null,school+" is a nice school");
}
	}


