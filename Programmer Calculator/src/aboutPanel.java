import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class aboutPanel extends JPanel
{
	BufferedImage image;
	public aboutPanel()
	{

		
	}
	public void paintComponent(Graphics g)
	{
	    super.paintComponents(g);
	    
	    try 
	    {
			image = ImageIO.read(getClass().getResourceAsStream("/resources/help.png"));
		} 
	    catch (IOException e) {

			e.printStackTrace();
		}
	    g.drawImage(image, -5, -20, null);
	}
	
}
