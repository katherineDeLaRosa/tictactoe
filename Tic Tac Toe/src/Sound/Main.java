package Sound;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;

public class Main {
	public static Mixer mixer;
	public static void main(String [] args)
	{
		Mixer.Info [] mixInfos = AudioSystem.getMixerInfo();
        for(Mixer.Info info : mixInfos)
        {
        	System.out.println(info.getName() +" ........... " + info.getDescription());
        }}

}
