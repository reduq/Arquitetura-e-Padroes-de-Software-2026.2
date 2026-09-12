package app;

import relatorios.*;

public class Cliente {
    public static void main (String[] args){
        RelatorioTemplate relatorio = new RelatorioSoma();
        System.out.println(relatorio.gerarRelatorio(5, 2));

        relatorio = new RelatorioMultiplicacao();
        System.out.println(relatorio.gerarRelatorio(2, 2));
    }
}
