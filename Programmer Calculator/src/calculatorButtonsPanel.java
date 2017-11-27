import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class calculatorButtonsPanel extends JPanel
{
	JButton zeroButton,oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,sevenButton,eightButton,nineButton,//base 10 buttons
			a_Button,b_Button,c_Button,d_Button,e_Button,f_Button,//Hex buttons
			addButton,subButton,multButton,divButton,signButton,equalsButton,modButton,
			decimalButton,sqrtButton,percentButton,recipButton,
			emptyButton1,emptyButton2,emptyButton3,emptyButton4,emptyButton5,emptyButton6,emptyButton7,emptyButton8,emptyButton9,emptyButton10,emptyButton11
			,ceButton,mcButton,mrButton,plusButton,backspaceButton
			,plusMinsuButton,mMinusButton,mPlusButton,msButton,clearButton; //all disable buttons
	
	


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
		
		emptyButton1= new JButton();
		emptyButton2= new JButton();
		emptyButton3= new JButton();
		emptyButton4= new JButton();
		emptyButton5= new JButton();
		emptyButton6= new JButton();
		emptyButton7= new JButton();
		emptyButton8= new JButton();
		emptyButton9= new JButton();
		emptyButton10= new JButton();
		emptyButton11= new JButton();
		ceButton= new JButton();
		plusButton= new JButton();
		backspaceButton= new JButton();
		plusMinsuButton= new JButton();
		mcButton= new JButton();
		mrButton= new JButton();
		mMinusButton = new JButton();
		mPlusButton = new JButton();
		msButton = new JButton();
		clearButton= new JButton();
		
		//disable the buttons
		decimalButton.setEnabled(false);
		sqrtButton.setEnabled(false);
		percentButton.setEnabled(false);
		recipButton.setEnabled(false);
		
		emptyButton1.setEnabled(false);
		emptyButton2.setEnabled(false);
		emptyButton3.setEnabled(false);
		emptyButton4.setEnabled(false);
		emptyButton5.setEnabled(false);
		emptyButton6.setEnabled(false);
		emptyButton7.setEnabled(false);
		emptyButton8.setEnabled(false);
		emptyButton9.setEnabled(false);
		emptyButton10.setEnabled(false);
		emptyButton11.setEnabled(false);
		
		mcButton.setEnabled(false);
		mrButton.setEnabled(false);
		mMinusButton .setEnabled(false);
		mPlusButton .setEnabled(false);
		msButton .setEnabled(false);
		
		
		//setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        

       
        
        gc.gridx = 0;
        gc.gridy = 0;
        gc.ipadx = 11;
        gc.ipady = 28;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 2, 0, 0);
        add(emptyButton6, gc);
        
        gc.gridx = 0;
        gc.gridy = 1;
        gc.ipadx = 11;
        gc.ipady = 28;
    //    gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(0, 2, 0, 0);
        add(emptyButton7, gc);
        
        gc.gridx = 0;
        gc.gridy = 2;
        gc.ipadx = 11;
        gc.ipady = 28;
    //    gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-8, 2, 0, 0);
        add(emptyButton8, gc);
        
        gc.gridx = 0;
        gc.gridy = 3;
        gc.ipadx = 11;
        gc.ipady = 28;
     //   gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-16, 2, 0, 0);
        add(emptyButton9, gc);
        
        gc.gridx = 0;
        gc.gridy = 4;
        gc.ipadx = 11;
        gc.ipady = 28;
     //   gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-24, 2, 0, 0);
        add(emptyButton10, gc);
        
        gc.gridx = 0;
        gc.gridy = 5;
        gc.ipadx = 11;
        gc.ipady = 28;
     //   gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-32, 2, 0, 0);
        add(emptyButton11, gc);
        
        
        gc.gridx = 1;
        gc.gridy = 5;
        gc.ipadx = 11;
        gc.ipady = 28;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-32, 9, 2, 0);
        add(emptyButton1, gc);
        
        gc.gridx = 1;
        gc.gridy = 4;
        gc.ipadx = 11;
        gc.ipady = 28;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-24, 9, 0, 0);
        add(emptyButton2, gc);
        
        gc.gridx = 1;
        gc.gridy = 3;
        gc.ipadx = 11;
        gc.ipady = 28;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-16, 9, 0, 0);
        add(emptyButton3, gc);
        
        gc.gridx = 1;
        gc.gridy = 2;
        gc.ipadx = 11;
        gc.ipady = 28;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-8, 9, 0, 0);
        add(emptyButton4, gc);
        
       
        gc.gridx = 1;
        gc.gridy = 1;
        gc.ipadx = 11;
        gc.ipady = 28;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(0, 9, 0, 0);
        add(emptyButton5, gc);

        modButton.setText("Mod");
   
        Font font = new Font("Arial", Font.PLAIN, 12);
        modButton.setFont(font);
        
        modButton.setMargin(new Insets(0,0,0,0));
        		
        gc.gridx = 1;
        gc.gridy = 0;
        gc.ipadx = 16;
        gc.ipady = 17;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 9, 0, 0);
        add(modButton, gc);

        
        a_Button.setText("A");
        a_Button.setMargin( new Insets(0,0,0,0));
        a_Button.setFont(new Font("Arial", Font.PLAIN, 16) );
        gc.gridx = 2;
        gc.gridy = 0;
        gc.ipadx = 28;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 9, 0, 0);
        add(a_Button, gc);

        b_Button.setText("B");
        b_Button.setMargin( new Insets(0,0,0,0));
        b_Button.setFont(new Font("Arial", Font.PLAIN, 16) );
        
        gc.gridx = 2;
        gc.gridy = 1;
        gc.ipadx = 28;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(0, 9, 0, 0);
        add(b_Button, gc);

        c_Button.setText("C");
        c_Button.setMargin( new Insets(0,0,0,0));
        c_Button.setFont(new Font("Arial", Font.PLAIN, 16) );
        
        gc.gridx = 2;
        gc.gridy = 2;
        gc.ipadx = 28;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-8, 9, 0, 0);
        add(c_Button, gc);

        d_Button.setText("D");
        d_Button.setMargin( new Insets(0,0,0,0));
        d_Button.setFont(new Font("Arial", Font.PLAIN, 16) );
        
        gc.gridx = 2;
        gc.gridy = 3;
        gc.ipadx = 28;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-16, 9, 0, 0);
        add(d_Button, gc);

        e_Button.setText("E");
        e_Button.setMargin( new Insets(0,0,0,0));
        e_Button.setFont(new Font("Arial", Font.PLAIN, 16) );
        
        gc.gridx = 2;
        gc.gridy = 4;
        gc.ipadx = 28;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-24, 9, 0, 0);
        add(e_Button, gc);

        f_Button.setText("F");
        f_Button.setMargin( new Insets(0,0,0,0));
        f_Button.setFont(new Font("Arial", Font.PLAIN, 16) );
        
        gc.gridx = 2;
        gc.gridy = 5;
        gc.ipadx = 28;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-32, 9, 2, 0);
        add(f_Button, gc);
        
        //Next col
        
        oneButton.setText("1");
        oneButton.setMargin( new Insets(0,0,0,0));
        oneButton.setFont(new Font("Arial", Font.PLAIN, 16) );
               
        gc.gridx = 3;
        gc.gridy = 4;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-24, 9, 0, 0);
        add(oneButton, gc);

        fourButton.setText("4");
        fourButton.setMargin( new Insets(0,0,0,0));
        fourButton.setFont(new Font("Arial", Font.PLAIN, 16) );
               
        gc.gridx = 3;
        gc.gridy = 3;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-16, 9, 0, 0);
        add(fourButton, gc);
       		
       		
        sevenButton.setText("7");
        sevenButton.setMargin( new Insets(0,0,0,0));
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 16) );
               
        gc.gridx = 3;
        gc.gridy = 2;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-8, 9, 0, 0);
        add(sevenButton, gc);
               
        backspaceButton.setText("\u2190");
        backspaceButton.setMargin( new Insets(0,0,0,0));
        backspaceButton.setFont(new Font("Arial", Font.PLAIN, 16) );
               
        gc.gridx = 3;
        gc.gridy = 1;
        gc.ipadx = 23;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(0, 9, 0, 0);
        add(backspaceButton, gc);
       		
        mcButton.setText("MC");
        mcButton.setMargin( new Insets(0,0,0,0));
        mcButton.setFont(new Font("Arial", Font.PLAIN, 16) );
               
        gc.gridx = 3;
        gc.gridy = 0;
        gc.ipadx = 14;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 9, 0, 0);
        add(mcButton, gc);
        
        
