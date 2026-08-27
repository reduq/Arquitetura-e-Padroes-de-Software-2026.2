package rpg.acaoCommand;
import rpg.personagem.Personagem;

public class AtaqueCommand implements Command{
	private Personagem personagem;
	public AtaqueCommand(Personagem personagem) {
		this.personagem = personagem;
	}
	@Override
	public void acao() {
		personagem.atacar();
	}
}
