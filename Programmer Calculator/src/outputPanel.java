import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class outputPanel extends JPanel
{
	public JTextArea outputTextArea;
	JScrollPane scroll4Outout;

	public outputPanel()
	{
		outputTextArea = new JTextArea(5,20);
		 scroll4Outout = new JScrollPane();
		
		outputTextArea.setEditable(false);
		scroll4Outout.setViewportView(outputTextArea);
		
		setLayout(new GridBagLayout());
		setBorder(javax.swing.BorderFactory.createEtchedBorder());
		GridBagConstraints gc = new GridBagConstraints();
		
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 340;
		gc.ipady = -10;
		//gc.fill = java.awt.GridBagConstraints.BOTH;
	//	gc.ipadx = 647;
	//	gc.ipady = 80;
	//	gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gc.weightx = 1.0;
		gc.weighty = 1.0;
	//	gc.insets = new java.awt.Insets(2, 2, 2, 2);
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
