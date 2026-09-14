package estados;

import relatorios.RelatorioTemplate;

public class Publicado implements EstadoRelatorio {

    @Override
    public boolean verificarGeracao() {
        System.out.println("Tentativa falha de geração: Este relatório já foi publicado!");
        return false;
    }

    @Override
    public void finalizar(RelatorioTemplate relatorio) {
        System.out.println("[relatorio.finalizar()]: Tentativa falha de finalização: Este relatório já foi publicado!");
    }

    public void reabrir(RelatorioTemplate relatorio){
        System.out.println("[relatorio.reabrir()]: Tentativa falha em reabrir: o relatório já foi publicado.");
    }

    @Override
    public void publicar(RelatorioTemplate relatorio) {
        System.out.println("[relatorio.publicar()]: Tentativa falha de publicação: Este relatório já foi publicado!");
    }

    @Override
    public String getEstado(){
        return "[relatorio.getEstado()]: PUBLICADO.";
    }
}