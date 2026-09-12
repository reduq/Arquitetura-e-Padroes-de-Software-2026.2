package factory;
import personagem.Arqueiro;
import personagem.Personagem;

public class FabricaArqueiro implements FabricaPersonagem {
	@Override
	public Personagem criaPersonagem() {
		System.out.println("ARQUEIRO CRIADO!");
		return new Arqueiro();
	}
}
