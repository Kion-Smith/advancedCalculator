import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
	//the output elements
	public JTextArea outputTextArea;
	public JScrollPane outputScrollPane;

	public outputPanel()
	{
		//instantiate the output items
		outputTextArea = new JTextArea(5,20);
		outputScrollPane = new JScrollPane(outputTextArea,JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);//disable the scorll wheel
		//set output area features
		outputTextArea.setEditable(false);
		outputTextArea.setLineWrap(false);

		//seting layout
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		//making it fit 
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 537;
		gc.ipady =75;
		add(outputScrollPane,gc);
	}
	//setters
	public JTextArea getOutputTextArea() 
	{
		return outputTextArea;
	}
//geters
	public void setOutputTextArea(JTextArea j) 
	{
		outputTextArea = j;
	}
}
