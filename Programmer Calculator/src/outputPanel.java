import javax.swing.JPanel;
import javax.swing.JTextArea;

public class outputPanel extends JPanel
{
	public JTextArea outputTextArea;

	public JTextArea getOutputTextArea() 
	{
		return outputTextArea;
	}

	public void setOutputTextArea(JTextArea j) 
	{
		outputTextArea = j;
	}
}
