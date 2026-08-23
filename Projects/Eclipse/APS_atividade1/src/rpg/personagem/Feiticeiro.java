package rpg.personagem;

public class Feiticeiro implements Personagem{
	@Override
	public void atacar() {
		System.out.println("FEITICEIRO: ATAQUE!");
	}
	@Override
	public void defender() {
		System.out.println("FEITICEIRO: DEFESA!");
	}
	@Override
	public void habilidade() {
		System.out.println("FEITICEIRO: HABILIDADE!");
	}
}
