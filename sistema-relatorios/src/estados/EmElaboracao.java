package estados;

import relatorios.RelatorioTemplate;

public class EmElaboracao implements EstadoRelatorio {
    @Override
    public void verificarGeracao() {
        System.out.println("Relatorio elaborado com sucesso!");
    }

    @Override
    public void finalizar(RelatorioTemplate relatorio) {
        System.out.println("Relatório finalizado com sucesso! (Você não poderá mais fazer mudanças)");
        relatorio.mudarEstado(new Finalizado());
    }
    @Override
    public void publicar(RelatorioTemplate relatorio){
        System.out.println("Tentativa falha de publicação: para publicar finalize antes!");
    }

    @Override
    public String getEstado(){
        return "[ESTADO]: Em Elaboração. Você pode gerar um novo relatório!";
    }
}