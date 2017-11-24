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
		setBorder(javax.swing.BorderFactory.createEtchedBorder());
		GridBagConstraints gc = new GridBagConstraints();
		


        QwordButton.setText("Qword");
     //   gc = new java.awt.GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 3;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(14, 13, 0, 25);
        add(QwordButton, gc);

        DwordButton.setText("Dword");
    //    gc = new java.awt.GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridwidth = 3;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(1, 13, 0, 0);
        add(DwordButton, gc);

        wordButton.setText("Word");
      //  gc = new java.awt.GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 2;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(1, 13, 0, 0);
        add(wordButton, gc);

        byteButton.setSelected(true);
        byteButton.setText("Byte");
    //    gc = new java.awt.GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 3;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(1, 13, 24, 0);
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
