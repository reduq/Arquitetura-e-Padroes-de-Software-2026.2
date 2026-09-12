package app;
import acaoCommand.*;
import factory.*;
import personagem.Personagem;

public class Cliente {
		public static void main(String[] args) {
		
			//cliente seleciona a classe "Guerreiro" pelo setter
			//declara a variável de referência 'fabrica'
			//instancia o objeto 'FabricaGuerreiro' e armazena sua referência em 'fabrica'
			FabricaPersonagem fabrica = new FabricaGuerreiro();
			
			
			//declara a variável de referência guerreiro como um Personagem (interface).
			//através da referência armazenada em "fabrica" chama o metodo criaPersonagem(), implementado por 'FabricaGuerreiro'
			//o metodo instancia um objeto 'Guerreiro' e retorna sua referencia, que e armazenada na variável guerreiro.
			Personagem guerreiro = fabrica.criaPersonagem();
			//Instancia um invoker passando nosso Personagem Guerreiro como parâmetro
			Invoker iGuerreiro = new Invoker(guerreiro);
			
			//cliente seleciona a classe "Arqueiro" pelo setter
			//instancia o objeto 'FabricaArqueiro' e armazena sua referência em 'fabrica'
			fabrica = new FabricaArqueiro();
			Personagem arqueiro = fabrica.criaPersonagem();
			//Instancia um invoker passando nosso Personagem Arqueiro como parâmetro
			Invoker iArqueiro = new Invoker(arqueiro);

			//cliente seleciona a classe "Feiticeiro" pelo setter
			//instancia o objeto 'FabricaFeiticeiro' e armazena sua referência em 'fabrica'
			fabrica = new FabricaFeiticeiro();
			Personagem feiticeiro = fabrica.criaPersonagem();
			//Instancia um invoker passando nosso Personagem Feiticeiro como parâmetro
			Invoker iFeiticeiro = new Invoker(feiticeiro);

			System.out.println("\n=====TURNO=====");
			//através do Invoker.invoke() passamos as chaves dos comandos que estão relacionados aos concreteCommand no
			//mapa hash da classe Invoker como parâmetro. Para que então seja instanciado esse Command dentro do metodo,
			//e esse seja chamado através do nosso Personagem passado no construtor do invoker
			iGuerreiro.invoke("D");
			iArqueiro.invoke("A");
			iFeiticeiro.invoke("H");
		}
}
