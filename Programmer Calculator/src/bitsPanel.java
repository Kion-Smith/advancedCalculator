import java.awt.Font;
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
 * creates all the buttons
 */
public class bitsPanel extends JPanel
{
	JTextArea bitsTextArea;
	public JScrollPane bitsScrollPane;

	
	public bitsPanel()
	{

		
		//setBorder(BorderFactory.createEtchedBorder());
        
		bitsTextArea = new JTextArea(5,20);
		
		bitsScrollPane = new JScrollPane(bitsTextArea,JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		bitsTextArea.setEditable(false);
		bitsTextArea.setLineWrap(false);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 537;
		gc.ipady = 80;
		add(bitsScrollPane,gc);
		
		String bitsPanel="                             00000000000000000000000000000000     \n\n"+
				
				 		 "                             00000000000000000000000000000000     \n";

		bitsTextArea.setFont(new Font("Arial", Font.PLAIN, 16) );
		//bp.bitsTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		bitsTextArea.setText(bitsPanel);

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
