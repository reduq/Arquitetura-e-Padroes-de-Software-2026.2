package rpg.app;
import rpg.acaoCommand.*;
import rpg.factory.*;
import rpg.personagem.Personagem;

public class Cliente {
		public static void main(String[] args) {
		
			//cliente seleciona a classe "Guerreiro" pelo setter
			//declara a variável de referência 'fabrica'
			//instancia o objeto 'FabricaGuerreiro' e armazena sua referência em 'fabrica'
			FabricaPersonagem fabrica = new FabricaGuerreiro();
			
			
			//declara a variável de referência guerreiro como um Personagem (interface).
			//através da referência armazenada em "fabrica" chama o método criaPersonagem(), implementado por 'FabricaGuerreiro'
			//o método instancia um objeto 'Guerreiro' e retorna sua referência, que é armazenada na variável guerreiro.
			Personagem guerreiro = fabrica.criaPersonagem();
			
			//cliente seleciona a classe "Arqueiro" pelo setter
			//instancia o objeto 'FabricaArqueiro' e armazena sua referência em 'fabrica'
			fabrica = new FabricaArqueiro();
			Personagem arqueiro = fabrica.criaPersonagem();

			fabrica = new FabricaFeiticeiro();
			Personagem feiticeiro = fabrica.criaPersonagem();

			//declara uma referência pra interface das nossas ações
			Command c;
			
			System.out.println("\n==TURNO DO ARQUEIRO==");
			//instancia um command concreto de ataque para o personagem arqueiro e armazena a referência em "c"
			c = new AtaqueCommand(arqueiro);
			//chama o método de ação dentro do command do ataque, que por sua vez chama o método atacar dentro do objeto arqueiro
			c.acao();
			
			System.out.println("\n==TURNO DO GUERREIRO==");
			c = new DefesaCommand(guerreiro);
			c.acao();
			System.out.println("\n==TURNO DO FEITICEIRO==");
			c = new HabilidadeCommand(feiticeiro);
			c.acao();

		}
}
