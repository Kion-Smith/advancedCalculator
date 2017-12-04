import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
/*NAME: Kion Smith
 * ID: kls160430
 * CLASS: CS2336.502
 * 
 * 
 * Display image in new jframe
 */
public class aboutPanel extends JPanel
{
	BufferedImage image;// what holds the image
	public aboutPanel()
	{
		//Initiate image if the file exists
		  try 
		    {
		    	//get image using the resouce folder inside this project
				image = ImageIO.read(getClass().getResourceAsStream("/resources/help.png"));
			} 
		    catch (IOException e) {

				e.printStackTrace();
			}
		
	}
	public void paintComponent(Graphics g)
	{
		//use parent paint 
	    super.paintComponents(g);
	    
	  
	    //draw image
	    g.drawImage(image, -5, -20, null);
	}
	
}
