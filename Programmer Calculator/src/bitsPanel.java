import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class bitsPanel extends JPanel
{
	JTextArea bitsTextArea;
	
	public bitsPanel()
	{
		bitsTextArea = new JTextArea(5,20);
		bitsTextArea.setEditable(false);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		add(bitsTextArea,gc);
	}

	public JTextArea getBitsPanel() 
	{
		return bitsTextArea;
	}

	public void setBitsPanel(JTextArea j)
	{
		bitsTextArea = j;
	}
}
