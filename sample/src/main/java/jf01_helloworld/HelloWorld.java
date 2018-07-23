package jf01_helloworld;

import org.jfugue.player.Player;

import javax.sound.midi.MidiUnavailableException;

public class HelloWorld {

   public static void main(String[] args) throws MidiUnavailableException {

	  Player player = new Player();
	  player.play("C D E F G A B ");
   }
}
