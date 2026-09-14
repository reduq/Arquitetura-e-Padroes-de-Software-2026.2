package relatorios;
import estados.EstadoRelatorio;
import estados.EmElaboracao;

public abstract class RelatorioTemplate {

    private EstadoRelatorio estado = new EmElaboracao();
    private String resultado;

    public RelatorioTemplate(String s){
        System.out.println(s);
    }

    public final void gerarRelatorio(int a, int b){
        if(estado.verificarGeracao()){
            resultado = gera(calcula(a,b));
        }
    }
    protected abstract int calcula(int a, int b);
    protected abstract String gera(int resultado);

    public void finalizar() {
        estado.finalizar(this);
    }

    public void reabrir() {
        estado.reabrir(this);
    }

    public void publicar() {
        estado.publicar(this);
    }

    public String visualizar() {
        return resultado;
    }

    public void mudarEstado(EstadoRelatorio estado){
        this.estado = estado;
    }

    public String getEstado(){
        return this.estado.getEstado();
    }
}