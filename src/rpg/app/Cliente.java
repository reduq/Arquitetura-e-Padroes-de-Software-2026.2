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
			
			
			// declara a variável de referência p1, do tipo Personagem (interface).
			// através da referência armazenada em "fabrica" chama o método criaPersonagem(), implementado por 'FabricaGuerreiro'
			// o método instancia um objeto 'Guerreiro' e retorna sua referência, que é armazenada na variável p1.
			Personagem guerreiro = fabrica.criaPersonagem();
			
			//cliente seleciona a classe "Arqueiro" pelo setter
			//instancia o objeto 'FabricaArqueiro' e armazena sua referência em 'fabrica'
			fabrica = new FabricaArqueiro();
			
			// declara a variável de referência p2 do tipo Personagem (interface).
			// através da referência armazenada em "fabrica" chama o método criaPersonagem(), implementado por 'FabricaArqueiro'
			// o método instancia um objeto 'Arqueiro' e retorna sua referência, que é armazenada na variável p2.
			Personagem arqueiro = fabrica.criaPersonagem();
			
			//cliente seleciona a classe "Feiticeiro" pelo setter
			//instancia o objeto 'FabricaFeiticeiro' e armazena sua referência em 'fabrica'
			fabrica = new FabricaFeiticeiro();
			
			// declara a variável de referência p3 do tipo Personagem (interface).
			// através da referência armazenada em "fabrica" chama o método criaPersonagem(), implementado por 'FabricaFeiticeiro'
			// o método instancia um objeto 'Feiticeiro' e retorna sua referência, que é armazenada na variável p3.
			Personagem feiticeiro = fabrica.criaPersonagem();
			
			Command c;
			
			System.out.println("\n==TURNO DO ARQUEIRO==");
			c = new AtaqueCommand(arqueiro);
			c.acao();
			System.out.println("\n==TURNO DO GUERREIRO==");
			c = new DefesaCommand(guerreiro);
			c.acao();
			System.out.println("\n==TURNO DO FEITICEIRO==");
			c = new HabilidadeCommand(feiticeiro);
			c.acao();

		}
}
