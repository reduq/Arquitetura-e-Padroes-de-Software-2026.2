package rpg.factory;
import rpg.personagem.Personagem;

public interface FabricaPersonagem {
	public abstract Personagem criaPersonagem();
}