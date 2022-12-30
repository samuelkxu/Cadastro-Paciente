package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author samue
 */

public class Conexao {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost";
    private static final String PORT = "3306";
    private static final String USER = "root";
    private static final String PASS = "Samuzonasul05";
    private static final String DB = "cadastro";
    private static final String TIMEZONE = "useTimezone=true&serverTimezone=UTC";
    
    private Connection conn;
    private static Conexao instance;

    public Conexao() throws ClassNotFoundException, SQLException {
        
        String conexao = URL + ":" + PORT + "/" + DB + "?" + TIMEZONE;
        
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(conexao, USER, PASS);   
    }
    
    public static Conexao getInstance() throws ClassNotFoundException, SQLException{
        
        if(instance == null)
            instance = new Conexao();
        
        return instance;
    }
    
    public Connection getConnection(){
        return conn;
    }
    
 
    
    
}
