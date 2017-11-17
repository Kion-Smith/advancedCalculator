import javax.swing.JPanel;
import javax.swing.JTextArea;

public class outputPanel extends JPanel
{
	public JTextArea outputTextArea;

	public outputPanel()
	{
		outputTextArea = new JTextArea(5,20);
		outputTextArea.setEditable(false);
	}
	
	public JTextArea getOutputTextArea() 
	{
		return outputTextArea;
	}

	public void setOutputTextArea(JTextArea j) 
	{
		outputTextArea = j;
	}
}
