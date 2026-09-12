package relatorios;

public class RelatorioMultiplicacao extends RelatorioTemplate {
    @Override
    protected int calcula(int a, int b) {
        return a * b;
    }
    @Override
    protected String gera(int resultado) {
        return "[RELATORIO DA MULTIPLICACAO]\nRESULTADO: "+resultado;
    }
}
