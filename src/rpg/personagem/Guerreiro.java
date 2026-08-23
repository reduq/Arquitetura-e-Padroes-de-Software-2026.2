package rpg.personagem;

public class Guerreiro implements Personagem{
	@Override
	public void atacar() {
		System.out.println("GUERREIRO: ATACA");
	}
	@Override
	public void defender() {
		System.out.println("GUERREIRO: DEFENDE");
	}
	@Override
	public void habilidade() {
		System.out.println("GUERREIRO: HABILIDADE");
	}
}
