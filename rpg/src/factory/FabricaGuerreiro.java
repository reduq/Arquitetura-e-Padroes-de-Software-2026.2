package factory;
import personagem.Guerreiro;
import personagem.Personagem;

public class FabricaGuerreiro implements FabricaPersonagem {
	@Override
	public Personagem criaPersonagem() {
		System.out.println("GUERREIRO CRIADO!");
		return new Guerreiro();
	}
}
