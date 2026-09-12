package estados;

import relatorios.RelatorioTemplate;

public interface EstadoRelatorio {

    String getEstado();

    void verificarGeracao();

    void finalizar(RelatorioTemplate relatorio);

    void publicar(RelatorioTemplate relatorio);
}