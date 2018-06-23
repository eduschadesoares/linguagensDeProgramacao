/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class Read {

    //Inicia método read
    public String insereNome() {
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        nome = ler.next();
        return nome;
    }
    //Fim método read

}
