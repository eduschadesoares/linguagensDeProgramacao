package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome;
        
        Read chamar = new Read();
        Print chamar2 = new Print();
        
        nome = chamar.insereNome();
        
        chamar2.printa(nome);
    }

}
