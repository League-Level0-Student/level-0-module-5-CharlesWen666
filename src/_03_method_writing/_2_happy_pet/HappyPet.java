package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static 
	String pet =JOptionPane.showInputDialog("What pet do you want?");
	static 
	int HP =0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for(int i=0; i<8;i++) {
		int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle your "+pet, "feed your "+pet, "take a walk with your "+pet }, null);

			// 5. Use user input to call the appropriate method created in step 4.

	if(task==0) {
		cuddle();
	}
	if(task==1) {
		feed();
	}
	if(task==2) {
		walk();
	}
	if(HP>=100) {
		break;
	}
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		JOptionPane.showMessageDialog(null, "Your pet is now super happy!");
	}

	static void cuddle() {
		JOptionPane.showMessageDialog(null,"your "+pet +" bites you" );
		HP=HP-20;
		JOptionPane.showMessageDialog(null, "Your "+pet+"'s happiness is now"+HP);
	}
	static void feed() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" really likes the food");
		HP=HP+40;
		JOptionPane.showMessageDialog(null, "Your "+pet+"'s happiness is now"+HP);
	}
	static void walk() {
		JOptionPane.showMessageDialog(null,"Your "+pet+" is really happy during walking");
		HP=HP+20;
		JOptionPane.showMessageDialog(null, "Your "+pet+"'s happiness is now"+HP);
	}
}
