package factory;
import personagem.Feiticeiro;
import personagem.Personagem;

public class FabricaFeiticeiro implements FabricaPersonagem {
	@Override
	public Personagem criaPersonagem() {
		System.out.println("FEITICEIRO CRIADO!");
		return new Feiticeiro();
	}
}