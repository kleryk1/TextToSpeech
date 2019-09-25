package cmd.config;

import java.util.ArrayList;
import java.util.Locale;

import cmd.handler.GUI_Handler;
import cmd.handler.TOS_Handler;
import cmd.object.cmd_command;
import marytts.modules.synthesis.Voice;

public class CommandList{
	
	public enum Mode { GUI, CMD }; 
	protected Mode mode = null;
	
	TOS_Handler handler = null;
	
	
	
	public interface MyInterface { String runAction( ArrayList<String> arg ); }
	
    protected ArrayList<cmd_command> cmd_list = new ArrayList<cmd_command>(); 

//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -    Constructors    																			//

    public CommandList() {
    	super();

        /* HELP
         * get_locale
         * get_voice
         * 
         * mod_gui
    	 * mod_cmd
    	 **********************************
    	 * speak
    	 * 
    	 * start_th // start thread
    	 * stop_th  // stop thread
    	 * 
    	 * */
    	
    	MyInterface if_help = (arg) -> { return getHelp(arg); };
    	cmd_list.add( new cmd_command( "help", 
    			                       "help description", 
    			                       if_help
    			     ));
    	
    	MyInterface if_mode_gui = (arg) -> { return setModeGui( arg ); };
    	cmd_list.add( new cmd_command( "mode_gui", 
    			                       "use using a gui", 
    			                       if_mode_gui
    			     ));
    	MyInterface if_mode_cmd = (arg) -> { return setModeCmd(arg); };
    	cmd_list.add( new cmd_command( "mode_cmd", 
    			                       "Use in Command Prompt", 
    			                       if_mode_cmd
    			     ));

    	MyInterface if_get_locale = (arg) -> { return getLocale(arg); };
    	cmd_list.add( new cmd_command( "get_locale", 
    			                       "Return default Locale", 
    			                       if_get_locale
    			     ));
    	
    	MyInterface if_get_voice = (arg) -> { return getDefaultVoice(arg); };
    	cmd_list.add( new cmd_command( "get_voice", 
    			                       "return default voice", 
    			                       if_get_voice
    			     ));
    	
    	MyInterface if_speak = (arg) -> { return speakOnce(arg); };
    	cmd_list.add( new cmd_command( "speak", 
    			                       "Speek command speaks the words outloud.", 
    			                       if_speak
    			     ));
    	
	}
    



//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -    Implementations    																			//




  
	
    private String speakOnce(ArrayList<String> arg) {
		// TODO Auto-generated method stub
		return null;
	}




	/** set Command Prompt mode
     * 
     * @return
     */
	private String setModeCmd(ArrayList<String> arg) {
		mode = Mode.CMD;
		return null;
	}
	

    /** set Graphical User Interface mode
     * 
     * @return
     */
	private String setModeGui(ArrayList<String> arg) {
		mode = Mode.GUI;
		handler = new GUI_Handler( arg );
		return null;
	}
    
	
    /** get_voice command action
     * 
     * @return
     */
    private String getDefaultVoice(ArrayList<String> arg) {
		Voice.getDefaultVoice( Locale.getDefault() );
		return null;
	}

    
    
    /** get_locale command action
     * 
     * @return
     */
    private String getLocale(ArrayList<String> arg) {
    	System.out.println( Locale.getDefault() );
    	return null;
    }


   /** help command action
 * @param arg 
    */
	private String getHelp(ArrayList<String> arg) {
		String indent = "                              "; // 30 spaces.
		System.out.println( "==========================================================================" );
		System.out.println( "== command explanation for TextToSpeach                                 ==" );
		System.out.println( "==========================================================================\n" );
		for(cmd_command cmd: cmd_list) {
			System.out.println( cmd.getCmd() + indent.substring(0, indent.length() - cmd.getCmd().length()) + cmd.getDescription() );
		}
		System.out.println( "\n==========================================================================" );
		System.out.println( "==========================================================================" );
		return null;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -    no command   																			//

	/** No argument message.
	 * @return
	 */
	protected String getNoCommand() {
		return "Need at leest one argument, try help commant to view argument list!";
	}
	
}
