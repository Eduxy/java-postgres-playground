package com.example;

import java.sql.*;
import java.util.*;

public class copiaecola{
    public static void main(String[] args){

        try(var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgre", "gitpod", "")) {
            System.out.println("\nConexão estabelecida com sucesso.");

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nOpções:");
            System.out.println("1. Criar registro");
            System.out.println("2. Ler registro");
            System.out.println("3. Atualizar registro");
            System.out.println("4. Deletar registro");
            System.out.println("Digite o número da sua opção");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    criarRegistro(conn, scanner);
                    break;
                case 2:
                    lerRegistro(conn);
                    break;
                case 3:
                    atualizarRegistro(conn, scanner);
                    break;
                case 4:
                    deletarRegistro(conn, scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa\n");
                    break;
                default:
                    System.out.println("Insira um valor válido!\n");
            }
        } while (opcao != 0);

        }catch (SQLException e){
            System.err.println("Falha na conexão com o BD\n" + e.getMessage());
        }
    }

    private static void criarRegistro(Connection conn, Scanner scanner) throws SQLException {
        System.out.println("Digite o nome do aluno: ");
        String aluno = scanner.next();
        System.out.println("Digite a idade do aluno: ");
        int idade = scanner.nextInt();

        String sql = "INSERT INTO planilha(aluno, idade) VALUES (?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, aluno);
        stmt.setInt(2, idade);
        stmt.executeUpdate();

        System.out.println("\nRegistro criado com sucesso");
    }

    private static void lerRegistro(Connection conn) throws SQLException{
        String sql = "SELECT * FROM planilha";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        System.out.println("Registros da tabela:");
        while(result.next()){
            String aluno = result.getString("aluno");
            int idade = result.getInt("idade");
            System.out.println("Aluno: " + aluno + ", Idade: " + idade);
        }
    }

    private static void atualizarRegistro(Connection conn,Scanner scanner)throws SQLException{
        System.out.println("Digite o nome do aluno a ser atualizado:");
        String alunoAntigo = scanner.next();
        System.out.println("Digite o novo nome do aluno:");
        String alunoNovo = scanner.next();
        System.out.println("Digite a nova idade:");
        int idadeNova = scanner.nextInt();

        String sql = "UPDATE planilha SET aluno = ?, idade = ? WHERE aluno = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, alunoNovo);
        stmt.setInt(2, idadeNova);
        stmt.setString(3, alunoAntigo);
        stmt.executeUpdate();

        System.out.println("Registro atualizado com sucesso");
    }

    private static void deletarRegistro(Connection conn, Scanner scanner)throws SQLException{
        System.out.println("Digite o nome do aluno a ser deletado: ");
        String aluno = scanner.next();

        String sql = "DELETE FROM planilha WHERE aluno = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1,aluno);
        stmt.executeUpdate();

        System.out.println("Registro deletado com sucesso");
    }
}