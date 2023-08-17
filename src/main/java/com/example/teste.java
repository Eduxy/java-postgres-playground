package com.example;

import java.util.Arrays;

public class teste {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello, World!");
        System.out.println();

        int idade = 32;
        double peso = 80.9;
        System.out.println("Idade é " + idade + " anos e o peso é " + peso + " quilos.");
        System.out.println();

        double vetor[] = {1,2,3};
        System.out.println(Arrays.toString(vetor));

        double matriz[][]= {{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(matriz[0]));
        matriz[0] = new double[]{7,8};
        System.out.println(Arrays.toString(matriz[0]));

        System.out.println("------------------");

        double matriz2[][] = new double [3][4];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (i * matriz2[i].length +j+1)*10;
                
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.printf("%5.1f ", matriz2[i][j]);
                
            }
            System.out.println();
        }

    }
    
}
