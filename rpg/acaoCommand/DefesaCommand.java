package acaoCommand;
import personagem.Personagem;

public class DefesaCommand implements Command{
	private Personagem personagem;
		
	public DefesaCommand(Personagem personagem) {
		this.personagem = personagem;
	}
	
	@Override
	public void acao() {
		personagem.defender();
	}
}