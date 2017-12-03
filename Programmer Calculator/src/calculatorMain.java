import javax.swing.JFrame;
/*NAME: Kion Smith
 * ID: kls160430
 * CLASS: CS2336.502
 * 
 * 
 * Main Class used to run the calculator
 */

public class calculatorMain 
{
	public static void main(String[] args) 
	{
		//create Jframe
		Calculator c = new Calculator();
		c.setTitle("Calculator");
		c.setSize(600,550);//620,580
		c.setVisible(true);
		c.setResizable(false);///set to false later
		c.setLocationRelativeTo(null);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
