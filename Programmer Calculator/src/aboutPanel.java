import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class aboutPanel extends JPanel
{
	BufferedImage image;
	//Graphics2D g;
	public aboutPanel()
	{

		
	}
	public void paintComponent(Graphics g)
	{
	    super.paintComponents(g);
	    try {
			image = ImageIO.read(getClass().getResourceAsStream("/resources/help.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    g.drawImage(image, -5, -20, null);
	}
	
}
