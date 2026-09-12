package relatorios;
public abstract class RelatorioTemplate {

    public final String gerarRelatorio(int a, int b){
        return gera(calcula(a,b));
    }

    protected abstract int calcula(int a, int b);

    protected abstract String gera(int resultado);
}