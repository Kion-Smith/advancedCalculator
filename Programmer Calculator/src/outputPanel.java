import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/*NAME: Kion Smith
 * ID: kls160430
 * CLASS: CS2336.502
 * 
 * 
 * show the output panel
 */
public class outputPanel extends JPanel
{
	public JTextArea outputTextArea;
	public JScrollPane outputScrollPane;

	public outputPanel()
	{
		outputTextArea = new JTextArea(5,20);
		outputScrollPane = new JScrollPane(outputTextArea,JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//outputScrollPane = new JScrollPane(outputTextArea);
		
		//outputScrollPane.
		outputTextArea.setEditable(false);
		
		outputTextArea.setLineWrap(false);

		setLayout(new GridBagLayout());
	//	setBorder(BorderFactory.createEtchedBorder());
		GridBagConstraints gc = new GridBagConstraints();
		
	
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 537;//700
		gc.ipady =75;
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
