package com.mycompany.concessionaria;

import java.util.Scanner;
public class Concessionaria {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a SIGLA do estado");
        String sigla = ler.nextLine();
        System.out.println("Informe a nome do estado");
        String estado = ler.nextLine();
        
        Estado e = new Estado(estado, sigla);
        
        System.out.println("Informe a cidade: ");
        String cidade = ler.nextLine();
        Cidade c = new Cidade(cidade, e);
        
        System.out.println("Informe o Endereco: ");
        String rua = ler.nextLine();
        System.out.println("Informe numero: ");
        int numero = ler.nextInt();
        ler.nextLine();
        System.out.println("Informe o Bairro: ");
        String bairro = ler.nextLine();
        Endereco end = new Endereco(rua, numero, bairro, c);
        
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