//------- next col minus the zero button --------- //
             //2
        twoButton.setText("2");
        twoButton.setMargin( new Insets(0,0,0,0));
        twoButton.setFont(new Font("Arial", Font.PLAIN, 16) );
                       
        gc.gridx = 4;
        gc.gridy = 4;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-24, 9, 0, 0);
        add(twoButton, gc);

               //5

        fiveButton.setText("5");
        fiveButton.setMargin( new Insets(0,0,0,0));
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 16) );
 
        gc.gridx = 4;
        gc.gridy = 3;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-16, 9, 0, 0);
        add(fiveButton, gc);

               //8


        eightButton.setText("8");
        eightButton.setMargin( new Insets(0,0,0,0));
        eightButton.setFont(new Font("Arial", Font.PLAIN, 16) );
 
        gc.gridx = 4;
        gc.gridy = 2;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-8, 9, 0, 0);
        add(eightButton, gc);


               //ce


        ceButton.setText("CE");
        ceButton.setMargin( new Insets(0,0,0,0));
        ceButton.setFont(new Font("Arial", Font.PLAIN, 16) );
        
        gc.gridx = 4;
        gc.gridy = 1;
        gc.ipadx = 16;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(0, 9, 0, 0);
        add(ceButton, gc);
               //mr

        mrButton.setText("MR");
        mrButton.setMargin( new Insets(0,0,0,0));
        mrButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 4;
        gc.gridy = 0;
        gc.ipadx = 15;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 9, 0, 0);
        add(mrButton, gc);

        zeroButton.setText("0");
        zeroButton.setMargin( new Insets(0,0,0,0));
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 16) );
        
        gc.gridx = 3;
        gc.gridy = 5;
        gc.gridwidth = 2;
        gc.ipadx = 84;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-32, 9, 2, 0);
        add(zeroButton, gc);

        
        //next row
                       
        decimalButton.setText(".");
        decimalButton.setMargin( new Insets(0,0,0,0));
        decimalButton.setFont(new Font("Arial", Font.PLAIN, 16) );
                       
        gc.gridx = 5;
        gc.gridy = 5;
        gc.ipadx = 35;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-32, 9, 2, 0);
        add(decimalButton, gc);







                       //3

        threeButton.setText("3");
        threeButton.setMargin( new Insets(0,0,0,0));
        threeButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 5;
        gc.gridy = 4;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-24, 9, 0, 0);
        add(threeButton, gc);





                       //6



        sixButton.setText("6");
        sixButton.setMargin( new Insets(0,0,0,0));
        sixButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 5;
        gc.gridy = 3;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-16, 9, 0, 0);
        add(sixButton, gc);

                       //9

        nineButton.setText("9");
        nineButton.setMargin( new Insets(0,0,0,0));
        nineButton.setFont(new Font("Arial", Font.PLAIN, 16) );
        gc.gridx = 5;
        gc.gridy = 2;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-8, 9, 0, 0);
        add(nineButton, gc);


                       //C


        clearButton.setText("C");
        clearButton.setMargin( new Insets(0,0,0,0));
        clearButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 5;
        gc.gridy = 1;
        gc.ipadx = 27;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(0, 9, 0, 0);
        add(clearButton, gc);


                       //MS

        msButton.setText("MS");
        msButton.setMargin( new Insets(0,0,0,0));
        msButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 5;
        gc.gridy = 0;
        gc.ipadx = 15;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 9, 0, 0);
        add(msButton, gc);
        
        
