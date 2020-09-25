package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primetester {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("type a number");
	int b= Integer.parseInt(a);
	if(b%2==0||b%3==0) {
		System.out.println("not prime");
	}
	else {
		System.out.println("prime");
	}
}
}
