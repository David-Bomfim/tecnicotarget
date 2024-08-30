package org.example;

public class Main {
    public static void main(String[] args) {


        int indice = 13;
        int soma = 0;
        int K = 0;

        do {
            System.out.println(K);
            K++;
            soma = soma + K;
        }

        while(K < indice);

        System.out.println("O Resultado de Soma é" + soma);








    }
}