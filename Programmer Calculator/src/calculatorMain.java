import javax.swing.JFrame;

public class calculatorMain 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		c.setTitle("Calculator");
		c.setSize(600,580);//620,580
		c.setVisible(true);
		//c.setResizable(false);///set to false later
		c.setLocationRelativeTo(null);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
