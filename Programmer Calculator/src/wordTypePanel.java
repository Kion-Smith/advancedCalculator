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
		
		wordType = new ButtonGroup();
		
		wordType.add(QwordButton);
		wordType.add(DwordButton);
		wordType.add(wordButton);
		wordType.add(byteButton);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridx =1;
		gc.gridy =1;
		add(QwordButton,gc);
		
		gc.gridx =2;
		gc.gridy =2;
		add(DwordButton,gc);
		
		gc.gridx =3;
		gc.gridy =3;
		add(wordButton,gc);
		
		gc.gridx =4;
		gc.gridy =4;
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
