import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
/*NAME: Kion Smith
 * ID: kls160430
 * CLASS: CS2336.502
 * 
 * 
 * base type for changeing the type
 */

public class baseTypePanel extends JPanel
{
	//crate the jradio buttons
	JRadioButton hexButton,decButton,octButton,binButton;
	ButtonGroup baseType;
	
	public baseTypePanel()
	{
		//instantiate teh buttons
		hexButton = new JRadioButton("Hex");
		decButton = new JRadioButton("Dec");
		octButton = new JRadioButton("Oct");
		binButton = new JRadioButton("Bin");
		
		baseType = new ButtonGroup();
		
		// adding buttons to the group
		baseType.add(hexButton);
		baseType.add(decButton);
		baseType.add(octButton);
		baseType.add(binButton);
		
		//setting the default value
		decButton.setSelected(true);
		
		//create border and layout
		setBorder(BorderFactory.createEtchedBorder());
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		//add the itmes to frame
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
       
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 3;
        gc.insets = new Insets(10, 5, 0, 40);
        add(hexButton, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridwidth = 3;
        gc.insets = new Insets(1, 5, 0, 0);
        add(decButton, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 2;
        gc.insets = new Insets(1, 5, 0, 0);
        add(octButton, gc);
        
        gc.gridx = 0;
        gc.gridy = 3;
        gc.insets = new Insets(1, 5, 15, 0);
        add(binButton, gc);
	}
	
	//getters
	public JRadioButton getHexButton() 
	{
		return hexButton;
	}
	public JRadioButton getDecButton() 
	{
		return decButton;
	}
	public JRadioButton getOctButton() 
	{
		return octButton;
	}	
	public JRadioButton getBinButton() 
	{
		return binButton;
	}
	
	//setters
	public void setHexButton(JRadioButton j) 
	{
		hexButton = j;
	}
	public void setDecButton(JRadioButton j) 
	{
		decButton = j;
	}
	public void setOctButton(JRadioButton j) 
	{
		octButton = j;
	}
	public void setBinButton(JRadioButton j) 
	{
		binButton = j;
	}

	
}
