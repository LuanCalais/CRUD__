/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import modelo.Documentos;
import dao.DocumentosDAO;
import java.util.ArrayList;

/**
 *
 * @author luanc
 */
public class TesteListar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DocumentosDAO dao = new DocumentosDAO();
        ArrayList<Documentos> listaDocumentos = dao.listar();
        
        for(Documentos d : listaDocumentos){
            System.out.println(d.getDescricao());
            System.out.println(d.getData());
            System.out.println(d.getTipo());
        }
        
    }
    
}
