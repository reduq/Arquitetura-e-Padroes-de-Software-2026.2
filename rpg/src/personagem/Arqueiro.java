package personagem;

public class Arqueiro implements Personagem{
	@Override
	public void atacar() {
		System.out.println("ARQUEIRO [ATAQUE]: LANÇA FLECHA");
	}
	@Override
	public void defender() {
		System.out.println("ARQUEIRO [DEFESA]: SE DEFENDE COM ARCO");
	}
	@Override
	public void habilidade() {
		System.out.println("ARQUEIRO [HABILIDADE]: CHUVA DE FLECHAS");
	}
}
