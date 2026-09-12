package estados;

import relatorios.RelatorioTemplate;

public class Finalizado implements EstadoRelatorio {

    @Override
    public void verificarGeracao() {
        System.out.println("Tentativa falha de geração: Este estado não permite mudanças! Gere outro objeto de relatório!");
    }

    @Override
    public void finalizar(RelatorioTemplate relatorio) {
        System.out.println("Tentativa falha de finalização: Este relatório já está finalizado!");
    }

    @Override
    public void publicar(RelatorioTemplate relatorio) {
        System.out.println("Relatório publicado com sucesso!");
        relatorio.mudarEstado(new Publicado());
    }

    @Override
    public String getEstado(){
        return "[ESTADO]: Finalizado. Você pode publicá-lo!";
    }
}