package com.example;

import java.util.ArrayList;
import java.util.List;

public class AppListas {

    public static void main(String[] args) {
        //Cliente[] vetorClientes = new Cliente[5]; //vetor
        List<Cliente> listaClientes = new ArrayList<>(); //lista - o tipo de uma lista precisa ser uma classe
        var cliente1 = new Cliente();
        cliente1.setNome("Manoel");

        var cliente2 = new Cliente();
        cliente2.setNome("Breno");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        // ListaClientes.add(cliente2); // lista aceita elementos duplicados
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2); // aqui ocupa a lista inteira (10) e será criada uma nova lista de suporte com 50% a mais da capacidade, a menos que tenha especificado para criar uma lista maior ao criar a lista. Ex: new ArrayList<>(11);
        System.out.println(listaClientes); //precisará adicionar um método publico toString para exibir assim, lá no Cliente.java
        listaClientes.remove(0); //remove primeira posição, e segunda se torna primeira
        listaClientes.remove(0); //remove a segunda, que agora está no índice 0...
        listaClientes.remove(cliente1); //remove primeiro cliente1 que achar
        int i = listaClientes.size()-1;
        listaClientes.remove(1);

        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
            
        }
        
    }
    
}
