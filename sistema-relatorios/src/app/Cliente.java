package app;

import relatorios.*;

public class Cliente {
    public static void main (String[] args){
        System.out.println("\n");

        RelatorioTemplate relatorio = new RelatorioSoma();
        System.out.println(relatorio.getEstado());
        relatorio.gerarRelatorio(3, 4);
        System.out.println(relatorio.visualizar());

        System.out.println("\n");

        System.out.println(relatorio.getEstado());
        relatorio.gerarRelatorio(5, 7);
        System.out.println(relatorio.visualizar());
        relatorio.publicar();
        relatorio.finalizar();

        System.out.println("\n");

        System.out.println(relatorio.getEstado());
        relatorio.gerarRelatorio(1, 2);
        relatorio.finalizar();
        relatorio.publicar();

        System.out.println("\n");

        System.out.println(relatorio.getEstado());
        relatorio.gerarRelatorio(1, 2);
        relatorio.finalizar();
        relatorio.publicar();

        System.out.println("\n");

        RelatorioTemplate relatorio2 = new RelatorioMultiplicacao();
        System.out.println(relatorio2.getEstado());
        relatorio2.gerarRelatorio(3, 4);
        System.out.println(relatorio2.visualizar());
    }
}
