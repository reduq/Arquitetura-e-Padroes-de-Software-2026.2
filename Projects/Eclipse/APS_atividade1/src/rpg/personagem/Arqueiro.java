package rpg.personagem;

public class Arqueiro implements Personagem{
	@Override
	public void atacar() {
		System.out.println("ARQUEIRO: ATAQUE!");
	}
	@Override
	public void defender() {
		System.out.println("ARQUEIRO: DEFESA!");
	}
	@Override
	public void habilidade() {
		System.out.println("ARQUEIRO: HABILIDADE!");
	}
}
