import java.util.Locale;

import cmd.handler.GUI_Handler;
import core.objects.TextToSpeech;

// using mary tts
//http://mary.dfki.de/download/index.html

public class index {

	public static void main( String[] args ) {

		
		
		//Create TextToSpeech
		TextToSpeech tts = new TextToSpeech( args );
		
		// Start speech thread	
//		tts.start_speech();
		
//        play...
		
		
		// Stop speech thread
//		tts.stop_speech();
		// TODO start thread with merry
		
//		do {
//			//Enter data using BufferReader 
//	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
//			// Reading data using readLine 
//	        try {
//				String name = reader.readLine();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}while( !args[0].contains( "exit" ) );
		
		
//		System.out.println( Locale.getDefault().toLanguageTag() );
//		System.out.println(  Locale.getAvailableLocales() );		
		// TODO close thread with merry
		
		

		

//		// Setting the Current Voice
//		tts.setVoice("cmu-rms-hsmm");
		
		//tts.speak("Hello world!", 1.0f, false, false);

		
		
		//=========================================================================
		//======================= Print available AUDIO EFFECTS ====================
		//=========================================================================
		
		//Print all the available audio effects
//		tts.getAudioEffects().stream().forEach(audioEffect -> {
//			System.out.println("-----Name-----");
//			System.out.println(audioEffect.getName());
//			System.out.println("-----Examples-----");
//			System.out.println(audioEffect.getExampleParameters());
//			System.out.println("-----Help Text------");
//			System.out.println(audioEffect.getHelpText() + "\n\n");
//			
//		});
		
//		//=========================================================================
//		//========================= Let's try different effects=====================
//		//=========================================================================
//		
//		//----- Hey you !-> check the help that is being printed on the console
//		//----- You will understand how to use the effects better :)
//		
//		//VocalTractLinearScalerEffect
//		VocalTractLinearScalerEffect vocalTractLSE = new VocalTractLinearScalerEffect(); //russian drunk effect
//		vocalTractLSE.setParams("amount:70");
//		
//		//JetPilotEffect
//		JetPilotEffect jetPilotEffect = new JetPilotEffect(); //epic fun!!!
//		jetPilotEffect.setParams("amount:100");
//		
//		//RobotiserEffect
//		RobotiserEffect robotiserEffect = new RobotiserEffect();
//		robotiserEffect.setParams("amount:50");
//		
//		//StadiumEffect
//		StadiumEffect stadiumEffect = new StadiumEffect();
//		stadiumEffect.setParams("amount:150");
//		
//		//LpcWhisperiserEffect
//		LpcWhisperiserEffect lpcWhisperiserEffect = new LpcWhisperiserEffect(); //creepy
//		lpcWhisperiserEffect.setParams("amount:70");
//		
//		//VolumeEffect
//		VolumeEffect volumeEffect = new VolumeEffect(); //be careful with this i almost got heart attack
//		volumeEffect.setParams("amount:0");
//		
//		//Apply the effects
//		//----You can add multiple effects by using the method `getFullEffectAsString()` and + symbol to connect with the other effect that you want
//		//----check the example below
//		tts.getMarytts().setAudioEffects(stadiumEffect.getFullEffectAsString());// + "+" + stadiumEffect.getFullEffectAsString());
//		
//		//=========================================================================
//		//===================== Now let's troll user ==============================
//		//=========================================================================
////		List<String> arrayList = Arrays.asList("Are you mad bro", "Bro pliz tell me ok?", "But is ok remember");
//		
//		arrayList.forEach(word -> tts.speak(word, 2.0f, false, true));
	}
	
	
	
//	
//	public void tutorial_1_2_3_FromYoutube() {
//		TextToSpeech tts = new TextToSpeech();
//		
//		//=========================================================================
//		//=========================Print available voices =========================
//		//=========================================================================
//		
//
//		// Setting the Current Voice
//		tts.setVoice("cmu-rms-hsmm");
//		
//		// TTS say something that we actually are typing into the first variable
//		tts.speak("Today we will learn how to add different languages and voices on Mary T T S!", 2.0f, false, true);
//		
//		// Setting the Voice
//		tts.setVoice("dfki-poppy-hsmm");
//		
//		// TTS say something that we actually are typing into the first variable
//		tts.speak("Who is Mary Bob?", 2.0f, false, true);
//		
//		// Setting the Voice
//		tts.setVoice("cmu-rms-hsmm");
//		
//		// TTS say something that we actually are typing into the first variable
//		tts.speak("No one my darling...", 2.0f, false, true);
//		
//		// Setting the Voice
//		tts.setVoice("dfki-poppy-hsmm");
//		
//		// TTS say something that we actually are typing into the first variable
//		tts.speak("I don't trust you", 2.0f, false, true);
//		
//		// Setting the Voice
//		tts.setVoice("cmu-rms-hsmm");
//		
//		// TTS say something that we actually are typing into the first variable
//		tts.speak("Oh yeah baby!", 2.0f, false, true);
//		
//		// Setting the Voice
//		tts.setVoice("dfki-poppy-hsmm");
//		
//		// TTS say something that we actually are typing into the first variable
//		tts.speak("aaaaaa", 2.0f, false, true);
//		
//		// Setting the Voice
//		tts.setVoice("cmu-rms-hsmm");
//		
//		// TTS say something that we actually are typing into the first variable
//		tts.speak("yeah!", 2.0f, false, true);
//		
//		// Setting the Voice
//		tts.setVoice("dfki-poppy-hsmm");
//		
//		// TTS say something that we actually are typing into the first variable
//		tts.speak("oh oh yeah!", 2.0f, false, true);
//		
//		// Setting the Voice
//		tts.setVoice("dfki-poppy-hsmm");
//		
//		// TTS say something that we actually are typing into the first variable
//		tts.speak("I am Elize , a wonderful girl!", 2.0f, false, true);
//		
//		// Setting the Voice
//		tts.setVoice("cmu-rms-hsmm");
//		
//		// TTS say something that we actually are typing into the first variable
//		tts.speak("Shut up Elize . Let's continue our tutorials!", 2.0f, false, true);
//		
//	}
	
	
}
