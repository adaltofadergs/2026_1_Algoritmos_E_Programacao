
package com.mycompany.concessionaria;

import java.util.Scanner;


public class Cidade {
    
    private String nome;
    private Estado estado;
    
    public Cidade(String nome,Estado estado ){
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void exibir(){
//        System.out.println("Cidade: " + this.nome + "/" 
//                + this.getEstado().toString() );
        System.out.println( this );
    }

    @Override
    public String toString() {
        return "Cidade: " + this.nome + "\n" 
                + this.getEstado().toString(); 
    }
    
    
    public void cadastrar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome da Cidade: ");
        this.nome = ler.nextLine();
        if( this.estado == null ){
            this.estado = new Estado();
        }
        this.estado.cadastrar();
    }

    public Cidade() {
    }

    public Cidade(String nome) {
        this.nome = nome;
    }

    public Cidade(Estado estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
