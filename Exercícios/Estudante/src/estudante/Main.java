package estudante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante(12312312, "Robson", 9.0, 4.5, 7.9);
        Estudante estudante2 = new Estudante(12312312, "Nelso", 5.1, 7.0, 3.0);
        Estudante estudante3 = new Estudante(12312312, "Fernando", 6.3, 9.3, 5.7);

        System.out.printf("O estudante %s possui média %.2f. O Aluno está %s\n", estudante1.getNome(), estudante1.getMedia(), estudante1.isAprovado());
        System.out.printf("O estudante %s possui média %.2f. O Aluno está %s\n", estudante2.getNome(), estudante2.getMedia(), estudante2.isAprovado());
        System.out.printf("O estudante %s possui média %.2f. O Aluno está %s\n", estudante3.getNome(), estudante3.getMedia(), estudante3.isAprovado());

        altera(estudante2);
        
        System.out.printf("A nova média do estudante %s é %.2f. O Aluno está %s\n", estudante2.getNome(), estudante2.getMedia(), estudante2.isAprovado());
    }

    public static void altera(Estudante estudante2) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Insira a nota 1 do estudante %s: ", estudante2.getNome());
        estudante2.setNota1(ler.nextDouble());
        System.out.printf("Insira a nota 2 do estudante %s: ", estudante2.getNome());
        estudante2.setNota2(ler.nextDouble());
        System.out.printf("Insira a nota 3 do estudante %s: ", estudante2.getNome());
        estudante2.setNota3(ler.nextDouble());        
    }

}
