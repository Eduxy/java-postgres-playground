package com.example;
import java.util.Scanner;


public class appScanner {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        cliente.setNome(teclado.nextLine());

        System.out.println("Digite o CPF: ");
        cliente.setCpf(teclado.nextLine());

        System.out.println("Digite a renda: ");
        cliente.setRenda(teclado.nextDouble());

        System.out.println("Digite o nascimento: ");
        cliente.setAnoNascimento(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Digite o sexo: ");
        String sexo = teclado.nextLine();
        cliente.setSexo(sexo.charAt(0));
        
        teclado.close();
        
        
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());
        System.out.println();

        

       
       
    }
    
}
