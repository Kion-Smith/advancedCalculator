import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class baseTypePanel extends JPanel
{
	JRadioButton hexButton,decButton,octButton,binButton;
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
