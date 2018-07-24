package java.org.jfugue.examples.website;

import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

import javax.sound.midi.MidiUnavailableException;

public class AdvancedRhythms2 {
  public static void main(String[] args) throws MidiUnavailableException {
    Rhythm rhythm = new Rhythm().addLayer("O..oO...O..oOO..")
        .addLayer("..S...S...S...S.")
        .addLayer("````````````````")
        .addLayer("...............+")
        .addOneTimeAltLayer(3, 3, "...+...+...+...+")
        .addRangedAltLayer(2, 1, 2, "`...`.``...```.`")
        .addRecurringAltLayer(1, 1, 4, 2, ".sS..sS..sS..sS.")
        .setLength(8);
    new Player().play(rhythm.getPattern());
  }
}
