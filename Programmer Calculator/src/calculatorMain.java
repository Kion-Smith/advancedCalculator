import javax.swing.JFrame;

public class calculatorMain 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		c.setTitle("Calculator");
		c.setSize(750,650);//620,580
		c.setVisible(true);
		//c.setResizable(false);///set to false later
		c.setLocationRelativeTo(null);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
