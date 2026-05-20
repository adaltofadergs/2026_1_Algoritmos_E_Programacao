package com.mycompany.concessionaria;

import java.util.Scanner;

public class Estado {
    
    private String uf;
    private String nome;
    
    

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
//        System.out.println("Estado: " + this.nome);
//        System.out.println("UF: " + this.uf);
        System.out.println( this );
    }

    @Override
    public String toString() {
        return "Estado: " + this.nome +" / " + this.uf;
    }
    
    public void cadastrar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a SIGLA do estado");
        this.uf = ler.nextLine();
        System.out.println("Informe a nome do estado");
        this.nome = ler.nextLine();
    }
    
    public Estado(){
        
    }
    
    public Estado(String sigla){
        this.uf = sigla;
    }
    
    public Estado(String nome, String uf){
        this.nome = nome;
        this.uf = uf;
        
    }
    
}
