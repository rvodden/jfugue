package org.jfugue.player;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

public class ChangedSynthesizerManualTest {
  public static void main(String[] args) throws MidiUnavailableException, InterruptedException, InvalidMidiDataException, IOException {
    Synthesizer synth = MidiSystem.getSynthesizer();
    synth.open();
    Soundbank soundbank = MidiSystem.getSoundbank(new File("C:\\My Projects\\JFugue\\Soundfonts\\SONiVOX_GS250.SF2"));
    synth.loadInstrument(soundbank.getInstruments()[5]);

    SynthesizerManager.getInstance().setSynthesizer(synth);
    Player player = new Player();
    player.play("I5 Cw");

//        MidiChannel[] mc = synth.getChannels();
//        mc[5].programChange(5);
//        mc[5].noteOn(60, 100);
//        Thread.sleep(2000);
//        mc[5].noteOff(60);
  }
}
