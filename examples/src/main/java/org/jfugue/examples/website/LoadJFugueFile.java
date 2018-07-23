package java.org.jfugue.examples.website;

import java.io.File;
import java.io.IOException;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import javax.sound.midi.MidiUnavailableException;

public class LoadJFugueFile {
    public static void main(String[] args) throws IOException, MidiUnavailableException {
        Pattern pattern = Pattern.load(new File("beethoven.jfugue"));
        Player player = new Player();
        player.play(pattern);
    }
}
