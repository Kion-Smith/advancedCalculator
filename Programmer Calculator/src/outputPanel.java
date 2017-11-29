import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class outputPanel extends JPanel
{
	public JTextArea outputTextArea;
	public JScrollPane outputScrollPane;

	public outputPanel()
	{
		outputTextArea = new JTextArea(5,20);
		outputScrollPane = new JScrollPane(outputTextArea);
		
		outputTextArea.setEditable(false);
		
		outputTextArea.setLineWrap(false);

		setLayout(new GridBagLayout());
	//	setBorder(BorderFactory.createEtchedBorder());
		GridBagConstraints gc = new GridBagConstraints();
		
	
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 520;//700
		gc.ipady =70;
		add(outputScrollPane,gc);
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
