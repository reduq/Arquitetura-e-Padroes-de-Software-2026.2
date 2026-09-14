package estados;

import relatorios.RelatorioTemplate;

public interface EstadoRelatorio {

    String getEstado();

    boolean verificarGeracao();

    void finalizar(RelatorioTemplate relatorio);

    void publicar(RelatorioTemplate relatorio);

    void reabrir(RelatorioTemplate relatorio);
}