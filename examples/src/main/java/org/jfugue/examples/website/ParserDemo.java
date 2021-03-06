package java.org.jfugue.examples.website;

import org.jfugue.midi.MidiParser;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.staccato.StaccatoParserListener;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import java.io.File;
import java.io.IOException;

public class ParserDemo {
  public static void main(String[] args) throws InvalidMidiDataException, IOException, MidiUnavailableException {
    MidiParser parser = new MidiParser();
    StaccatoParserListener listener = new StaccatoParserListener();
    parser.addParserListener(listener);
    parser.parse(MidiSystem.getSequence(new File("C:\\My Media\\MIDI\\The_Way_I_Am.mid")));
    Pattern staccatoPattern = listener.getPattern();
    System.out.println(staccatoPattern);

    Player player = new Player();
    player.play(staccatoPattern);
  }
}


