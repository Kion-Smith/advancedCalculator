import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class Calculator extends JFrame implements ActionListener
{
	private menuPanel mp;
	private outputPanel op;
	private bitsPanel bp;
	private calculatorButtonsPanel cbp;
	private baseTypePanel btp;
	private wordTypePanel wtp;
	
	
	public Calculator()
	{
		// add the panels here
		
		mp = new menuPanel();
		op = new outputPanel();
		bp = new bitsPanel();
		cbp = new calculatorButtonsPanel();
		btp = new baseTypePanel();
		wtp = new wordTypePanel();
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridx =1;
		gc.gridy =1;
		//
		add(mp,gc);
		
		gc.gridx =2;
		gc.gridy =2;
		add(op,gc);
		
		gc.gridx =3;
		gc.gridy =3;
		add(bp,gc);
		
		gc.gridx =4;
		gc.gridy =4;
	//unimplemented	
		add(cbp,gc);
		
		gc.gridx =5;
		gc.gridy =5;
		add(btp,gc);
		
		gc.gridx =6;
		gc.gridy =6;
		add(wtp,gc);
		
		
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

	//getters
	public menuPanel getMenuPanel() 
	{
		return mp;
	}

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

	public void setMenuPanel(menuPanel p) 
	{
		mp = p;
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
