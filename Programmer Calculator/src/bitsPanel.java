import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class bitsPanel extends JPanel
{
	JTextArea bitsTextArea;
	JScrollPane scroll4Bytes;
	
	public bitsPanel()
	{
		/*
		byteOutputPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        byteOutputPanel.setLayout(new java.awt.GridBagLayout());

        bytesTextArea.setColumns(20);
        bytesTextArea.setRows(5);
        scroll4Bytes.setViewportView(bytesTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 647;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        byteOutputPanel.add(scroll4Bytes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 647;
        gridBagConstraints.ipady = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 15, 0, 15);
        getContentPane().add(byteOutputPanel, gridBagConstraints);*/
		
		setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
		bitsTextArea = new JTextArea(5,20);
		bitsTextArea.setEditable(false);
		 scroll4Bytes = new JScrollPane();//mark for deletion
		
		scroll4Bytes.setViewportView(bitsTextArea);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
	//	gc.fill = java.awt.GridBagConstraints.BOTH;
		//gc.ipadx = 345;
		gc.ipadx = 540;
		gc.ipady = 80;
		gc.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gc.weightx = 1.0;
		gc.weighty = 1.0;
	//	gc.insets = new java.awt.Insets(2, 2, 2, 2);
		add(bitsTextArea,gc);

	}

	public JTextArea getBitsPanel() 
	{
		return bitsTextArea;
	}

	public void setBitsPanel(JTextArea j)
	{
		bitsTextArea = j;
	}
}
