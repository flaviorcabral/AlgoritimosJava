package lutador;
import magia.*;

public class Lutador {
	
	public int ataque;
	public int defesa;
	public int velocidade;
	public Magia magia;
	public int vida=20;
	public String nome;
	public int life;
	
	public void atacar(Lutador oponente){
		if(magia != null){
			magia.usar(this,oponente);
		}
		if(this.velocidade > oponente.velocidade){
			oponente.vida = oponente.vida - this.ataque;
		}
		else{
			if(oponente.defesa < this.ataque ){
				oponente.vida = oponente.vida - this.ataque - oponente.defesa;
			}
		}
	}

	
	public void defender(){
		
	}
}
