import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class outputPanel extends JPanel
{
	public JTextArea outputTextArea;

	public outputPanel()
	{
		outputTextArea = new JTextArea(5,20);
		outputTextArea.setEditable(false);
		
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createEtchedBorder());
		GridBagConstraints gc = new GridBagConstraints();
		
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 540;//700
		gc.ipady =70;
		gc.weightx = 1.0;
		gc.weighty = 1.0;
		add(outputTextArea,gc);
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
