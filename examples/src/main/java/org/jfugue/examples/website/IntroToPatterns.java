package java.org.jfugue.examples.website;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import javax.sound.midi.MidiUnavailableException;

public class IntroToPatterns {
  public static void main(String[] args) throws MidiUnavailableException {
    Pattern p1 = new Pattern("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq");
    Pattern p2 = new Pattern("V1 I[Flute] Rw     | Rw     | GmajQQQ  CmajQ");
    Player player = new Player();
    player.play(p1, p2);
  }
}
