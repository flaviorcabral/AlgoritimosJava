package principal;

import javax.swing.JOptionPane;

import lutador.Lutador;
import magia.Regeneracao;
import cenario.Cenario;

public class Principal {

	public static void main(String[] args) {
		
		Cenario cenario = new Cenario();
		Lutador lutador1 = new Lutador();
		Lutador lutador2 = new Lutador();
		
		lutador1.ataque=5;
		lutador1.defesa=2;
		lutador1.velocidade=2;
		lutador1.nome="seu madruga";
		lutador1.magia=new Regeneracao();
		
		lutador2.ataque=2;
		lutador2.ataque=1;
		lutador2.velocidade=3;
		lutador2.nome="Dona Florinda";
		
		cenario.lutador1 = lutador1;
		cenario.lutador2 = lutador2;
		
		Lutador vencedor = cenario.iniciarluta();
		
		
		JOptionPane.showMessageDialog(null,"o vencedor foi " + vencedor.nome);		

	}

}
