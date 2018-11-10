package Sound;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.UnsupportedAudioFileException;
public class SoundTest {
	
	public static Mixer mixer;
	public static Clip clip;
	public static void playSound() {
Mixer.Info[] mixInfos = AudioSystem.getMixerInfo();
		
		mixer = AudioSystem.getMixer(mixInfos[0]);
		
		DataLine.Info dataInfo = new DataLine.Info(Clip.class, null);
		try {clip = (Clip)mixer.getLine(dataInfo);}
		catch(LineUnavailableException lue) { lue.printStackTrace(); }
		
		try {
			URL soundURL = SoundTest.class.getResource("/Sound/VictoryFanfare.wav");
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
			clip.open(audioStream);
			
		}
		catch(LineUnavailableException lue) { lue.printStackTrace(); }
		catch(UnsupportedAudioFileException uafe) { uafe.printStackTrace(); }
		catch(IOException ioe) { ioe.printStackTrace(); }
		
		clip.start();
		
		do {
			try { Thread.sleep(50); }
			catch(InterruptedException ie) { ie.printStackTrace(); }
			
		} while (clip.isActive());
	}

	public static void main(String[] args) {
		/*Mixer.Info[] mixInfos = AudioSystem.getMixerInfo();
		
		mixer = AudioSystem.getMixer(mixInfos[0]);
		
		DataLine.Info dataInfo = new DataLine.Info(Clip.class, null);
		try {clip = (Clip)mixer.getLine(dataInfo);}
		catch(LineUnavailableException lue) { lue.printStackTrace(); }
		
		try {
			URL soundURL = SoundTest.class.getResource("/Sound/VictoryFanfare.wav");
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
			clip.open(audioStream);
			
		}
		catch(LineUnavailableException lue) { lue.printStackTrace(); }
		catch(UnsupportedAudioFileException uafe) { uafe.printStackTrace(); }
		catch(IOException ioe) { ioe.printStackTrace(); }
		
		clip.start();
		
		do {
			try { Thread.sleep(50); }
			catch(InterruptedException ie) { ie.printStackTrace(); }
			
		} while (clip.isActive());*/
		
		playSound();
	}
}
