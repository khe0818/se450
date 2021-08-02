package virtualprox;

import java.net.*;
import java.awt.*;
import javax.swing.*;

class ImageProxy implements Icon {  //javax.swing interface Icon
	volatile ImageIcon imageIcon;  //real icon that will eventually display
	final URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;

	//url of the image to be displayed
	public ImageProxy(URL url) { imageURL = url; }


	public int getIconWidth() {
		if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
			return 800;
		}
	}
 
	public int getIconHeight() {
		if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
			return 600;
		}
	}

	//imageIcon used by two theads
	synchronized void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}

	//call to paint the icon to the screen
	public void paintIcon(final Component c, Graphics  g, int x,  int y) {
		if (imageIcon != null) {
		    //if icon, then paint itself
			imageIcon.paintIcon(c, g, x, y);
		} else {
		    //else display 'loading message'
			g.drawString("Loading CD cover, please wait...", x+300, y+190);
			if (!retrieving) {
				retrieving = true;

				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
						    //paints the icon on the screen by delegating to the imageIcon
                            //if no imageIcon, then create one
							setImageIcon(new ImageIcon(imageURL, "CD Cover"));
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}
}
