package cmd.object;

import java.util.ArrayList;

import cmd.config.CommandList.MyInterface;

public class cmd_command{
	
	private String cmd;
	private String description;
	private MyInterface action;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -    Constructors    																			//

	/**
	 * 
	 * @param cmd
	 * @param description
	 * @param myInterface
	 */
	public cmd_command( String cmd, String description, MyInterface myInterface ) {
		this.cmd = cmd;
		this.description = description;
        this.action = myInterface; 
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -    equal, get, set, is    																			//
	
	/** compare if the instance contains the command
	 * 
	 * @param arg
	 * @return
	 */
	public boolean equals( String arg ) {
		boolean ret_val = false;
		if( cmd.equals( arg ) ) { ret_val = true; }
		return ret_val;
	}
	
	/** Get command
	 * @return cmd string
	 */
	public String getCmd() { return this.cmd; }

	
	/** Get description
	 * @return description string
	 */
	public String getDescription() { return this.description; }

	/** Execute the command
	 * @param arrayList 
	 */
	public void runAction(ArrayList<String> arrayList) { this.action.runAction( arrayList ); }

//////////////////////////////////////////////////////////////////////////////////////////////////////
//    -    to...   																			//

	/**
	 * 
	 */
    public String toString() {
    	return this.cmd + this.description + "\n";
    }



    
}
