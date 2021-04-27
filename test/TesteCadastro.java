/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.DocumentosDAO;
import modelo.Documentos;

/**
 *
 * @author luanc
 */
public class TesteCadastro {
    
        public static void main(String[] args) {
            
            Documentos doc = new Documentos();
            doc.setDescricao("Revistinha");
            doc.setData("12/32/4341");
            doc.setTipo("Pessoal");
            
            DocumentosDAO dao = new DocumentosDAO();
            dao.cadastrar(doc);
            
            System.out.println("Cadastrado com sucesso!!!");
        }
}
