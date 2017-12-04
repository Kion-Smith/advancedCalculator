import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

/*NAME: Kion Smith
 * ID: kls160430
 * CLASS: CS2336.502
 * 
 * 
 * Places JPanel object and also does calculation
 */

public class Calculator extends JFrame implements ActionListener
{
	//the panels
	private outputPanel op;
	private bitsPanel bp;
	private calculatorButtonsPanel cbp;
	private baseTypePanel btp;
	private wordTypePanel wtp;
	//items for the menu bar
	public JMenuBar menu;
	public JMenu viewMenu,editMenu,helpMenu;
	public JMenuItem aboutItem,viewItem,hideItem,copyItem;
	//holding inputs(i.e input and base)
	public Stack<String> s;
	public int base =10;
	
	public Calculator()
	{
		//creating menu bar
		menu = new JMenuBar();
		//creating menu parts
		viewMenu = new JMenu("View");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		//creating the menu subsections
		aboutItem = new JMenuItem("About");
		viewItem= new JMenuItem("Hide");
		hideItem= new JMenuItem("Show");
		copyItem= new JMenuItem("Copy");
		
	
		
		//adding to menu bar
		menu.add(viewMenu);
		menu.add(editMenu);
		menu.add(helpMenu);
		
		setJMenuBar(menu);
		//adding menuitems to the viewmenu
		viewMenu.add(viewItem);
		viewMenu.add(hideItem);
		//adding menuitems to the editmenu
		editMenu.add(copyItem);
		//adding menuitems to the helpmenu
		helpMenu.add(aboutItem);
		
		// add the panels here
		op = new outputPanel();
		bp = new bitsPanel();
		cbp = new calculatorButtonsPanel();
		btp = new baseTypePanel();
		wtp = new wordTypePanel();
		
		//set the layout gridbaglayout
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		//add the elements to the JFrame
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		//Output panel
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 2;
        gc.insets = new Insets(50, 5,30, 5);
		add(op,gc);
		
		//bits panel
		gc.gridx = 0;
		gc.gridy = 1;
        gc.gridwidth = 2;
        gc.ipady = 0;
        gc.insets = new Insets(-20, 5, 0, 5);
		add(bp,gc);
		
		//Base type panel
		gc.gridx = 0;
		gc.gridy = 2;
		gc.insets = new Insets(10, 5, 0, 0);
		add(btp,gc);
		
		//Word type panel	
		gc.gridx = 0;
		gc.gridy = 3;
		add(wtp,gc);
	
		//calc buttons panel
		gc.gridx = 1;
		gc.gridy = 2;
		gc.gridheight = 2;	
		gc.insets = new Insets(5, 120, 0, 5);
		add(cbp,gc);
		
		
		//adding all buttons to action listener
		Component[] baseTypeComp = btp.getComponents(); //set component to  all the componets in the panel
		for(int i =0;i<baseTypeComp.length;i++)//iterate through the amout of elements
		{
			if(baseTypeComp[i] instanceof JRadioButton)//look for all the instances of Jradiobuttons
			{
				JRadioButton temp = (JRadioButton)baseTypeComp[i];///set it to temp
				temp.addActionListener(this);//add the current but to actionlister
			}
		}
		//same as the first but for calc button
		Component[] calcButtonsComp = cbp.getComponents();
		for(int i =0;i<calcButtonsComp.length;i++)
		{
			if(calcButtonsComp[i] instanceof JButton)
			{
				JButton temp = (JButton)calcButtonsComp[i];
				temp.addActionListener(this);
			}
		}
		
		//add the menu items to action listener
		aboutItem.addActionListener(this);
		copyItem.addActionListener(this);
		viewItem.addActionListener(this);
		hideItem.addActionListener(this);

		//set the stack to the defaul value
		s = new Stack<String>();
		if(s.isEmpty())
		{
			defaultValue();
		}
		
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		//general items to add the stack
		int num1 =0;
		int num2 =0;
		String sign = "";
		String output ="";
		
		if(e.getSource() == copyItem)
		{
			//copy the item within the text area
			 output = op.getOutputTextArea().getText();//get the string
			StringSelection stringSelection = new StringSelection(output);//select the string
			Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();//create clipboard element
			clpbrd.setContents(stringSelection, null);//set the clipboard to these items
		}
		if(e.getSource() == viewItem)
		{
			//hide all elements
			op.setVisible(false);
			bp.setVisible(false);
			cbp.setVisible(false);
			btp.setVisible(false);
			wtp.setVisible(false);
		}
		if(e.getSource() == hideItem)
		{
			//show all the elements
			op.setVisible(true);
			bp.setVisible(true);
			cbp.setVisible(true);
			btp.setVisible(true);
			wtp.setVisible(true);
		}
		if(e.getSource() == aboutItem)
		{
			//create a new frame
			JFrame about = new JFrame();
			
			//set the name for the frame and size and set to visible
			about.setTitle("About");
			about.setSize(460,406);
			about.setVisible(true);
			about.setResizable(false);
			//add the about panel to the jframe
			about.setContentPane(new aboutPanel());
			
		}
		
		//it base is this type
		if(btp.getHexButton().isSelected())
		{
			
			base = 16;
			//same as in the constructor(ie looking through all the elements)
			Component[] calcButtonsComp = cbp.getComponents();
			for(int i =0;i<calcButtonsComp.length;i++)
			{
				if(calcButtonsComp[i] instanceof JButton)
				{
					JButton temp = (JButton)calcButtonsComp[i];
					try 
					{
						//if the elemenet is a hex letter
						if(isHex(temp.getText()))
						{
							//enable button
							temp.setEnabled(true);
						}
						//add the the number
						if(Integer.parseInt(temp.getText()) <= 9 )
						{
							temp.setEnabled(true);
						}
						else
						{
							//if none then disable buttons
							temp.setEnabled(false);
						}
						
						
					}
					catch(Exception ex)
					{
						
					}
					
					
				}
			}
			
			try
			{
				//show base
				displaySum(s.peek());
			}
			catch(Exception ex)
			{
				
			}

		}
		if(btp.getDecButton().isSelected())
		{
			base = 10;
			//same as before
			Component[] calcButtonsComp = cbp.getComponents();
			for(int i =0;i<calcButtonsComp.length;i++)
			{
				if(calcButtonsComp[i] instanceof JButton)
				{
					JButton temp = (JButton)calcButtonsComp[i];
					try 
					{
						//if is hex
						if(isHex(temp.getText()))
						{
							//disable
							temp.setEnabled(false);
						}
						if(Integer.parseInt(temp.getText()) <= 9 )
						{
							//enable the numbers
							temp.setEnabled(true);
						}
						else
						{
							//disable other buttons
							temp.setEnabled(false);
						}
					}
					catch(Exception ex)
					{
						
					}
				}
			}
			
			try
			{
				//if input is there, then display the input in this base
				displaySum(s.peek());
			}
			catch(Exception ex)
			{
				
			}
			
		}
		if(btp.getOctButton().isSelected())
		{
			//same as before
			base = 8;
			Component[] calcButtonsComp = cbp.getComponents();
			for(int i =0;i<calcButtonsComp.length;i++)
			{
				if(calcButtonsComp[i] instanceof JButton)
				{
					JButton temp = (JButton)calcButtonsComp[i];
					try 
					{
						//if hex,disable it
						if(isHex(temp.getText()))
						{
							temp.setEnabled(false);
						}
						if(Integer.parseInt(temp.getText()) < 8 )
						{
							//add all buttons up to 7
							temp.setEnabled(true);
						}
						else
						{
							//disable the others
							temp.setEnabled(false);
						}
					}
					catch(Exception ex)
					{
						
					}
				}
			}
			
			try
			{
				//convert number
				displaySum(s.peek());
			}
			catch(Exception ex)
			{
				
			}
		}
		if(btp.getBinButton().isSelected())
		{
			//same as before
			base = 2;
			Component[] calcButtonsComp = cbp.getComponents();
			for(int i =0;i<calcButtonsComp.length;i++)
			{	
				if(calcButtonsComp[i] instanceof JButton)
				{
					JButton temp = (JButton)calcButtonsComp[i];
					try 
					{
						//disable hex
						if(isHex(temp.getText()))
						{
							temp.setEnabled(false);
						}
						if(Integer.parseInt(temp.getText()) <=1 )
						{
							//disable up until 1
							temp.setEnabled(true);
						}
						else
						{
							//disable the other buttons
							temp.setEnabled(false);
						}
					}
					catch(Exception ex)
					{
						
					}
				}

			}
			try
			{
				//change base
				displaySum(s.peek());
			}
			catch(Exception ex)
			{
				
			}
		}
	
		
		//check the buttons
		Component[] calcButtonsComp = cbp.getComponents();
		for(int i =0;i<calcButtonsComp.length;i++)
		{
			if(calcButtonsComp[i] instanceof JButton)
			{
				JButton temp = (JButton)calcButtonsComp[i];
				
			
				//if temp is selected
				if(temp == e.getSource())
				{
					// if the stack is empty, add default 0
					if(s.isEmpty())
					{
						defaultValue();
					}
					// if the stack is empty and the input is not an operator
					else if(s.isEmpty() && !isOperator(temp.getText()))
					{
						//push the temp
						s.push(temp.getText());
						displayNum((s.peek()));//display the number

					}
					// if stack has elements
					else if(!s.isEmpty())
					{
						
						
						if(temp.getText().equals("C ") && !s.isEmpty())
						{
							//while its not empty clear it
							while(!s.isEmpty())
							{
								s.pop();
								
							}
							defaultValue();
						}
						else if(isNum(s.peek()) && temp.getText().equals("\u00B1"))
						{
							// mult the input to -1 to set negative/positive
							int tempInt =Integer.parseInt(s.peek()) * -1;
							s.pop();
							s.push(tempInt+"");
							if(Integer.parseInt(s.peek())<0)
							{
								tempInt *= -1;
								displayNum(tempInt+"-");//have to display like this because of the way numbers are added
							}
							else
							{
								
								displayNum(tempInt+"");
							}
						}
						else if((temp.getText().equals("CE") ||temp.getText().equals("\u2190")) && !s.isEmpty())
						{
							//clear the last element if its a number
							if(isNum(s.peek()))
							{
								s.pop();//get rid of last element
							}
							if(s.isEmpty())
							{
								//if empty set to zero
								defaultValue();
							}
						}
						else if(!s.isEmpty() && isOperator(s.peek()) && isOperator(temp.getText()) )
						{
							//change operator if  the next button is an operator
							s.pop();
							s.push(temp.getText());

						}
					
						else if(isNum(s.peek()) && isNum(temp.getText()) )
						{
							//if another number is being selected but another operator has not, push the numbers togther
							int num = Integer.parseInt(s.peek())*10;
							num += Integer.parseInt(temp.getText());
							//pop the old number and pus the new one
							s.pop();
							s.push(num+"");
							
							displayNum((s.peek()));
						
						}
						else if(isHex(s.peek())&&isNum(temp.getText()))
						{
							//if hex, and next element is a num, add it to the string
							if(!s.peek().equals("0"))
							{
								String num = s.peek();
								num += (temp.getText());
								s.pop();
								s.push(num+"");
							}
							else
							{
								String num= s.peek();
								num = hexToDecimal(num)+"";
								num += temp.getText();
								s.pop();
								s.push(temp.getText());
							}
							displayNum(s.peek());

						}
						
						
						else if(isNum(s.peek())&&isHex(temp.getText()))
						{
							//if number comes before hex, push them togther
							if(!s.peek().equals("0"))
							{
								String num = s.peek();
								num += (temp.getText());
								s.pop();
								s.push(num+"");
							}
							else
							{
								s.pop();
								s.push(temp.getText());
							}
							displayNum(s.peek());
						}
						
						else if(isHex(temp.getText()))
						{
							
							//push if its a solo hex number
							s.push(temp.getText());
							displayNum(s.peek());
						}
						else if(temp.getText().equals("=")&&s.size() ==3 && btp.getHexButton().isSelected())
						{
							
							//doing calculations, if hex
							try
							{
								//try to use the decimal version 
								num2 = Integer.parseInt(s.peek());
							}
							catch(NumberFormatException ex)
							{
								
								num2 = hexToDecimal(s.peek());
							}
							
							s.pop();
							//get the sign and pop
							sign = s.peek();
							s.pop();
							
							try 
							{
								//try to use the decimal version 
								num1 = Integer.parseInt(s.peek());
							}
							catch(NumberFormatException ex)
							{
								// use the hex version 
								num1 = hexToDecimal(s.peek());
				
							}
							s.pop();
							
							s.push( doCalculation(num1,num2,sign)+"" );
							displaySum(s.peek());
						}
						else if(temp.getText().equals("=")&&s.size() ==3 && (btp.getDecButton().isSelected() ))
						{
							//same as before, without need to convert
							num2 = Integer.parseInt(s.peek());
							s.pop();
							
							sign = s.peek();
							s.pop();
							
							num1 = Integer.parseInt(s.peek());
							s.pop();
							
							s.push( doCalculation(num1,num2,sign)+"" );
							displaySum(Integer.parseInt(s.peek())+"");
						}
						
						else if(temp.getText().equals("=")&&s.size() ==3 && btp.getOctButton().isSelected())
						{
							//same as before
							num2 = OctalTodecimal(s.peek());
							s.pop();
							
							sign = s.peek();
							s.pop();
							
							num1 = OctalTodecimal(s.peek());
							s.pop();
							
							s.push( doCalculation(num1,num2,sign)+"" );
							displaySum(s.peek());
							
						}
						else if(temp.getText().equals("=")&&s.size() ==3 && btp.getBinButton().isSelected())
						{
							//same as before
							num2 = BinaryTodecimal(s.peek());
							s.pop();
							
							sign = s.peek();
							s.pop();
							
							num1 = Integer.parseInt(s.peek());
							s.pop();
							
							s.push( doCalculation(num1,num2,sign)+"" );
							displaySum(s.peek());
							
							
						}
					
						else
						{
							
							//if the next input is an operator and stack is at capcity, do calc for last 3 elements then push new string
							if(s.size() ==3 && isOperator(temp.getText()))
							{
								//doing for base 16
								if(btp.getHexButton().isSelected())
								{
									try
									{
										num2 = Integer.parseInt(s.peek());
									}
									catch(NumberFormatException ex)
									{
										num2 = hexToDecimal(s.peek());
									}
									
									s.pop();
									
									sign = s.peek();
									s.pop();
									
									try 
									{
										
										num1 = Integer.parseInt(s.peek());
									}
									catch(NumberFormatException ex)
									{
										num1 = hexToDecimal(s.peek());
						
									}
									s.pop();

								}
								else if(btp.getDecButton().isSelected())
								{
									//doing for base 10
									num2 = Integer.parseInt(s.peek());
									s.pop();
									
									sign = s.peek();
									s.pop();
									
									num1 = Integer.parseInt(s.peek());
									s.pop();
								}
								else if(btp.getOctButton().isSelected())
								{
									//doing for base 8
									try 
									{
										num2 = OctalTodecimal(s.peek());
									}
									catch(NumberFormatException ex)
									{
										num2 = Integer.parseInt(decimalToBinary(Integer.parseInt(s.peek())));
									}
									s.pop();
									
									sign = s.peek();
									s.pop();

									try 
									{
										num1 = OctalTodecimal(s.peek());
									}
									catch(NumberFormatException ex)
									{
										num2 = Integer.parseInt(decimalToBinary(Integer.parseInt(s.peek())));
									}
									s.pop();
								}
								else if(btp.getBinButton().isSelected())
								{
									//doing for base 2
									try
									{
										num2 = BinaryTodecimal(s.peek());
									}
									catch(NumberFormatException ex)
									{
										num2 = Integer.parseInt(decimalToBinary(Integer.parseInt(s.peek())));
									}
									
									s.pop();
									
									sign = s.peek();
									s.pop();
									
									try
									{
										num1 = BinaryTodecimal(s.peek());
									}
									catch(NumberFormatException ex)
									{
										num1 = Integer.parseInt(decimalToBinary(Integer.parseInt(s.peek())));
									}
									
									
									s.pop();
									
									
									
									
									
								
								}
								s.push(doCalculation(num1,num2,sign)+"");//do the calc
								displaySum((s.peek()));
							}
							s.push(temp.getText());
						}
						
						
					}
				}
			}
			
			
		}
		
		try
		{
			
			bp.getBitsPanel().setText("");
			String tempBinary =decimalToBinary(Integer.parseInt(s.peek()));

			int count =tempBinary.length();
			//while there are more zeros add those zeros and then add the bits panel
			for(int i =0;i<=(63-count);i++)
			{
				if(i ==0)
				{
					bp.getBitsPanel().append("                             ");
				}
				bp.getBitsPanel().append("0");
				
				if(i== 63/2)
				{
					bp.getBitsPanel().append("\n\n                             ");
				}
				
			}
			bp.getBitsPanel().append(tempBinary);
			

		}
		catch(Exception ex)
		{
			
		}
		

		
		
		
		
	}
	//check to see if the item is an operator
	public boolean isOperator(String value)
	{
		if(value.equals("/")||value.equals("*")||value.equals("+")||value.equals("-")||value.equals("Mod")||value.equals("C ")||value.equals("CE") ||value.equals("\u2190")||value.equals("="))
		{
			return true;
		}
		return false;
	}
	//check to see if it is a number
	public boolean isNum(String value) 
	{
		try 
		{
			Integer.parseInt(value);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	//add the numbers togther
	public String doCalculation(int num1,int num2,String sign)
	{
		int answer =0;
		String answerString ="";
		
		if(sign.equals("+"))
		{
			answer =num1+num2;
		}
		else if(sign.equals("-"))
		{
			answer =num1-num2;
		}
		else if(sign.equals("*"))
		{
			answer =num1*num2;
		}
		else if(sign.equals("/"))
		{
			//if cannot do this, then divide by zero
			try
			{
				answer =num1/num2;
			}
			catch(Exception ex) 
			{
				op.outputTextArea.setText("Cannot divde by 0");
				return "Cannot divde by 0";
			}
			
		}
		else if(sign.equals("Mod"))
		{
			answer= num1%num2;
		}
		return answer+"";
	}
	//out put the current number
	public void displayNum(String num)
	{
		
		op.outputTextArea.setFont(new Font("Arial", Font.PLAIN, 30) );
		op.outputTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		op.outputTextArea.setText("\n"+num+"");
	}
	//output the sum
	public String displaySum(String num)
	{
		op.outputTextArea.setFont(new Font("Arial", Font.PLAIN, 30) );
		op.outputTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		if(isNum(num))//check to make sure its in base 10
		{
			if(btp.getHexButton().isSelected())
			{
				String numString = decimalToHex(Integer.parseInt(num));
				op.outputTextArea.setText("\n"+numString);
			}
			else if(btp.getDecButton().isSelected())
			{
				op.outputTextArea.setText("\n"+num+"");
			}
			else if(btp.getOctButton().isSelected())
			{
				String numString = decimalToOctal(Integer.parseInt(num));
				op.outputTextArea.setText("\n"+numString+"");
			}
			else if(btp.getBinButton().isSelected())
			{
				String numString = decimalToBinary(Integer.parseInt(num));
				op.outputTextArea.setText("\n"+numString+"");
			}
		}
		return num;
	}
	//check to see if its a hex string
	public boolean isHex(String input)
	{
		if(input.equals("A")||input.equals("B")||input.equals("C")||input.equals("D")||input.equals("E")||input.equals("F"))
		{
			return true;
		}
		return false;
	}
	//create the default value		
	public void defaultValue()
	{
			s.push(0+"");
			displayNum(s.peek());
	}
	
	//conversions
	public int hexToDecimal(String num)
	{
		 String digits = "0123456789ABCDEF";
	     num = num.toUpperCase();
	     int sum = 0;
	     for (int i = 0; i < num.length(); i++) 
	     {
	            char c = num.charAt(i);
	            int d = digits.indexOf(c);
	            sum = 16*sum + d;
	     }
	        return sum;
	}
	public int OctalTodecimal(String num)
	{
		return Integer.parseInt(num,8);
	}
	public int BinaryTodecimal(String num)
	{
		return Integer.parseInt(num,2);
	}
	
	public String decimalToHex(int num)
	{
		return (Integer.toHexString(num)).toUpperCase();
	}
	public String decimalToOctal(int num)
	{
		return Integer.toOctalString(num);
	}
	public String decimalToBinary(int num)
	{
		return Integer.toBinaryString(num);
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