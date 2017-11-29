import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class bitsPanel extends JPanel
{
	JTextArea bitsTextArea;
	public JScrollPane bitsScrollPane;

	
	public bitsPanel()
	{

		
		//setBorder(BorderFactory.createEtchedBorder());
        
		bitsTextArea = new JTextArea(5,20);
		bitsScrollPane = new JScrollPane(bitsTextArea);
		
		bitsTextArea.setEditable(false);
		bitsTextArea.setLineWrap(false);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 520;
		gc.ipady = 80;
		add(bitsScrollPane,gc);

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
