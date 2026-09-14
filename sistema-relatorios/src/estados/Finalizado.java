package estados;

import relatorios.RelatorioTemplate;

public class Finalizado implements EstadoRelatorio {

    @Override
    public boolean verificarGeracao() {
        System.out.println("[relatorio.gerarRelatorio()]: Tentativa falha de geração: Este estado não permite mudanças! Reabra para edição.");
        return false;
    }

    @Override
    public void finalizar(RelatorioTemplate relatorio) {
        System.out.println("[relatorio.finalizar()]: Tentativa falha de finalização: Este relatório já está finalizado!");
    }

    public void reabrir(RelatorioTemplate relatorio){
        System.out.println("[relatorio.reabrir()]: Retornando à elaboração...");
        relatorio.mudarEstado(new EmElaboracao());
    }

    @Override
    public void publicar(RelatorioTemplate relatorio) {
        System.out.println("[relatorio.publicar()]: Relatório publicado com sucesso!");
        relatorio.mudarEstado(new Publicado());
    }

    @Override
    public String getEstado(){
        return "[relatorio.getEstado()]: FINALIZADO.";
    }
}