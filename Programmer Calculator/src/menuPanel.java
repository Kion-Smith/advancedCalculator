import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class menuPanel extends JPanel
{
	
	JMenuBar menu;
	JMenu viewMenu,editMenu,helpMenu;
	//maybe add Jmenuitmes
	
	public menuPanel() 
	{
		menu = new JMenuBar();
		
		viewMenu = new JMenu("View");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		menu.add(viewMenu);
		menu.add(editMenu);
		menu.add(helpMenu);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		
		
	}
	
	
	//getters
	public JMenuBar getMenu() 
	{
		return menu;
	}

	public JMenu getViewMenu() 
	{
		return viewMenu;
	}

	public JMenu getEditMenu() 
	{
		return editMenu;
	}

	public JMenu getHelpMenu() 
	{
		return helpMenu;
	}
	
	//setters

	public void setMenu(JMenuBar j) 
	{
		menu = j;
	}

	public void setViewMenu(JMenu j) 
	{
		viewMenu = j;
	}

	public void setEditMenu(JMenu j) 
	{
		editMenu = j;
	}

	public void setHelpMenu(JMenu j) 
	{
		helpMenu = j;
	}


}
