import javax.swing.JButton;
import javax.swing.JPanel;

public class calculatorButtonsPanel extends JPanel
{
	JButton zeroButton,oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,sevenButton,eightButton,nineButton,//base 10 buttons
			a_Button,b_Button,c_Button,d_Button,e_Button,f_Button,//Hex buttons
			addButton,subButton,multButton,divButton,signButton,equalsButton,modButton,
			decimalButton,sqrtButton,percentButton,recipButton; //all disable buttons
	
	


	public calculatorButtonsPanel()
	{
		//the value buttons
		zeroButton = new JButton();
		oneButton = new JButton();
		twoButton = new JButton();
		threeButton = new JButton();
		fourButton = new JButton();
		fiveButton =  new JButton();
		sixButton =  new JButton();
		sevenButton =  new JButton();
		eightButton =  new JButton();
		nineButton =  new JButton();
		a_Button =  new JButton();
		b_Button =  new JButton();
		c_Button =  new JButton();
		d_Button =  new JButton();
		e_Button =  new JButton();
		f_Button =  new JButton();
		
		//Functional buttons
		addButton =  new JButton();
		subButton =  new JButton();
		multButton =  new JButton();
		divButton =  new JButton();
		signButton =  new JButton();
		equalsButton =  new JButton();
		modButton =  new JButton();
		
		//Disabled Buttons
		decimalButton =  new JButton();
		sqrtButton =  new JButton();
		percentButton =  new JButton();
		recipButton =  new JButton();
		
		//disable the buttons
		decimalButton.setEnabled(false);
		sqrtButton.setEnabled(false);
		percentButton.setEnabled(false);
		recipButton.setEnabled(false);
	}
	//Getters
	public JButton getZeroButton() 
	{
		return zeroButton;
	}


	public JButton getOneButton() 
	{
		return oneButton;
	}


	public JButton getTwoButton() 
	{
		return twoButton;
	}


	public JButton getThreeButton() 
	{
		return threeButton;
	}


	public JButton getFourButton() 
	{
		return fourButton;
	}


	public JButton getFiveButton() 
	{
		return fiveButton;
	}

	public JButton getSixButton() 
	{
		return sixButton;
	}


	public JButton getSevenButton() 
	{
		return sevenButton;
	}


	public JButton getEightButton() 
	{
		return eightButton;
	}


	public JButton getNineButton() 
	{
		return nineButton;
	}


	public JButton getA_Button() 
	{
		return a_Button;
	}


	public JButton getB_Button() 
	{
		return b_Button;
	}


	public JButton getC_Button() 
	{
		return c_Button;
	}


	public JButton getD_Button() {
		return d_Button;
	}


	public JButton getE_Button() {
		return e_Button;
	}


	public JButton getF_Button() {
		return f_Button;
	}


	public JButton getAddButton() {
		return addButton;
	}


	public JButton getSubButton() {
		return subButton;
	}


	public JButton getMultButton() {
		return multButton;
	}


	public JButton getDivButton() {
		return divButton;
	}


	public JButton getSignButton() {
		return signButton;
	}


	public JButton getEqualsButton() {
		return equalsButton;
	}


	public JButton getModButton() {
		return modButton;
	}


	public JButton getDecimalButton() {
		return decimalButton;
	}


	public JButton getSqrtButton() {
		return sqrtButton;
	}


	public JButton getPercentButton() {
		return percentButton;
	}


	public JButton getRecipButton() {
		return recipButton;
	}

	//setters
	public void setZeroButton(JButton j) 
	{
		zeroButton = j;
	}

	public void setOneButton(JButton j) 
	{
		oneButton = j;
	}

	public void setTwoButton(JButton j) 
	{
		twoButton = j;
	}

	public void setThreeButton(JButton j) 
	{
		threeButton = j;
	}

	public void setFourButton(JButton j)
	{
		fourButton = j;
	}

	public void setFiveButton(JButton j) 
	{
		fiveButton = j;
	}

	public void setSixButton(JButton j) 
	{
		sixButton = j;
	}

	public void setSevenButton(JButton j) 
	{
		sevenButton = j;
	}

	public void setEightButton(JButton j) 
	{
		eightButton = j;
	}

	public void setNineButton(JButton j) 
	{
		nineButton = j;
	}

	public void setA_Button(JButton j) 
	{
		a_Button = j;
	}

	public void setB_Button(JButton j) 
	{
		b_Button = j;
	}

	public void setC_Button(JButton j) 
	{
		c_Button = j;
	}

	public void setD_Button(JButton j) 
	{
		d_Button = j;
	}

	public void setE_Button(JButton j) 
	{
		e_Button = j;
	}

	public void setF_Button(JButton j) 
	{
		f_Button = j;
	}

	public void setAddButton(JButton j) 
	{
		addButton = j;
	}

	public void setSubButton(JButton j) 
	{
		subButton = j;
	}

	public void setMultButton(JButton j) 
	{
		multButton = j;
	}

	public void setDivButton(JButton j) 
	{
		divButton = j;
	}

	public void setSignButton(JButton j) 
	{
		signButton = j;
	}

	public void setEqualsButton(JButton j) 
	{
		equalsButton = j;
	}

	public void setModButton(JButton j) 
	{
		modButton = j;
	}

	public void setDecimalButton(JButton j) 
	{
		decimalButton = j;
	}

	public void setSqrtButton(JButton j) 
	{
		sqrtButton = j;
	}

	public void setPercentButton(JButton j) 
	{
		percentButton = j;
	}

	public void setRecipButton(JButton j) 
	{
		recipButton = j;
	}

	
}
