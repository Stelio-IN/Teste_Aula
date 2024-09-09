/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    // URL de conexão JDBC para o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/leide_esperanca";
    // Nome de usuário do banco de dados
    private static final String USER = "root"; // Altere para o seu usuário do MySQL
    // Senha do banco de dados
    private static final String PASSWORD = ""; // Altere para a sua senha do MySQL

    /**
     * Método para obter uma conexão com o banco de dados MySQL
     * 
     * @return Conexão com o banco de dados MySQL
     * @throws SQLException Se ocorrer um erro ao conectar ao banco de dados
     */
    public static Connection getConnection() throws SQLException {
        // Registra o driver JDBC do MySQL
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Driver MySQL não encontrado", e);
        }

        // Retorna a conexão
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

 
}
