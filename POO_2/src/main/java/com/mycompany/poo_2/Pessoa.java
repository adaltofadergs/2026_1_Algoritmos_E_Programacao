/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_2;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author flavio.treib
 */
public class Pessoa {
    String nome;
    int anoDeNascimento;
    float altura;
    Cidade city;
    
    public int getIdade(int anoAtual){
        return anoAtual - this.anoDeNascimento;
    }
    
    public void imprimirIdade( int ano ){
        int idade = this.getIdade( ano );
        if( idade < 0 ){
            System.out.println( "Ano não pode ser menor que o ano de nascimento!"   );
        }else{
            System.out.println("Idade: " + idade );
        }
        
    }

    @Override
    public String toString() {
        String txt = "Pessoa: " + this.nome 
                    + "\nAno de Nascimento: " + this.anoDeNascimento
                    + "\nIdade: " + this.getIdade( Calendar.getInstance().get(Calendar.YEAR) )
                    + "\nAltura: " + this.altura
                    + "\nCidade: " + this.city.getNome();
        return txt;
    }
    
    

    public void cadastrar(){
        Scanner ler = new Scanner (System.in);
        System.out.print("Informe o nome: ");
        this.nome = ler.nextLine();
        System.out.print("Informe o ano de Nascimento: ");
        this.anoDeNascimento = ler.nextInt();
        System.out.print("Informe a altura: ");
        this.altura = ler.nextFloat();
        System.out.println("Cadastro Realizado! ");
    }

    public void exibir(){
//        System.out.println("Nome: "+ this.nome);
//        System.out.println("Idade: "+ this.anoDeNascimento);
//        System.out.println("Altura: "+ this.altura);
//        System.out.println( this.toString() );
        System.out.println( this );
    }
    public void alterar(){
        Scanner ler = new Scanner (System.in);
        System.out.print("Informe o novo nome: ");
        this.nome = ler.nextLine();
        System.out.print("Informe o novo ano de nascimento: ");
        this.anoDeNascimento = ler.nextInt();
        System.out.print("Informe a nova altura: ");
        this.altura = ler.nextFloat();
        System.out.println("Cadastro Alterado! ");

    }

    
}
