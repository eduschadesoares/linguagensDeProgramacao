package prova;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Passaros pass1 = new Passaros("Tucano", "João", 10, "verde");
        Passaros pass2 = new Passaros("Sabiá", "Alfredo", 20, "verde");
        Passaros pass3 = new Passaros("Pato", "José", 40, "verde");
        adicionaPassaro(pass1, pass2, pass3);
    }

    public static void adicionaPassaro(Passaros pass1, Passaros pass2, Passaros pass3) {
        Passaros pass4 = new Passaros();
        Scanner ler = new Scanner(System.in);
        System.out.printf("Insira a espécie do pássaro: ");
        pass4.setEspecie(ler.nextLine());
        System.out.printf("Insira o nome do pássaro: ");
        pass4.setNome(ler.nextLine());
        System.out.printf("Insira a cor do pássaro: ");
        pass4.setCor(ler.nextLine());

        Scanner num = new Scanner(System.in);
        System.out.printf("Insira a árvore do pássaro: ");
        int numArvore = (num.nextInt());

        while (numArvore != 10 && numArvore != 20 && numArvore != 30 && numArvore != 40) {
            System.out.println("Árvore não existe! Tente novamente!");
            System.out.printf("Insira a árvore do pássaro: ");
            numArvore = (num.nextInt());
        }

        while (numArvore == pass1.getArvore() || numArvore == pass2.getArvore() || numArvore == pass3.getArvore()) {
            System.err.println("Árvore ocupada! Tente novamente! ");
            System.out.printf("Insira a árvore do pássaro: ");
            numArvore = (num.nextInt());
            if (numArvore != 10 && numArvore != 20 && numArvore != 30 && numArvore != 40) {
                System.out.println("Árvore não existe! Tente novamente!");
                System.out.printf("Insira a árvore do pássaro: ");
                numArvore = (num.nextInt());
            }
        }
        pass4.setArvore(numArvore);
        System.out.println("Pássaro inserido com sucesso!");
        
        System.out.printf("Pássado da espécie: %s, nome: %s, da cor: %s, foi inserido na árvore: %s\n\n",
                pass4.getEspecie(), pass4.getNome(), pass4.getCor(), pass4.getArvore());

    }
}
