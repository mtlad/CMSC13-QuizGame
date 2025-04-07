import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author MatDal
 */
public class BackgroundMusic extends QuizGameUI {
    URL bgmURL;
    
    void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
            bgmURL = getClass().getResource("bgm.wav");
            FloatControl fc;
            AudioInputStream sound = AudioSystem.getAudioInputStream(bgmURL);
            Clip clip = AudioSystem.getClip();
            clip.open(sound);
            fc = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
            fc.setValue(-30.0f);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
}
