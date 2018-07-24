package java.org.jfugue.examples.website;

import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;

import javax.sound.midi.InvalidMidiDataException;
import java.io.File;
import java.io.IOException;

public class SeeMidi {
  public static void main(String[] args) throws IOException, InvalidMidiDataException {
    Pattern pattern = MidiFileManager.loadPatternFromMidi(new File("C:\\My Media\\MIDI\\The_Way_I_Am.mid"));
    System.out.println(pattern);
  }
}

