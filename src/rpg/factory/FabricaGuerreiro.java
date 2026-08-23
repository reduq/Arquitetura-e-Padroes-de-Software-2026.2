package rpg.factory;
import rpg.personagem.Personagem;
import rpg.personagem.Guerreiro;

public class FabricaGuerreiro implements FabricaPersonagem {
	@Override
	public Personagem criaPersonagem() {
		System.out.println("GUERREIRO CRIADO!");
		return new Guerreiro();
	}
}
