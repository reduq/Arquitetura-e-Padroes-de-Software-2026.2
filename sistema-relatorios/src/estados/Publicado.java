package estados;

import relatorios.RelatorioTemplate;

public class Publicado implements EstadoRelatorio {

    @Override
    public void verificarGeracao() {
        System.out.println("Tentativa falha de geração: Este relatório já foi publicado!");
    }

    @Override
    public void finalizar(RelatorioTemplate relatorio) {
        System.out.println("Tentativa falha de finalização: Este relatório já foi publicado!");
    }

    @Override
    public void publicar(RelatorioTemplate relatorio) {
        System.out.println("Tentativa falha de publicação: Este relatório já foi publicado!");
    }

    @Override
    public String getEstado(){
        return "[ESTADO]: Publicado. ";
    }
}