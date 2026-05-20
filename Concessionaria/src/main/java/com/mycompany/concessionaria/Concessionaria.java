package com.mycompany.concessionaria;

import java.util.Scanner;
public class Concessionaria {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        Estado e = new Estado();
        e.cadastrar();
        
        Cidade c = new Cidade();
        c.cadastrar();
        

        
        
        Endereco end = new Endereco();
        end.cadastrar();
        
        System.out.println("Informe a marca do carro: ");
        String marca = ler.nextLine();
        System.out.println("Informe o modelo do carro: ");
        String modelo = ler.nextLine();
        System.out.println("Informe o ano do carro: ");
        String ano = ler.nextLine();
        System.out.println("Informe a cor do carro: ");
        String cor = ler.nextLine();
        Carro cr = new Carro(marca, modelo, ano, cor);
        
        System.out.println("Informe o nome do cliente: ");
        String nomecliente = ler.nextLine();
        Cliente cl = new Cliente(nomecliente, end, cr);
        cl.exibir();
        
        
        
        
    }
}
