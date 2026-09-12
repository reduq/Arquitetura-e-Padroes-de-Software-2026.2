package relatorios;

public class RelatorioSoma extends RelatorioTemplate {
    @Override
    protected int calcula(int a, int b) {
        return a + b;
    }
    @Override
    protected String gera(int resultado) {
        return "[RELATORIO DA SOMA]\nRESULTADO: "+resultado;
    }
}
