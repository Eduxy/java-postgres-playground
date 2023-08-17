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
    }
    
}
