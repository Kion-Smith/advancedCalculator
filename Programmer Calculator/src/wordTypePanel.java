import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class wordTypePanel extends JPanel
{
	JRadioButton QwordButton,DwordButton,wordButton,byteButton;
	ButtonGroup wordType;
	
	public wordTypePanel()
	{
		QwordButton = new JRadioButton("Qword");
		DwordButton = new JRadioButton("Dword");
		wordButton = new JRadioButton("Word");
		byteButton = new JRadioButton("Byte");
		
		wordType.add(QwordButton);
		wordType.add(DwordButton);
		wordType.add(wordButton);
		wordType.add(byteButton);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		

		add(QwordButton,gc);
		add(DwordButton,gc);
		add(wordButton,gc);
		add(byteButton,gc);
		
		
		
		
	}

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
