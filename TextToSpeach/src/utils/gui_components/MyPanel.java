package utils.gui_components;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.SpringLayout;


/**
 * in setBackground( BufferedImage image ) fa un resize image daca panelul nu este full screen pentru paneluri mici
 * @author Toda
 *
 */

public class MyPanel extends JPanel {

	private String image_location = null;
	
	private SpringLayout layout = new SpringLayout();
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//	-	Constrictori																				//

	public MyPanel(){
		super();
		//setBackground( Color.black );
		setLayout( this.layout );
	}
	
	public MyPanel( int x, int y, int width, int height ){
		super();
		//setBackground( Color.black );
		setLayout( this.layout );
		setSize( height, height );
		setLocation( x - getWidth(), y );
	}
	
	public MyPanel( int x, int y, int width, int height, String file_location ){
		super();
		//setBackground( Color.black );
		setLayout( this.layout );
		BufferedImage original_image = null;
		try {
			original_image = ImageIO.read( new File( file_location ) );
		} catch ( IOException e ) { e.printStackTrace(); }
				float ratio = ((float)original_image.getWidth() / original_image.getHeight());
		setSize( (int)(height * (ratio)), height );
		
		setLocation( x, y );
		
		bg_image = new BufferedImage( (int) (getHeight()*ratio), getHeight(), 2 );
		Graphics2D g = bg_image.createGraphics();
		g.drawImage( original_image, 0, 0, getWidth(), getHeight(), null );
		g.dispose();
		setSize( bg_image.getWidth(), bg_image.getHeight() );
		
		image_location = file_location;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//	-	paintComponent																				//
	
		private BufferedImage bg_image = null;
	protected void paintComponent( Graphics g ){
		super.paintComponent(g);
		g.drawImage( bg_image, 0, 0, null );
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//	-	addComponent																				//
	
	@Override
	public void setSize( Dimension size ){		
		super.setSize( size );
        layout.putConstraint( SpringLayout.EAST, this, size.width, SpringLayout.WEST, this );
        layout.putConstraint( SpringLayout.SOUTH, this, size.height, SpringLayout.NORTH, this );
	}

	@Override
	public void setSize( int width, int height ) {		
		super.setSize( width, height );
        layout.putConstraint( SpringLayout.EAST, this, width, SpringLayout.WEST, this );
        layout.putConstraint( SpringLayout.SOUTH, this, height, SpringLayout.NORTH, this );
	}
	
	public Component add( Component component ){
		super.add( component );
        layout.putConstraint( SpringLayout.WEST, component, component.getLocation().x, SpringLayout.WEST, this );
        layout.putConstraint( SpringLayout.NORTH, component, component.getLocation().y, SpringLayout.NORTH, this );
        return this;
	} 
	
//////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getImagePath() { return image_location; }
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


}
