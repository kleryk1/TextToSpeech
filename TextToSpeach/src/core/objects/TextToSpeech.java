package core.objects;

import java.util.ArrayList;
import java.util.Arrays;

import cmd.config.CommandList;
import cmd.object.cmd_command;

public class TextToSpeech extends CommandList{
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -    Constructors    																			//
	
	public TextToSpeech( String[] args ){
		super();
		
		switch(args.length) {
		    case 0:             // if there is no argument
		    	System.out.println( getNoCommand() );
		    	break;
		    case 1:             // if there is only one argument
		    	if( contains( args[0].toLowerCase() ) ) {
		    		cmd_list.get( getID( args[0].toLowerCase() ) ).runAction( null );
		    	}else {
		    		cmd_list.get( getID( "help" ) ).runAction( null );
		    	}
		    	break; 
		    default:            // for more than one argument
				ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList( args ));
				arrayList.remove( 0 );
				
		    	if( contains( args[0].toLowerCase() ) ) {
		    		cmd_list.get( getID( args[0].toLowerCase() ) ).runAction( arrayList );
		    	}else {
		    		cmd_list.get( getID( "help" ) ).runAction( arrayList );
		    	}
	    	
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -                   																			//
	
	public String startThread() {
    	return null;
    }   
	public String stopThread() {
    	return null;
    }   
	public String speak() {
    	return null;
    }
	
   
	private int  getID( String arg ) {
		int ret_val = -1;
		for(cmd_command cmd: cmd_list) {
			ret_val++;
            if( cmd.equals( arg ) ) { break; }
        }
		return ret_val;
	}


	private boolean contains( String command ) {
		boolean ret_val = false;
		for(cmd_command cmd: cmd_list) {
            if( cmd.equals( command ) ) { ret_val = true; }
        }
		return ret_val;
	}


	public boolean isMode( Mode mode ) {
		boolean ret_val = false;
		if( this.mode == mode ) {
			ret_val = true;
		}
		return ret_val;
	}

}
