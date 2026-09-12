package personagem;

public class Guerreiro implements Personagem{
	@Override
	public void atacar() {
		System.out.println("GUERREIRO [ATAQUE]: ATACA COM A ESPADA");
	}
	@Override
	public void defender() {
		System.out.println("GUERREIRO [DEFESA]: DEFENDE COM O ESCUDO");
	}
	@Override
	public void habilidade() {
		System.out.println("GUERREIRO [HABILIDADE]: +100% DE DANO NO PROXIMO TURNO");
	}
}
