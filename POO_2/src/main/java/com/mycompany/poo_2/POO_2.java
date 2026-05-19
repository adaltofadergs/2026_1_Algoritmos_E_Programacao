/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_2;

import java.util.Scanner;

/**
 *
 * @author flavio.treib
 */
public class POO_2 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Cidade c1 = new Cidade("Canoas", 150000);
        Cidade c2 = new Cidade("Alvorada");
        Cidade c3 = new Cidade();
        c3.setNome("Floripa!");
        System.out.println("Construtor 1: " + c1.getNome());
        System.out.println("Construtor 2: " + c2.getNome());
        System.out.println("Construtor PAdrao: " + c3.getNome());
        
        
        p1.city = c1;
        p1.cadastrar();
        System.out.println("----------------------");
        p1.exibir();
        System.out.println("----------------------");
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite o ano atual: ");
        int ano = ler.nextInt();
        p1.imprimirIdade( ano );

    }
}
