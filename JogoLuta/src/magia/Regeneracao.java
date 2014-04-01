package magia;

import lutador.Lutador;

public class Regeneracao extends Magia {
	
		public void usar(Lutador lutador1, Lutador lutador2){
			lutador1.life += 1;
		}
	
}
