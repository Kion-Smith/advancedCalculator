import java.awt.Component;
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
import javax.swing.JRadioButton;


public class Calculator extends JFrame implements ActionListener
{
	private outputPanel op;
	private bitsPanel bp;
	private calculatorButtonsPanel cbp;
	private baseTypePanel btp;
	private wordTypePanel wtp;
	
	JMenuBar menu;
	JMenu viewMenu,editMenu,helpMenu;
	Stack<String> s;
	
	
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
		

		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 2;
        gc.insets = new Insets(40, 5,30, 5);
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
		
		
	}

	
	public void actionPerformed(ActionEvent e) 
	{

		int num1 =0;
		int num2 =0;
		String sign = "";
		String inputs="";


		
		if(btp.getHexButton().isSelected())
		{
			cbp.a_Button.setEnabled(true);
			cbp.b_Button.setEnabled(true);
			cbp.c_Button.setEnabled(true);
			cbp.d_Button.setEnabled(true);
			cbp.e_Button.setEnabled(true);
			cbp.f_Button.setEnabled(true);

		}
		else
		{
			cbp.a_Button.setEnabled(false);
			cbp.b_Button.setEnabled(false);
			cbp.c_Button.setEnabled(false);
			cbp.d_Button.setEnabled(false);
			cbp.e_Button.setEnabled(false);
			cbp.f_Button.setEnabled(false);
			
		}
		
		Component[] calcButtonsComp = cbp.getComponents();
		for(int i =0;i<calcButtonsComp.length;i++)
		{
			if(calcButtonsComp[i] instanceof JButton)
			{
				JButton temp = (JButton)calcButtonsComp[i];
				
				if(temp == e.getSource())
				{
					if(s.isEmpty()&&!isOperator(temp.getText()))
					{
						s.push(temp.getText());
					}
					else if(temp.getText().equals("C ") && !s.isEmpty())
					{
						while(!s.isEmpty())
						{
							s.pop();
						}
					}
					else if((temp.getText().equals("CE") ||temp.getText().equals("\u2190")) && !s.isEmpty())
					{
						if(isNum(s.peek()))
						{
							s.pop();
						}
					}
					else if(isOperator(s.peek()) && isOperator(temp.getText()))
					{
						s.pop();
						s.push(temp.getText());
					}
					else if(isNum(s.peek()) && isNum(temp.getText()) )
					{
						int num = Integer.parseInt(s.peek())*10;
						num += Integer.parseInt(temp.getText());
						s.pop();
						s.push(num+"");
					
					}

					else if(temp.getText().equals("="))
					{
						num2 = Integer.parseInt(s.peek());
						s.pop();
						
						sign = s.peek();
						s.pop();
						
						num1 = Integer.parseInt(s.peek());
						s.pop();
						
						s.push( doCalculation(num1,num2,sign)+"" );
//
					}
					/*
					else if( isOperator(s.peek()) && isNum(temp.getText()))
					{
						int loc = 0;
						String[] tempString = new String[3];
						s.push(temp.getText());
						while(!s.isEmpty())
						{
							if(isNum(s.peek()))
							{
								tempString[loc] =s.peek()+"";
								s.pop();
								loc++;
								
							}
							else if(isOperator(s.peek()))
							{
								tempString[loc] = s.peek();
								s.pop();
								loc++;
							}
						}
						for(int x =0;x<tempString.length;x++)
						{
							System.out.println(tempString[x]);
						}
						//num1 = Integer.parseInt(tempString[1]);
						//sign =tempString[0];
						//num2 = Integer.parseInt(tempString[2]);
						//s.push(doCalculation(num1,num2,sign)+"" );
						//s.push(temp.getText());
					}*/
					//need one for ic just doing costant operations
					else
					{
						int loc =0;
						String[] tempString = new String[3];
						Stack<String> tempStack = new Stack<String>();
						tempStack = (Stack<String>) s.clone();
						while(!s.isEmpty())
						{
						
							tempString[loc] =tempStack.peek();
			
							if(loc <=4)
							{
								
							}
						}
						s.push(temp.getText());
					}
					
					
				}
			}
			
			
		}
		
		System.out.println( s.toString());
		
		
		
	}
	
	public boolean isOperator(String value)
	{
		if(value.equals("/")||value.equals("*")||value.equals("+")||value.equals("-")||value.equals("Mod"))
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
	
	public int doCalculation(int num1,int num2,String sign)
	{
		int answer =0;
		
		
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
		
		return answer;
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
