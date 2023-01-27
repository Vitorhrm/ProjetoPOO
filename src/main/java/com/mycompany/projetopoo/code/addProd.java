/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopoo.code;
import jakarta.inject.Named;
import java.util.Vector;

import jakarta.enterprise.context.ApplicationScoped;
/**
 *
 * @author vitor
 */
@Named("addProd")
@ApplicationScoped
public class addProd{
    private Vector<ProdutoModel> produtos = new Vector<ProdutoModel>();
    private ProdutoModel dadosUsuario = new ProdutoModel();
    private int idRemover=0;
    private int idComprar=0;

    public int getIdComprar() {
        return idComprar = 0;
    }

    public void setIdComprar(int idComprar) {
        this.idComprar = idComprar;
    }


    public int getIdRemover() {
        return idRemover = 0;
    }

    public void setIdRemover(int idRemover) {
        this.idRemover = idRemover;
    }
    
    private String mensagem="chegou ate aqui";

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String usuario) {
        this.mensagem = usuario;
    }

    public ProdutoModel getDadosUsuario() {
        return dadosUsuario;
    }

    public void setDadosUsuario(ProdutoModel dadosUsuario) {
        this.dadosUsuario = dadosUsuario;
    }

    public void addProduto(){
        this.produtos.add(this.dadosUsuario);
        this.dadosUsuario = new ProdutoModel();
    }
    public String listar(){
        String lista = "";
        for(int i=0;i<this.produtos.size();i++){
            lista += ("nome: "+this.produtos.get(i).getNome()+"\nPreço: "+this.produtos.get(i).getPreco()+"\nEstoque: "+this.produtos.get(i).getEstoque()+"\nID:  "+this.produtos.get(i).getId()+"\n\n<br/>  ");
        }
        return lista;
    }



    public void remover(){
        for(int i=0;i<this.produtos.size();i++){
            if(this.produtos.get(i).getId()==idRemover){
                this.produtos.remove(i);
            }
        }
    }


    public void comprar(){
        for(int i=0;i<this.produtos.size();i++){
            if(this.produtos.get(i).getId()==idComprar){
                this.produtos.get(i).setEstoque(this.produtos.get(i).getEstoque()-1);
            }
        }
    }

    public Vector<ProdutoModel> getProdutos() {
        return produtos;
    }


   }
    
