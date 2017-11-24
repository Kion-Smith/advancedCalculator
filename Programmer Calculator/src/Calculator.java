import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class Calculator extends JFrame implements ActionListener
{
	private outputPanel op;
	private bitsPanel bp;
	private calculatorButtonsPanel cbp;
	private baseTypePanel btp;
	private wordTypePanel wtp;
	
	JMenuBar menu;
	JMenu viewMenu,editMenu,helpMenu;
	
	
	public Calculator()
	{
		// add the panels here
		menu = new JMenuBar();
		
		viewMenu = new JMenu("View");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		menu.add(viewMenu);
		menu.add(editMenu);
		menu.add(helpMenu);
		
		setJMenuBar(menu);
		

		op = new outputPanel();
		bp = new bitsPanel();
		cbp = new calculatorButtonsPanel();
		btp = new baseTypePanel();
		wtp = new wordTypePanel();
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		

		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 2;
		gc.ipadx = 647;
		gc.ipady = 80;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(16, 15, 0, 15);
		add(op,gc);
		
       
		gc.gridx = 0;
		gc.gridy = 1;
        gc.gridwidth = 2;
        gc.ipadx = 647;
        gc.ipady = 80;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 15, 0, 15);
		add(bp,gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.gridheight = 2;
		gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gc.insets = new java.awt.Insets(9, 9, 16, 15);
		add(cbp,gc);
		

		gc.gridx = 0;
		gc.gridy = 2;
		gc.ipadx = 34;
		gc.ipady = 13;
		gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gc.insets = new java.awt.Insets(9, 15, 0, 0);
		add(btp,gc);
		
		gc.gridx = 0;
		gc.gridy = 3;
		gc.ipadx = 12;
		gc.ipady = 10;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 15, 16, 0);
		add(wtp,gc);
		
		
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

	//getters

	public outputPanel getOutputPanel() 
	{
		return op;
	}

	public bitsPanel getBitsPanel() 
	{
		return bp;
	}

	public calculatorButtonsPanel getCalculatorButtonsPanel() 
	{
		return cbp;
	}
	public wordTypePanel getWordTypePanel() 
	{
		return wtp;
	}

	public baseTypePanel getBaseTypePanel() 
	{
		return btp;
	}

	//Setters
	public void setBitsPanel(bitsPanel p) 
	{
		bp = p;
	}


	public void setCalculatorButtonsPanel(calculatorButtonsPanel p) 
	{
		cbp = p;
	}

	public void setOutputPanel(outputPanel p) 
	{
		op = p;
	}

	public void setWordTypePanel(wordTypePanel p)
	{
		wtp = p;
	}
	
	public void setBaseTypePanel(baseTypePanel p) 
	{
		btp = p;
	}
}
