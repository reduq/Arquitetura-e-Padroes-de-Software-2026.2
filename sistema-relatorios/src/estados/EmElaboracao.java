package estados;

import relatorios.RelatorioTemplate;

public class EmElaboracao implements EstadoRelatorio {
    @Override
    public boolean verificarGeracao() {
        return true;
    }

    @Override
    public void finalizar(RelatorioTemplate relatorio) {
        System.out.println("[relatorio.finalizar()]: Relatório finalizado com sucesso! (Você não poderá mais fazer mudanças)");
        relatorio.mudarEstado(new Finalizado());
    }

    @Override
    public void reabrir(RelatorioTemplate relatorio){
        System.out.println("[relatorio.reabrir()]: Tentativa falha em reabrir: o relatório já está aberto para edição.");
    }
    @Override
    public void publicar(RelatorioTemplate relatorio){
        System.out.println("[relatorio.publicar()]: Tentativa falha de publicação: para publicar finalize antes!");
    }

    @Override
    public String getEstado(){
        return "[relatorio.getEstado()]: EM ELABORAÇÃO.";
    }
}