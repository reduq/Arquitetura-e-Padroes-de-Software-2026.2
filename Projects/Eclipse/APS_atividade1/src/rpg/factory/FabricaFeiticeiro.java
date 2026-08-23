package rpg.factory;
import rpg.personagem.Personagem;
import rpg.personagem.Feiticeiro;

public class FabricaFeiticeiro implements FabricaPersonagem{
	@Override
	public Personagem criaPersonagem() {
		System.out.println("PERSONAGEM CRIADO: FEITICEIRO!");
		return new Feiticeiro();		
	}
}
