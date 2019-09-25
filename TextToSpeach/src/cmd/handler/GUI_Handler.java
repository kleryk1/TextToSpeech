package cmd.handler;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import cmd.object.tts_thread;
import utils.gui_components.MyPanel;

public class GUI_Handler extends JFrame implements TOS_Handler {

	private Dimension size = new Dimension( 700, 500 );
	private Point location = new Point( 100, 100 );

	tts_thread tts = null;
	private JTextArea textarea;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -    Constructors    																			//
	
    public GUI_Handler() {
    	super();
    	constructorCommon( null );
    	setVisible( true );
	}
	
	public GUI_Handler( ArrayList<String> arg ) {
    	super();
    	constructorCommon( arg );
    	setVisible( true );
    }
	
    private void constructorCommon( ArrayList<String> arg ) {
    	setSize( size );
    	setLocation( location );
    	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    	MyPanel main_panel = new MyPanel();
    	
    	main_panel.add( addTextArea() );
    	main_panel.add( addPlayButton() );
    	main_panel.add( addPauseButton() );
    	main_panel.add( addClearButton() );
    	
    	add( main_panel );
    	
    	tts = new tts_thread();
    	
    	if( arg!= null && arg.size() > 0 ) {
    		for( String str: arg ) {
    			System.out.println( "speak: " + str );
    			tts.speak(str, 1.0f, false, false);
    		}
    	}
    	
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -    elements    																			//


    private JScrollPane addTextArea() {
    	textarea = new JTextArea();
    	textarea.setDragEnabled( true );
    	textarea.setLineWrap(true);
    	
        JScrollPane scrall = new JScrollPane( textarea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        scrall.setLocation( 5, 30 );
        scrall.setPreferredSize( new Dimension( size.width-25, size.height-85 ) );

		return scrall;
	}

    private JButton addPlayButton() {
    	JButton play = new JButton( "play" );
    	play.setLocation( 0, 0 );
    	play.addActionListener( new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				tts.speak(textarea.getText(), 1.0f, false, false);
			}
		} );
		return play;
	}

	private JButton addPauseButton() {
    	JButton pause = new JButton( "pause" );
    	pause.setLocation( 100, 0 );
    	pause.addActionListener( new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				tts.stopSpeaking();
			}
		} );
		return pause;
	}

	private JButton addClearButton() {
    	JButton clear = new JButton( "clear" );
    	clear.setLocation( 200, 0 );
    	clear.addActionListener( new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {
				tts.stopSpeaking();
				textarea.setText( "" );
			}
		} );
		return clear;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 
	 */
	private static final long serialVersionUID = 6739030759771920135L;
}
