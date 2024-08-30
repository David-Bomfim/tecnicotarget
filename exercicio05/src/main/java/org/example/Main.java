package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string para ser invertida: ");
        String original = scanner.nextLine();
        scanner.close();

        // Inversão manual da string
        String invertida = inverterString(original);

        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);
    }

    // Função para inverter uma string
    public static String inverterString(String str) {
        StringBuilder stringInvertida = new StringBuilder();

        // Percorre a string de trás para frente
        for (int i = str.length() - 1; i >= 0; i--) {
            stringInvertida.append(str.charAt(i));
        }

        return stringInvertida.toString();
    }
}
