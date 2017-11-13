import javax.swing.JFrame;

public class calculatorMain 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		c.setTitle("Calculator");
		c.setSize(620,570);
		c.setVisible(true);
		c.setResizable(false);
		c.setLocationRelativeTo(null);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
