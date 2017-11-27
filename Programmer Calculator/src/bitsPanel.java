import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class bitsPanel extends JPanel
{
	JTextArea bitsTextArea;

	
	public bitsPanel()
	{

		
		setBorder(BorderFactory.createEtchedBorder());
        
		bitsTextArea = new JTextArea(5,20);
		bitsTextArea.setEditable(false);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 540;
		gc.ipady = 80;
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
