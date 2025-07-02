package util;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoBD{
    public static Connection conectar() throws SQLException{
        String url = "jdbc:postgresql://localhost:5432/crud_escola";
        String usuario = System.getenv("DB_USER");
        String senha = System.getenv("DB_PASS");

        return DriverManager.getConnection(url, usuario, senha);
    }
}