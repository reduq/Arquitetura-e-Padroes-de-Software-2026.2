package rpg.personagem;

public class Arqueiro implements Personagem{
	@Override
	public void atacar() {
		System.out.println("ARQUEIRO: ATACA");
	}
	@Override
	public void defender() {
		System.out.println("ARQUEIRO: DEFENDE");
	}
	@Override
	public void habilidade() {
		System.out.println("ARQUEIRO: HABILIDADE");
	}
}
