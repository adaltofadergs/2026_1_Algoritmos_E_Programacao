package com.mycompany.concessionaria;

public class Endereco {
    
    private String rua;
    private int numero;
    private String bairro;
    private Cidade cidade;
    
    public Endereco(String rua,int numero,String bairro,Cidade cidade){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public void exibir(){
        System.out.println("Rua: " + this.rua + ", " + this.numero + " - Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade.getNome() + "/" + this.cidade.getEstado().getUf());
    }
    
}
