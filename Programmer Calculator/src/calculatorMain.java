import javax.swing.JFrame;

public class calculatorMain 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		c.setTitle("Calculator");
		c.setSize(550,450);
		c.setVisible(true);
		c.setLocationRelativeTo(null);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
