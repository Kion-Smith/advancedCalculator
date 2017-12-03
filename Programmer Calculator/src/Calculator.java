import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;


public class Calculator extends JFrame implements ActionListener
{
	private outputPanel op;
	private bitsPanel bp;
	private calculatorButtonsPanel cbp;
	private baseTypePanel btp;
	private wordTypePanel wtp;
	
	
	/*
	String bitsString="     0000      0000      0000      0000                 0000      0000      0000      0000     \n"+
			 "                                                                                           \n"+
			 "     0000      0000      0000      0000                 0000      0000      0000      0000     \n"+
			 "                                                                                                                       0     ";*/
	//String[] array = bitsString.split("");
	
	JMenuBar menu;
	JMenu viewMenu,editMenu,helpMenu;
	JMenuItem aboutItem;
	Stack<String> s;
	int base =10;
	
	public Calculator()
	{
		// add the panels here
		menu = new JMenuBar();
		
		viewMenu = new JMenu("View");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		aboutItem = new JMenuItem("About");
		
		helpMenu.add(aboutItem);
		
		
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
		

		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 2;
        gc.insets = new Insets(50, 5,30, 5);
		add(op,gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
        gc.gridwidth = 2;
        gc.ipady = 0;
        gc.insets = new Insets(-20, 5, 0, 5);
		add(bp,gc);

		gc.gridx = 0;
		gc.gridy = 2;
		gc.insets = new Insets(10, 5, 0, 0);
		add(btp,gc);
			
		gc.gridx = 0;
		gc.gridy = 3;
		add(wtp,gc);
	
		gc.gridx = 1;
		gc.gridy = 2;
		gc.gridheight = 2;	
		gc.insets = new Insets(5, 120, 0, 5);
		add(cbp,gc);
		
		aboutItem.addActionListener(this);
		
		Component[] baseTypeComp = btp.getComponents();
		for(int i =0;i<baseTypeComp.length;i++)
		{
			if(baseTypeComp[i] instanceof JRadioButton)
			{
				JRadioButton temp = (JRadioButton)baseTypeComp[i];
				temp.addActionListener(this);
			}
		}
		
		Component[] wordTypeComp = wtp.getComponents();
		for(int i =0;i<wordTypeComp.length;i++)
		{
			if(wordTypeComp[i] instanceof JRadioButton)
			{
				JRadioButton temp = (JRadioButton)wordTypeComp[i];
				temp.addActionListener(this);
			}
		}
		
		
		Component[] calcButtonsComp = cbp.getComponents();
		for(int i =0;i<calcButtonsComp.length;i++)
		{
			if(calcButtonsComp[i] instanceof JButton)
			{
				JButton temp = (JButton)calcButtonsComp[i];
				temp.addActionListener(this);
			}
		}
		
		
		

		
		s = new Stack<String>();
		if(s.isEmpty())
		{
			defaultValue();
		}
		
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{

		int num1 =0;
		int num2 =0;
		String sign = "";
		
		
		if(e.getSource() == aboutItem)
		{
			JFrame about = new JFrame();
			
			about.setTitle("About");
			about.setSize(460,406);//620,580
			about.setVisible(true);
			about.setResizable(false);
			
			about.setContentPane(new aboutPanel());
			
		}
		
		if(btp.getHexButton().isSelected())
		{
			
			base = 16;
			Component[] calcButtonsComp = cbp.getComponents();
			for(int i =0;i<calcButtonsComp.length;i++)
			{
				if(calcButtonsComp[i] instanceof JButton)
				{
					JButton temp = (JButton)calcButtonsComp[i];
					try 
					{
						if(isHex(temp.getText()))
						{
							temp.setEnabled(true);
						}
						if(Integer.parseInt(temp.getText()) <= 9 )
						{
							temp.setEnabled(true);
						}
						else
						{
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
				displaySum(s.peek());
			}
			catch(Exception ex)
			{
				
			}
			//displaySum(s.peek());
		}
		if(btp.getDecButton().isSelected())
		{
			base = 10;
			Component[] calcButtonsComp = cbp.getComponents();
			for(int i =0;i<calcButtonsComp.length;i++)
			{
				if(calcButtonsComp[i] instanceof JButton)
				{
					JButton temp = (JButton)calcButtonsComp[i];
					try 
					{
						if(isHex(temp.getText()))
						{
							temp.setEnabled(false);
						}
						if(Integer.parseInt(temp.getText()) <= 9 )
						{
							temp.setEnabled(true);
						}
						else
						{
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
				displaySum(s.peek());
			}
			catch(Exception ex)
			{
				
			}
			
			//displaySum(s.peek());
		}
		if(btp.getOctButton().isSelected())
		{
			base = 8;
			Component[] calcButtonsComp = cbp.getComponents();
			for(int i =0;i<calcButtonsComp.length;i++)
			{
				if(calcButtonsComp[i] instanceof JButton)
				{
					JButton temp = (JButton)calcButtonsComp[i];
					try 
					{
						if(isHex(temp.getText()))
						{
							temp.setEnabled(false);
						}
						if(Integer.parseInt(temp.getText()) < 8 )
						{
							temp.setEnabled(true);
						}
						else
						{
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
				displaySum(s.peek());
			}
			catch(Exception ex)
			{
				
			}
		}
		if(btp.getBinButton().isSelected())
		{
			base = 2;
			Component[] calcButtonsComp = cbp.getComponents();
			for(int i =0;i<calcButtonsComp.length;i++)
			{	
				if(calcButtonsComp[i] instanceof JButton)
				{
					JButton temp = (JButton)calcButtonsComp[i];
					try 
					{
						if(isHex(temp.getText()))
						{
							temp.setEnabled(false);
						}
						if(Integer.parseInt(temp.getText()) <=1 )
						{
							temp.setEnabled(true);
						}
						else
						{
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
				displaySum(s.peek());
			}
			catch(Exception ex)
			{
				
			}
			//displaySum(s.peek());
		}
	
		
		//add the same for other bases
		
		Component[] calcButtonsComp = cbp.getComponents();
		for(int i =0;i<calcButtonsComp.length;i++)
		{
			if(calcButtonsComp[i] instanceof JButton)
			{
				JButton temp = (JButton)calcButtonsComp[i];
				
			
				
				if(temp == e.getSource())
				{

					if(s.isEmpty())
					{
						defaultValue();
					}
					else if(s.isEmpty() && !isOperator(temp.getText()))
					{
						
						System.out.println("zran");
						s.push(temp.getText());
						displayNum((s.peek()));
						
						
					}
					else if(!s.isEmpty())
					{
						
						
						if(temp.getText().equals("C ") && !s.isEmpty())
						{
							while(!s.isEmpty())
							{
								s.pop();
								
							}
							defaultValue();
						}
						else if(isNum(s.peek()) && temp.getText().equals("\u00B1"))
						{
							
							int tempInt =Integer.parseInt(s.peek()) * -1;
							s.pop();
							s.push(tempInt+"");
							if(Integer.parseInt(s.peek())<0)
							{
								tempInt *= -1;
								displayNum(tempInt+"-");
							}
							else
							{
								
								displayNum(tempInt+"");
							}
						}
						else if((temp.getText().equals("CE") ||temp.getText().equals("\u2190")) && !s.isEmpty())
						{
							if(isNum(s.peek()))
							{
								s.pop();
							}
							if(s.isEmpty())
							{
								defaultValue();
							}
						}
						else if(!s.isEmpty() && isOperator(s.peek()) && isOperator(temp.getText()) )
						{
							
							s.pop();
							s.push(temp.getText());

						}
					
						else if(isNum(s.peek()) && isNum(temp.getText()) )
						{
							System.out.println("zran");
							int num = Integer.parseInt(s.peek())*10;
							num += Integer.parseInt(temp.getText());
							
							s.pop();
							s.push(num+"");
							
							displayNum((s.peek()));
						
						}
						
						else if(isNum(s.peek())&&isHex(temp.getText()))
						{
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
							//System.out.println(num);
							//num = hexToDecimal(num)+"";
							//System.out.println(num);
							//s.pop();
							//s.push(num+"");
						}
						
						else if(isHex(temp.getText()))
						{
							
							//int num = hexToDecimal(temp.getText());
							
							s.push(temp.getText());
							displayNum(s.peek());
						}
						else if(temp.getText().equals("=")&&s.size() ==3 && btp.getHexButton().isSelected())
						{
							
						
							try
							{
								num2 = hexToDecimal(s.peek());
							}
							catch(NumberFormatException ex)
							{
								//num2 = hexToDecimal(Integer.parseInt(s.peek())+"");
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
							
							s.push( doCalculation(num1,num2,sign)+"" );
							displaySum(s.peek());
						}
						else if(temp.getText().equals("=")&&s.size() ==3 && (btp.getDecButton().isSelected() ))
						{
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
							
							num2 = 
									BinaryTodecimal(s.peek());
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
							if(s.size() ==3 && isOperator(temp.getText()))
							{
								//String holdSign = s.peek();
								//s.pop();
								
								//String holdSign = temp.getText();
								if(base == 16)
								{
									try
									{
										num2 = hexToDecimal(s.peek());
									}
									catch(NumberFormatException ex)
									{
										//num2 = hexToDecimal(Integer.parseInt(s.peek())+"");
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
									//System.out.println(num1+sign+num2);
								}
								else if(base == 10)
								{
									num2 = Integer.parseInt(s.peek());
									s.pop();
									
									sign = s.peek();
									s.pop();
									
									num1 = Integer.parseInt(s.peek());
									s.pop();
								}
								else if(btp.getOctButton().isSelected())
								{
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
									
									//num1 = Integer.parseInt(decimalToOctal(Integer.parseInt(s.peek())));
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
									/*
									 * num2 = BinaryTodecimal(s.peek());
									s.pop();
							
									sign = s.peek();
									s.pop();
							
									num1 = BinaryTodecimal(s.peek());
									s.pop();
							
									 */
									
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
								s.push(doCalculation(num1,num2,sign)+"");
								displaySum((s.peek()));
								//s.push(holdSign);
							}
							s.push(temp.getText());
						}
						
						
					}
					/*
					if(!s.isEmpty() && isNum(s.peek()))
					{
						op.outputTextArea.setText(s.peek());
					}*/
				
				}
			}
			
			
		}
		
		try
		{
			
			bp.getBitsPanel().setText("");
			String tempBinary =decimalToBinary(Integer.parseInt(s.peek()));

			int count =tempBinary.length();
			
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
			
			//bp.getBitsPanel().setText("");
		/**/

		}
		catch(Exception ex)
		{
			
		}
		
		System.out.println( s.toString());
		
		
		
		
	}
	
	public boolean isOperator(String value)
	{
		if(value.equals("/")||value.equals("*")||value.equals("+")||value.equals("-")||value.equals("Mod")||value.equals("C ")||value.equals("CE") ||value.equals("\u2190")||value.equals("="))
		{
			return true;
		}
		return false;
	}
	
	public boolean isNum(String value) //change to is value
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
			answer =num1/num2;
		}
		else if(sign.equals("Mod"))
		{
			answer= num1%num2;
		}
		
		//if(btp.getHexButton().isSelected())
		//{
			//answerString = decimalToHex(answer);
			//op.outputTextArea.setText("\n"+numString);
			//return answerString;
		//}
		return answer+"";
	}
	
	public void displayNum(String num)
	{
		
		op.outputTextArea.setFont(new Font("Arial", Font.PLAIN, 30) );
		op.outputTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		///if(btp.getHexButton().isSelected())
		//{
			//String numString = decimalToHex(num);
			//op.outputTextArea.setText("\n"+numString);
		//}
	//	else if(btp.getDecButton().isSelected())
	//	{
			op.outputTextArea.setText("\n"+num+"");
		//}
		System.out.println(hexToDecimal(num+""));
	//	System.out.println(hexToDecimal(numString+""));
	}
	public String displaySum(String num)
	{
		op.outputTextArea.setFont(new Font("Arial", Font.PLAIN, 30) );
		op.outputTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		if(isNum(num))
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
	
	public boolean isHex(String input)
	{
		if(input.equals("A")||input.equals("B")||input.equals("C")||input.equals("D")||input.equals("E")||input.equals("F"))
		{
			return true;
		}
		return false;
	}
			
	public void defaultValue()
	{
			s.push(0+"");
			displayNum(s.peek());
	}
	
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