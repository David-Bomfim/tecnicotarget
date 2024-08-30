package org.example;

import java.util.Arrays;

public class Main  {

    public static void main(String[] args) {
        // Exemplo de vetor com o faturamento diário do mês (30 dias)
        double[] faturamentoDiario = {
                200.5, 350.8, 0.0, 100.4, 500.0, 450.7, 0.0, 600.9, 250.3, 700.5,
                800.0, 0.0, 900.5, 1200.3, 1100.8, 0.0, 1500.4, 0.0, 950.2, 500.5,
                300.6, 750.7, 600.3, 0.0, 400.9, 450.1, 0.0, 650.8, 800.9, 900.0
        };

        double menorFaturamento = calcularMenorFaturamento(faturamentoDiario);
        double maiorFaturamento = calcularMaiorFaturamento(faturamentoDiario);
        double mediaMensal = calcularMediaMensal(faturamentoDiario);
        int diasAcimaDaMedia = contarDiasAcimaDaMedia(faturamentoDiario, mediaMensal);

        System.out.printf("Menor faturamento do mês: %.2f\n", menorFaturamento);
        System.out.printf("Maior faturamento do mês: %.2f\n", maiorFaturamento);
        System.out.printf("Número de dias com faturamento acima da média mensal: %d\n", diasAcimaDaMedia);
    }

    public static double calcularMenorFaturamento(double[] faturamentoDiario) {
        return Arrays.stream(faturamentoDiario)
                .filter(valor -> valor > 0)  // Ignora dias com faturamento zero
                .min()
                .orElse(0.0);
    }

    public static double calcularMaiorFaturamento(double[] faturamentoDiario) {
        return Arrays.stream(faturamentoDiario)
                .max()
                .orElse(0.0);
    }

    public static double calcularMediaMensal(double[] faturamentoDiario) {
        return Arrays.stream(faturamentoDiario)
                .filter(valor -> valor > 0)  // Ignora dias com faturamento zero
                .average()
                .orElse(0.0);
    }

    public static int contarDiasAcimaDaMedia(double[] faturamentoDiario, double mediaMensal) {
        return (int) Arrays.stream(faturamentoDiario)
                .filter(valor -> valor > mediaMensal)  // Considera apenas dias acima da média
                .count();
    }
}
