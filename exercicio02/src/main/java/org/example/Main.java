package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Informe um número (ou digite 'sair' para encerrar): ");
                String entrada = scanner.next();

                // Se o usuário digitar 'sair', o loop é encerrado
                if (entrada.equalsIgnoreCase("sair")) {
                    break;
                }

                int numero = Integer.parseInt(entrada);

                if (pertenceAFibonacci(numero)) {
                    System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
                } else {
                    System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
                }

            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        scanner.close();
    }

    public static boolean pertenceAFibonacci(int numero) {
        if (numero < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        return false;
    }
}