//Next row
        addButton.setText("+");
        addButton.setMargin( new Insets(0,0,0,0));
        addButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 6;
        gc.gridy = 5;
        //gc.ipadx = 30;
       // gc.ipady = 16;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-32, 64, 50, 0);
        add(addButton, gc);

        subButton.setText("-");
        subButton.setMargin( new Insets(0,0,0,0));
        subButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 6;
        gc.gridy = 4;
       // gc.ipadx = 25;
       // gc.ipady = 16;
        gc.ipadx = 34;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-24, 64, 40, 0);
        add(subButton, gc);
                       //*


        multButton.setText("*");
        multButton.setMargin( new Insets(0,0,0,0));
        multButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 6;
        gc.gridy = 3;
        //gc.ipadx = 24;
       // gc.ipady = 16;
        gc.ipadx = 33;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-16, 64, 30, 0);
        add(multButton, gc);

                       // /

        divButton.setText("/");
        divButton.setMargin( new Insets(0,0,0,0));
        divButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 6;
        gc.gridy = 2;
       // gc.ipadx = 26;
       // gc.ipady = 16;
        gc.ipadx = 35;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-8, 64, 25, 0);
        add(divButton, gc);
                       // plus minus

        plusMinsuButton.setText("±");
        plusMinsuButton.setMargin( new Insets(0,0,0,0));
        plusMinsuButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 6;
        gc.gridy = 1;
       // gc.ipadx = 22;
      //  gc.ipady = 16;
        gc.ipadx = 30;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new Insets(0, 64, 15, 0);
        add(plusMinsuButton, gc);

                       //m+

        mPlusButton.setText("M+");
        mPlusButton.setMargin( new Insets(0,0,0,0));
        mPlusButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 6;
        gc.gridy = 0;
        gc.ipadx = 17;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 64, 8, 0);
        add(mPlusButton, gc);
                               
