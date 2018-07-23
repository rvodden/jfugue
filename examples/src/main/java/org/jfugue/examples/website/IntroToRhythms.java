package java.org.jfugue.examples.website;

import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

import javax.sound.midi.MidiUnavailableException;

public class IntroToRhythms {
    public static void main(String[] args) throws MidiUnavailableException {
        Rhythm rhythm = new Rhythm()
        .addLayer("O..oO...O..oOO..")
        .addLayer("..S...S...S...S.")
        .addLayer("````````````````")
        .addLayer("...............+");
        Player player = new Player();
        player.play(rhythm.getPattern().repeat(2));
    }
}
