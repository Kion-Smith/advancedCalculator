import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class wordTypePanel extends JPanel
{
	JRadioButton QwordButton,DwordButton,wordButton,byteButton;

	//getters
	public JRadioButton getQwordButton() 
	{
		return QwordButton;
	}
	public JRadioButton getDwordButton() 
	{
		return DwordButton;
	}
	
	public JRadioButton getWordButton() 
	{
		return wordButton;
	}
	public JRadioButton getByteButton() 
	{
		return byteButton;
	}

	//setters
	public void setQwordButton(JRadioButton j) 
	{
		QwordButton = j;
	}
	public void setDwordButton(JRadioButton j) 
	{
		DwordButton = j;
	}
	public void setWordButton(JRadioButton j) 
	{
		wordButton = j;
	}
	public void setByteButton(JRadioButton j) 
	{
		byteButton = j;
	}
}
