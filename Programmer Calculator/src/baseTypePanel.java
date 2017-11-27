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
		
		baseType = new ButtonGroup();
		
		baseType.add(hexButton);
		baseType.add(decButton);
		baseType.add(octButton);
		baseType.add(binButton);
		
		setBorder(javax.swing.BorderFactory.createEtchedBorder());
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		

        hexButton.setText("Hex");
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 3;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(10, 5, 0, 40);
        add(hexButton, gc);

        decButton.setText("Dec");
       // gc = new java.awt.GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridwidth = 3;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(1, 5, 0, 0);
        add(decButton, gc);

        octButton.setText("Oct");
       // gc = new java.awt.GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 2;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(1, 5, 0, 0);
        add(octButton, gc);

        binButton.setText("Bin");
        gc.gridx = 0;
        gc.gridy = 3;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(1, 5, 15, 0);
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
