package rpg.factory;
import rpg.personagem.Personagem;
import rpg.personagem.Guerreiro;

public class FabricaGuerreiro implements FabricaPersonagem{
	@Override
	public Personagem criaPersonagem() {
		System.out.println("PERSONAGEM CRIADO: GUERREIRO!");
		return new Guerreiro();		
	}
}