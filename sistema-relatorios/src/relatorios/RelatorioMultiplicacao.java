package relatorios;

public class RelatorioMultiplicacao extends RelatorioTemplate {
    public RelatorioMultiplicacao() {
        super("OBJETO CRIADO: RELATORIO MULTIPLICAÇÃO");
    }

    @Override
    protected int calcula(int a, int b) {
        System.out.println("[relatorio.gerarRelatorio()]: "+a+" * "+b+".");
        return a * b;
    }
    @Override
    protected String gera(int resultado) {
        return "[relatorio.visualizar()]: MULTIPLICAÇÃO = "+resultado;
    }
}
