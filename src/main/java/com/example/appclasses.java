package com.example;


public class appclasses {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setRenda(2000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);;
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());
        System.out.println();

        Cliente cliente2 = new Cliente(2000,'F');

        cliente2.setAnoNascimento(1970);
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Especial: " + cliente2.isEspecial());

        
    }
    
}
