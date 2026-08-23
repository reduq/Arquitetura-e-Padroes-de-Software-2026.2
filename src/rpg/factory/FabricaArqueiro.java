package rpg.factory;
import rpg.personagem.Personagem;
import rpg.personagem.Arqueiro;

public class FabricaArqueiro implements FabricaPersonagem {
	@Override
	public Personagem criaPersonagem() {
		System.out.println("ARQUEIRO CRIADO!");
		return new Arqueiro();
	}
}
