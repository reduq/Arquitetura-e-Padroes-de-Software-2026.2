package acaoCommand;

import java.util.HashMap;
import java.util.Map;

import personagem.Personagem;

public class Invoker {

    // Relação dos comandos
    private final static Map<String, Command> comandos = new HashMap<>();
    
	public Invoker (Personagem personagem) {
		comandos.put("A", new AtaqueCommand(personagem));
		comandos.put("D", new DefesaCommand(personagem));
		comandos.put("H", new HabilidadeCommand(personagem));
	}

    public void invoke(String comando) {
        Command c = comandos.get(comando);
        c.acao();
    }
}