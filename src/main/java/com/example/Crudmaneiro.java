package com.example;

import java.sql.*;
import java.util.*;

public class Crudmaneiro {
    public static void main(String[] args){
        try(var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod","")){
            System.out.println("Acesso realizado com sucesso.");
            Scanner scanner = new Scanner(System.in);
            int opcao;

            do{
                System.out.println("\nEscolha uma opção a seguir: ");
                System.out.println("1. Criar registro");
                System.out.println("2. Ler registro");
                System.out.println("3. Atualizar registro");
                System.out.println("4. Remover registro");
                System.out.println("0. Encerrar aplicação");
                opcao = scanner.nextInt();

                switch (opcao){
                    case 1:
                        criarRegistro(conn, scanner);
                        break;
                    case 2:
                        lerRegistro(conn);
                        break;
                    case 3:
                        atualizarRegistro(conn,scanner);
                        break;
                    case 4:
                        removerRegistro(conn,scanner);
                        break;
                    case 0:
                        System.out.println("Encerrando aplicação...");
                        break;
                    default:
                        System.out.println("Digite uma opção válida");
                }


            } while (opcao!=0);
        } catch (SQLException e){
            System.err.println("Um erro inesperado ocorreu.\n" + e.getMessage());
        }
    }

    private static void criarRegistro(Connection conn,Scanner scanner)throws SQLException {
        System.out.println("Digite o nome do novo aluno: ");
        String aluno = scanner.next();
        System.out.println("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        String sql = "INSERT INTO planilha (aluno,idade) VALUES (?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1,aluno);
        stmt.setInt(2,idade);
        stmt.executeUpdate();
        System.out.println("Aluno adicionado com sucesso");

    }

    private static void lerRegistro(Connection conn) throws SQLException{
        String sql = "SELECT * FROM planilha";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        System.out.println("Registros da tabela: ");
        while(result.next()){
            String aluno = result.getString("aluno");
            int idade = result.getInt("idade");
            System.out.println("Aluno: " + aluno + "| Idade: " +idade);
        }


    }

    private static void atualizarRegistro(Connection conn, Scanner scanner) throws SQLException {
        System.out.println("Qual aluno deseja atualizar?");
        String alunoAntigo = scanner.next();
        System.out.println("Qual o novo nome? ");
        String alunoNovo = scanner.next();
        System.out.println("Qual a nova idade?");
        int idadeNova = scanner.nextInt();
        String sql = "UPDATE planilha SET aluno = ?, idade = ? WHERE aluno = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1,alunoNovo);
        stmt.setInt(2,idadeNova);
        stmt.setString(3,alunoAntigo);
        stmt.executeUpdate();
        System.out.println("Atualização realizada com sucesso.");


    }

    private static void removerRegistro(Connection conn, Scanner scanner) throws SQLException {
        System.out.println("Qual registro deseja remover?");
        String aluno = scanner.next();
        String sql = "DELETE FROM planilha WHERE aluno = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1,aluno);
        stmt.executeUpdate();
        System.out.println("Aluno removido com sucesso");


    }
    
}
