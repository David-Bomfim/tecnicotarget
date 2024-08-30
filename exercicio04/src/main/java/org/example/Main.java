package org.example;
public class Main {

    public static void main(String[] args) {
        // Valores de faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Calcula o faturamento total
        double faturamentoTotal = sp + rj + mg + es + outros;

        // Calcula o percentual de cada estado
        double percentualSP = calcularPercentual(sp, faturamentoTotal);
        double percentualRJ = calcularPercentual(rj, faturamentoTotal);
        double percentualMG = calcularPercentual(mg, faturamentoTotal);
        double percentualES = calcularPercentual(es, faturamentoTotal);
        double percentualOutros = calcularPercentual(outros, faturamentoTotal);

        // Exibe os resultados de cada estado
        System.out.printf("Percentual de SP: %.2f%%\n", percentualSP);
        System.out.printf("Percentual de RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de ES: %.2f%%\n", percentualES);
        System.out.printf("Percentual de Outros: %.2f%%\n", percentualOutros);
    }

    // Função para calcular o percentual de um estado em relação ao total
    public static double calcularPercentual(double valorEstado, double faturamentoTotal) {
        return (valorEstado / faturamentoTotal) * 100;
    }
}
