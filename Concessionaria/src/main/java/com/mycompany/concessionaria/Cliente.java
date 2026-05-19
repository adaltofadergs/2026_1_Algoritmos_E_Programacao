
package com.mycompany.concessionaria;


public class Cliente {
    private String nome;
    private Endereco endereco;
    private Carro carro;
    
    public Cliente(String nome,Endereco endereco,Carro carro){
        this.carro = carro;
        this.endereco = endereco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public void exibir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: "); 
        this.endereco.exibir();
        this.carro.exibir();
        
    }
    
}
