package rpg.personagem;

public class Guerreiro implements Personagem{
	@Override
	public void atacar() {
		System.out.println("GUERREIRO: ATAQUE!");
	}
	@Override
	public void defender() {
		System.out.println("GUERREIRO: DEFESA!");
	}
	@Override
	public void habilidade() {
		System.out.println("GUERREIRO: HABILIDADE!");
	}
}