//next

        equalsButton.setText("=");
        equalsButton.setMargin( new Insets(0,0,0,0));
        equalsButton.setFont(new Font("Arial", Font.PLAIN, 16) );

        gc.gridx = 7;
        gc.gridy = 4;
        gc.gridheight = 2;
        gc.ipadx = 30;
        gc.ipady = 59;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-24, 64, 0, 2);
        add(equalsButton, gc);

        recipButton.setText("1/x");
        recipButton.setMargin( new Insets(0,0,0,0));
        recipButton.setFont(new Font("Arial", Font.PLAIN, 16) );


        gc.gridx = 7;
        gc.gridy = 3;
        gc.ipadx = 19;
        gc.ipady = 13;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(-15, 64, 0, 2);
        add(recipButton, gc);
                       //%

        percentButton.setText("%");
        percentButton.setMargin( new Insets(0,0,0,0));
        percentButton.setFont(new Font("Arial", Font.PLAIN, 16) );


		gc.gridx = 7;
		gc.gridy = 2;
		gc.ipadx = 25;
		gc.ipady = 16;
		gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gc.insets = new java.awt.Insets(-7, 64, 0, 2);
		add(percentButton, gc);



                       //sqrt

		sqrtButton.setText("\u221A");
		sqrtButton.setMargin( new Insets(0,0,0,0));
		sqrtButton.setFont(new Font("Arial", Font.PLAIN, 16) );
		                          
		
		gc.gridx = 7;
		gc.gridy = 1;
		gc.ipadx = 30;
		gc.ipady = 14;
		gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gc.insets = new java.awt.Insets(1, 64, 0, 2);
		add(sqrtButton, gc);


                       //m-

		mMinusButton.setText("M-");
		mMinusButton.setMargin( new Insets(0,0,0,0));
		mMinusButton.setFont(new Font("Arial", Font.PLAIN, 16) );

		gc.gridx = 7;
		gc.gridy = 0;
        gc.ipadx = 21;
        gc.ipady = 13;
		gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gc.insets = new java.awt.Insets(2, 64, 0, 2);
		add(mMinusButton, gc);

                              
