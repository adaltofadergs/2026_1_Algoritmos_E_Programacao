/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_1;

import java.util.Scanner;

/**
 *
 * @author adalto.sparremberger
 */
public class POO_1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //Pessoa p2 = new Pessoa();
        Cidade c1 = new Cidade();
        c1.setNome("Porto Alegre");
         
        p1.city = c1;
        //Pessoa p2 = new Pessoa();
        //Pessoa p3 = new Pessoa();
        p1.cadastrar();
        //p2.cadastrar();
        //p3.cadastrar();
        System.out.println("----------------------");
        p1.exibir();
        //System.out.println("----------------------");
        //p2.exibir();
        //System.out.println("----------------------");
        //p3.exibir();
        System.out.println("----------------------");
        //p1.alterar();
        //p1.exibir();
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Digite o ano atual: ");
        int ano = ler.nextInt();
        p1.imprimirIdade( ano );
        
  
    }
    
}
