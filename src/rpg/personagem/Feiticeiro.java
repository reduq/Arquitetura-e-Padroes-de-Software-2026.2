package rpg.personagem;

public class Feiticeiro implements Personagem{
	@Override
	public void atacar() {
		System.out.println("FEITICEIRO: ATACA");
	}
	@Override
	public void defender() {
		System.out.println("FEITICEIRO: DEFENDE");
	}
	@Override
	public void habilidade() {
		System.out.println("FEITICEIRO: HABILIDADE");
	}
}
