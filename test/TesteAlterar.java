/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.Documentos;
import dao.DocumentosDAO;
import java.sql.SQLException;

/**
 *
 * @author luanc
 */
public class TesteAlterar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
        Documentos d = new Documentos();
        d.setId(190);
        d.setDescricao("Teste Update");
        d.setData("11-11-1111");
        d.setTipo("update");
        
        double novoValor = 10.50;
        
        DocumentosDAO atualizar = new DocumentosDAO();
        atualizar.atualizar(d);
        
        System.out.println("Sucesso!");
        
    }
    
}
