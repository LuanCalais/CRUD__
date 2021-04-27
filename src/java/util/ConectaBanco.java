/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luanc
 */
public class ConectaBanco {
    
    public static Connection getConexao(){
        Connection conexao = null;
        try{
            
            Class.forName("org.postgresql.Driver");//Driver de conexão 
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Deposito", "postgres", "125678943");
            
        }catch(ClassNotFoundException ex){//Ocorre caso o Driver não esteja instalado 
            throw new RuntimeException(ex);
        }catch(SQLException ex){//Ocorre no caso de algum erro na linha 22 getConnection
            throw new RuntimeException(ex);
        }
        
        return conexao;   
    }
}
