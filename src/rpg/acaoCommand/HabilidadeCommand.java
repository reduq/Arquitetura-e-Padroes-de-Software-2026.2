package rpg.acaoCommand;

import rpg.personagem.Personagem;

public class HabilidadeCommand implements Command{
	private Personagem personagem;
	
	public HabilidadeCommand (Personagem personagem) {
		this.personagem = personagem;
	}
	
	@Override
	public void acao() {
		personagem.habilidade();
	}
}