package acaoCommand;
import personagem.Personagem;

public class AtaqueCommand implements Command{
	private final Personagem personagem;
	public AtaqueCommand(Personagem personagem) {
		this.personagem = personagem;
	}
	@Override
	public void acao() {
		personagem.atacar();
	}
}
