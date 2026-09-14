package relatorios;

public class RelatorioSoma extends RelatorioTemplate {
    public RelatorioSoma (){
        super("OBJETO CRIADO: [RELATORIO SOMA]");
    }
    @Override
    protected int calcula(int a, int b) {
        System.out.println("[relatorio.gerarRelatorio()]: "+a+" + "+b+".");
        return a + b;
    }
    @Override
    protected String gera(int resultado) {
        return "[relatorio.visualizar()]: RELATORIO SOMA = "+resultado;
    }
}
