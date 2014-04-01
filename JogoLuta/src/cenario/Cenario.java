package cenario;

import lutador.Lutador;


public class Cenario {
	
	public Lutador lutador1;
	public Lutador lutador2;
	
	public Lutador iniciarluta(){
		
		boolean vez = false;
		
		while(lutador1.vida > 0 && lutador2.vida > 0){
			if(vez){
				lutador1.atacar(lutador2);
			}else{
				lutador2.atacar(lutador1);
			}
			vez = !vez;
		}
		
		if(lutador1.vida <= 0 ){
			return lutador2;
			
		}
		return lutador1;
	}

}
