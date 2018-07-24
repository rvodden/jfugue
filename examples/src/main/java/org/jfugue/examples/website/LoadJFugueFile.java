package java.org.jfugue.examples.website;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import javax.sound.midi.MidiUnavailableException;
import java.io.File;
import java.io.IOException;

public class LoadJFugueFile {
  public static void main(String[] args) throws IOException, MidiUnavailableException {
    Pattern pattern = Pattern.load(new File("beethoven.jfugue"));
    Player player = new Player();
    player.play(pattern);
  }
}
