package com.mycompany.concessionaria;

public class Estado {
    
    private String uf;
    private String nome;
    
    public Estado(String nome, String uf){
        this.nome = nome;
        this.uf = uf;
        
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibir(){
        System.out.println("Estado: " + this.nome);
        System.out.println("UF: " + this.uf);
    }
    
}
