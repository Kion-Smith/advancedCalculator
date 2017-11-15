import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class baseTypePanel extends JPanel
{
	JRadioButton hexButton,decButton,octButton,binButton;
	ButtonGroup baseType;
	
	public baseTypePanel()
	{
		hexButton = new JRadioButton("Hex");
		decButton = new JRadioButton("Dec");
		octButton = new JRadioButton("Oct");
		binButton = new JRadioButton("Bin");
		
		baseType.add(hexButton);
		baseType.add(decButton);
		baseType.add(octButton);
		baseType.add(binButton);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		

		add(hexButton,gc);
		add(decButton,gc);
		add(octButton,gc);
		add(binButton,gc);
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
