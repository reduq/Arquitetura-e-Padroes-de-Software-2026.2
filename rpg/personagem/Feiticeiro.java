package personagem;

public class Feiticeiro implements Personagem{
	@Override
	public void atacar() {
		System.out.println("FEITICEIRO [ATAQUE]: DISPARA FEITIÇO BÁSICO");
	}
	@Override
	public void defender() {
		System.out.println("FEITICEIRO [DEFESA]: PAREDE DE GELO");
	}
	@Override
	public void habilidade() {
		System.out.println("FEITICEIRO [HABILIDADE]: BOLA DE FOGO");
	}
}
