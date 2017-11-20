import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class outputPanel extends JPanel
{
	public JTextArea outputTextArea;

	public outputPanel()
	{
		outputTextArea = new JTextArea(5,20);
		outputTextArea.setEditable(false);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridx =1;
		gc.gridy =1;
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