/* 
        zeroButton.setText("0");
        
        gc.gridx = 3;
        gc.gridy = 5;
        gc.gridwidth = 2;
        gc.ipadx = 94;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 2, 0);
        add(zeroButton, gc);

        oneButton.setText("1");
        
        gc.gridx = 3;
        gc.gridy = 4;
        gc.ipadx = 22;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(oneButton, gc);

        twoButton.setText("2");
        
        gc.gridx = 4;
        gc.gridy = 4;
        gc.ipadx = 22;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(twoButton, gc);

        fiveButton.setText("5");
        fiveButton.setToolTipText("");
        
        gc.gridx = 4;
        gc.gridy = 3;
        gc.ipadx = 22;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(fiveButton, gc);

        fourButton.setText("4");
        
        gc.gridx = 3;
        gc.gridy = 3;
        gc.ipadx = 22;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(fourButton, gc);

        eightButton.setText("8");
        eightButton.setToolTipText("");
        
        gc.gridx = 4;
        gc.gridy = 2;
        gc.ipadx = 22;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(eightButton, gc);

        sevenButton.setText("7");
        
        gc.gridx = 3;
        gc.gridy = 2;
        gc.ipadx = 22;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(sevenButton, gc);

        ceButton.setText("CE");
        
        gc.gridx = 4;
        gc.gridy = 1;
        gc.ipadx = 12;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(ceButton, gc);

        backspaceButton.setText("\u2190");
        
        gc.gridx = 3;
        gc.gridy = 1;
        gc.ipadx = 14;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(backspaceButton, gc);

        mcButton.setText("MC");
        
        gc.gridx = 3;
        gc.gridy = 0;
        gc.ipadx = 8;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 9, 0, 0);
        add(mcButton, gc);

        mrButton.setText("MR");
        
        gc.gridx = 4;
        gc.gridy = 0;
        gc.ipadx = 8;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 9, 0, 0);
        add(mrButton, gc);

        addButton.setText(" + ");
        
        gc.gridx = 6;
        gc.gridy = 5;
        gc.ipadx = 2;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 2, 0);
        add(addButton, gc);

        subButton.setText("-");
        
        gc.gridx = 6;
        gc.gridy = 4;
        gc.ipadx = 18;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(subButton, gc);

        equalsButton.setText("=");
        
        gc.gridx = 7;
        gc.gridy = 4;
        gc.gridheight = 2;
        gc.ipadx = 18;
        gc.ipady = 70;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 2, 2);
        add(equalsButton, gc);

        recipButton.setText("1/x");
        recipButton.setPreferredSize(new java.awt.Dimension(63, 29));
        
        gc.gridx = 7;
        gc.gridy = 3;
        gc.ipadx = 8;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 2);
        add(recipButton, gc);

        multButton.setText("*");
        
        gc.gridx = 6;
        gc.gridy = 3;
        gc.ipadx = 16;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(multButton, gc);

        percentButton.setText("%");
        percentButton.setPreferredSize(new java.awt.Dimension(63, 29));
        
        gc.gridx = 7;
        gc.gridy = 2;
        gc.ipadx = 14;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 2);
        add(percentButton, gc);

        divButton.setText("/");
        
        gc.gridx = 6;
        gc.gridy = 2;
        gc.ipadx = 18;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(divButton, gc);

        sqrtButton.setText("\u221A");
        sqrtButton.setToolTipText("");
        sqrtButton.setPreferredSize(new java.awt.Dimension(63, 29));
        
        gc.gridx = 7;
        gc.gridy = 1;
        gc.ipadx = 18;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 2);
        add(sqrtButton, gc);

        plusMinsuButton.setText("±");
        
        gc.gridx = 6;
        gc.gridy = 1;
        gc.ipadx = 12;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(plusMinsuButton, gc);

        mMinusButton.setText("M-");
        
        gc.gridx = 7;
        gc.gridy = 0;
        gc.ipadx = 12;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 9, 0, 2);
        add(mMinusButton, gc);

        mPlusButton.setText("M+");
        
        gc.gridx = 6;
        gc.gridy = 0;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 9, 0, 0);
        add(mPlusButton, gc);

        decimalButton.setText(".");
        
        gc.gridx = 5;
        gc.gridy = 5;
        gc.ipadx = 16;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 2, 0);
        add(decimalButton, gc);

        threeButton.setText("3");
        
        gc.gridx = 5;
        gc.gridy = 4;
        gc.ipadx = 12;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(threeButton, gc);

        sixButton.setText("6");
        
        gc.gridx = 5;
        gc.gridy = 3;
        gc.ipadx = 12;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(sixButton, gc);

        nineButton.setText("9");
        
        gc.gridx = 5;
        gc.gridy = 2;
        gc.ipadx = 12;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(nineButton, gc);

        clearButton.setText("C");
        
        gc.gridx = 5;
        gc.gridy = 1;
        gc.ipadx = 10;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 9, 0, 0);
        add(clearButton, gc);

        msButton.setText("MS");
        
        gc.gridx = 5;
        gc.gridy = 0;
        gc.ipady = 16;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 9, 0, 0);
        add(msButton, gc);

        emptyButton6.setPreferredSize(new java.awt.Dimension(63, 29));
       
        
        gc.gridx = 0;
        gc.gridy = 0;
        gc.ipadx = 30;
        gc.ipady = 36;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(2, 2, 0, 0);
        add(emptyButton6, gc);
        
        gc.gridx = 0;
        gc.gridy = 1;
        gc.ipadx = 30;
        gc.ipady = 36;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 2, 0, 0);
        add(emptyButton7, gc);
        
        gc.gridx = 0;
        gc.gridy = 2;
        gc.ipadx = 30;
        gc.ipady = 36;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 2, 0, 0);
        add(emptyButton8, gc);
        
        gc.gridx = 0;
        gc.gridy = 3;
        gc.ipadx = 30;
        gc.ipady = 36;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 2, 0, 0);
        add(emptyButton9, gc);
        
        gc.gridx = 0;
        gc.gridy = 4;
        gc.ipadx = 30;
        gc.ipady = 36;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 2, 0, 0);
        add(emptyButton10, gc);
        
        gc.gridx = 0;
        gc.gridy = 5;
        gc.ipadx = 30;
        gc.ipady = 36;
        gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gc.insets = new java.awt.Insets(9, 2, 2, 0);
        add(emptyButton11, gc);
        */
        
        
      
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
