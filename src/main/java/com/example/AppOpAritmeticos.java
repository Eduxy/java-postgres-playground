package com.example;

public class AppOpAritmeticos {

    int x(int valor){
        System.out.println("x");
        return valor;
    }

    AppOpAritmeticos(){
    System.out.println(x(2));

    }


    public static void main(String[] args) {
        
        new AppOpAritmeticos();
    }
    
}
