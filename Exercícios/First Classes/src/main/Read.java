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
