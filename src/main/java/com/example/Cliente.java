package com.example;

public class Cliente{
    private double renda;
    private char sexo;
    private boolean especial;
    private String nome;
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public Cliente(){
        System.out.println("Criando um Cliente usando construtor sem parâmetros.");
        double aleatorio = Math.random();
        if(aleatorio>0.5)
            especial = true;
    }

    public Cliente(double renda, char sexo){
        this();
        System.out.println("Criando um Cliente usando construtos com parâmetros.");
        setRenda(renda);
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo=='M' || sexo =='F')
            this.sexo = sexo;
        else System.out.println("Sexo inválido");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    private int anoNascimento;

    double getRenda() {
        return renda;
    }

    void setRenda(double renda){
        if(renda>=0)
            this.renda = renda;
        else System.out.println("A renda deve ser maior ou igual a zero.");

    }
    
}