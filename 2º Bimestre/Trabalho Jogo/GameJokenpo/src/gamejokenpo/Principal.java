package gamejokenpo;

import javax.swing.JOptionPane;

//Linguagens de Programação 2018
//Jogo "Jokenpo"
//Eduardo Soares
//Mateus Loman

public class Principal {

    //Váriaveis para armazenar o valor inserido pelo usuário
    static int p1;
    static int p2;
    //Variáveis para receber da interface / showInputDialog()
    static String escolha1;
    static String escolha2;
    //Verificar se o usuário já errou ou inseriu algum valor incorreto
    static boolean errou1;
    static boolean errou2;

    public static void main(String[] args) {
        //Main roda somente a função principal do jogo
        iniciaJogo();
    }

    public static void iniciaJogo() {
        //Seta as variáveis como falsa para mostrar o menu padrão
        errou1 = false;
        errou2 = false;
        JOptionPane.showMessageDialog(null, "Bora jogar jokenpo!\n"
                + "Escolha:\n"
                + "1 = Pedra\n"
                + "2 = Papel\n"
                + "3 = Tesoura");
        //Chama função para o jogador 1 inserir um valor
        jogador1();
        //Chama função para o jogador 2 inserir um valor
        jogador2();
        //Verifica quem venceu
        resultado();
        //Chama função para finalizar o jogo
        fecharJogo();
    }

    public static void fecharJogo() {
        //Verifica se o usuário quer jogar novamente
        if (JOptionPane.showConfirmDialog(null, "Querem jogar novamente?",
                "Help", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            //Se selecionado sim, chama-se a função inicial
            //e o jogo começa novamente
            iniciaJogo();
        } else {
            //Se selecionado não, o jogo é finalizado
            System.exit(0);
        }
    }

    public static void jogador1() {
        //Zera a variável que armazenar o valor inserido pelo usuário
        p1 = 0;
        //Zera a variável que armazenar o valor recebido na interface        
        escolha1 = null;

        //Se o jogador tiver inserido um valor errado, muda-se a variável
        //escolha1 e o menu é substituído com o alerta de valor inválido
        if (!errou1) { //Não errou: menu normal
            escolha1 = JOptionPane.showInputDialog("Jogador 1, é a sua vez!\n"
                    + "Escolha:\n"
                    + "1 = Pedra\n"
                    + "2 = Papel\n"
                    + "3 = Tesoura");
        } else { //Errou: menu com aviso
            escolha1 = JOptionPane.showInputDialog("Valor incorreto.\n"
                    + "Jogador 1, digite novamente!\n"
                    + "Escolha:\n"
                    + "1 = Pedra\n"
                    + "2 = Papel\n"
                    + "3 = Tesoura");
        }

        //Se for selecionado "cancel" na interface, a função retorna null
        //Se for igual null, chama-se a função para finalizar o jogo
        if (escolha1 == null) {
            fecharJogo();
        }
        try {
            //A interface retorna uma string assim precisa fazer a conversão
            //para int. Caso se não for possível, gera erro e o usuário
            //digita novamente
            p1 = Integer.parseInt(escolha1);
        } catch (NumberFormatException e) {
            errou1 = true;  //Seta variável para alertar o usuário
            jogador1(); //Chama a função novamente
        }

        while (p1 < 1 || p1 > 3) {
            errou1 = true; //Seta variável para alertar o usuário
            jogador1(); //Chama a função novamente
        }
    }

    public static void jogador2() {
        //Zera a variável que armazenar o valor inserido pelo usuário
        p2 = 0;
        //Zera a variável que armazenar o valor recebido na interface    
        escolha2 = null;

        //Se o jogador tiver inserido um valor errado, muda-se a variável
        //escolha1 e o menu é substituído com o alerta de valor inválido
        if (!errou2) { //Não errou: menu normal
            escolha2 = JOptionPane.showInputDialog("Jogador 2, é a sua vez!\n"
                    + "Escolha:\n"
                    + "1 = Pedra\n"
                    + "2 = Papel\n"
                    + "3 = Tesoura");
        } else { //Errou: menu com aviso
            escolha2 = JOptionPane.showInputDialog("Valor incorreto.\n"
                    + "Jogador 2, digite novamente!\n"
                    + "Escolha:\n"
                    + "1 = Pedra\n"
                    + "2 = Papel\n"
                    + "3 = Tesoura");
        }

        //Se for selecionado "cancel" na interface, a função retorna null
        //Se for igual null, chama-se a função para finalizar o jogo
        if (escolha2 == null) {
            fecharJogo();
        }
        try {
            //A interface retorna uma string assim precisa fazer a conversão
            //para int. Caso se não for possível, gera erro e o usuário
            //digita novamente
            p2 = Integer.parseInt(escolha2);
        } catch (NumberFormatException e) {
            errou2 = true; //Seta variável para alertar o usuário
            jogador2(); //Chama a função novamente
        }

        while (p2 < 1 || p2 > 3) {
            errou2 = true; //Seta variável para alertar o usuário
            jogador2(); //Chama a função novamente
        }
    }

    public static void resultado() {
        //Escolha do vencedor
        switch (p1) { //Escolha jogador 1
            case 1:
                switch (p2) { //Escolha jogador 2
                    case 1:
                        JOptionPane.showMessageDialog(null,
                                "Pedra com Pedra empata!");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,
                                "Papel embrulha a Pedra!\n"
                                + "Jogador 2 ganhou!");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,
                                "Pedra quebra a Tesoura!\n"
                                + "Jogador 1 ganhou!");
                        break;
                }
                break;

            case 2:
                switch (p2) { //Escolha jogador 2
                    case 1:
                        JOptionPane.showMessageDialog(null,
                                "Papel embrulha a Pedra\n"
                                + "Jogador 1 ganhou!");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,
                                "Papel com Papel empata!");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,
                                "Tesoura corta o Papel!\n"
                                + "Jogador 2 ganhou!");
                        break;
                }
                break;

            case 3:
                switch (p2) { //Escolha jogador 2
                    case 1:
                        JOptionPane.showMessageDialog(null,
                                "Pedra quebra a Tesoura!\n"
                                + "Jogador 2 ganhou!");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,
                                "Tesoura corta o Papel!\n"
                                + "Jogador 1 ganhou!");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,
                                "Tesoura com Tesoura empata!");
                        break;
                }
                break;
        }
    }
}
