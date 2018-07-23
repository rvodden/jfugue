package java.org.jfugue.examples.website;

import org.jfugue.player.Player;

import javax.sound.midi.MidiUnavailableException;

public class HelloWorld2 {
  public static void main(String[] args) throws MidiUnavailableException {
    Player player = new Player();
    player.play("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq   V1 I[Flute] Rw | Rw | GmajQQQ CmajQ");
  }
}
