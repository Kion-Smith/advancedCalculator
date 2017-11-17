import javax.swing.JPanel;
import javax.swing.JTextArea;

public class bitsPanel extends JPanel
{
	JTextArea bitsPanel;
	
	public bitsPanel()
	{
		bitsPanel = new JTextArea(5,20);
		bitsPanel.setEditable(false);
	}

	public JTextArea getBitsPanel() 
	{
		return bitsPanel;
	}

	public void setBitsPanel(JTextArea j)
	{
		bitsPanel = j;
	}
}
