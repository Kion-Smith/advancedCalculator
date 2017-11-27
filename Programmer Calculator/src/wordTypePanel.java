import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
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
		setBorder(BorderFactory.createEtchedBorder());
		GridBagConstraints gc = new GridBagConstraints();
		
		QwordButton.setSelected(true);

	    gc.anchor = GridBagConstraints.FIRST_LINE_START;
	    
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 3;
        gc.insets = new Insets(10, 5, 0, 25);
        add(QwordButton, gc);


        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridwidth = 3;
        gc.insets = new Insets(1, 5, 0, 0);
        add(DwordButton, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 2;
        gc.insets = new Insets(1, 5, 0, 0);
        add(wordButton, gc);


        gc.gridx = 0;
        gc.gridy = 3;
        gc.insets = new Insets(1, 5, 15, 0);
        add(byteButton, gc);
		
		
		
		
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
