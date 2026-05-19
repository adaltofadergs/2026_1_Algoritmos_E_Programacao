/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_2;

/**
 *
 * @author flavio.treib
 */
public class Cidade {
    private String nome;
    private int populacao;
    
    public Cidade(String nome, int populacao){
        this.nome = nome;
        this.populacao = populacao;
    }
    
    public Cidade(String nome){
        this.nome = nome;
       
    }
    
     public Cidade(){
         System.out.println("Criado com sucesso!");
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

   

    
}
