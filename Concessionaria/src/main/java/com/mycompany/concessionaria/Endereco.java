package com.mycompany.concessionaria;

import java.util.Scanner;

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
//        System.out.println("Rua: " + this.rua + ", " + this.numero + " - Bairro: " + this.bairro);
//        System.out.println("Cidade: " + this.cidade.getNome() + "/" + this.cidade.getEstado().getUf());
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Rua: " + this.rua + ", " + this.numero + 
                " - Bairro: " + this.bairro + "\n" + this.cidade.toString();
    }
    
    
    public Endereco(){
        
    }
    
    public void cadastrar(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o Endereco: ");
        this.rua = ler.nextLine();
        System.out.print("Informe numero: ");
        this.numero = ler.nextInt();
        ler.nextLine();
        System.out.print("Informe o Bairro: ");
        this.bairro = ler.nextLine();
        if( this.cidade == null ){
            this.cidade = new Cidade();
        }
        this.cidade.cadastrar();
    }
    
}
