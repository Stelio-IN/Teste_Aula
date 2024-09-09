/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Aluno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    // Método para adicionar um aluno
    public void adicionarAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos (nome, nota1, nota2) VALUES (?, ?, ?)";

        try (Connection conn = MySQLConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setDouble(2, aluno.getNota());
            stmt.setDouble(3, aluno.getNota2());
            stmt.executeUpdate();
            System.out.println("Aluno adicionado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para buscar todos os alunos
    public List<Aluno> buscarTodosAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT * FROM alunos";

        try (Connection conn = MySQLConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setNota(rs.getDouble("nota1"));
                aluno.setNota2(rs.getDouble("nota2"));
                alunos.add(aluno);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alunos;
    }

    // Método para atualizar um aluno
    public void atualizarAluno(Aluno aluno) {
        String sql = "UPDATE alunos SET nome = ?, nota1 = ?, nota2 = ? WHERE id = ?";

        try (Connection conn = MySQLConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setDouble(2, aluno.getNota());
            stmt.setDouble(3, aluno.getNota2());
            stmt.setInt(4, aluno.getId());
            stmt.executeUpdate();
            System.out.println("Aluno atualizado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para excluir um aluno
    public void excluirAluno(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?";

        try (Connection conn = MySQLConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Aluno excluído com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para buscar um aluno por ID
    public Aluno buscarAlunoPorId(int id) {
        String sql = "SELECT * FROM alunos WHERE id = ?";
        Aluno aluno = null;

        try (Connection conn = MySQLConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setNota(rs.getDouble("nota1"));
                aluno.setNota2(rs.getDouble("nota2"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return aluno;
    }
}
