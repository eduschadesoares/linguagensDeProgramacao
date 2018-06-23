
package gamejokenpo;

import javax.swing.JOptionPane;

public class Principal {

    static int p1 = 0;
    static int p2 = 0;
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Escolha: 0 = Pedra, 1 = Papel ou 2 = Tesoura");

        insereVal();
    }
    
    public static void jog1() {
        p1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, é a sua vez!"));
    }
    
    public static void jog2() {
        p2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2, é a sua vez!"));
    }

    public static void insereVal() {

        int v;

        try {

            p1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, é a sua vez!"));

            while (p1 < 0 || p1 > 2) {

                JOptionPane.showMessageDialog(null, "Comando incorreto.");
                jog1();

            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Comando incorreto.");
            System.err.println(e);
           // insereVal();
        }
            p2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2, é a sua vez!"));

            while (p2 < 0 || p2 > 2) {

                JOptionPane.showMessageDialog(null, "Comando incorreto.");
                jog2();

            }


        switch (p1) {

            case 0:
                switch (p2) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Pedra com Pedra empata!");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Papel embrulha a Pedra, jogador 2 ganhou!");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Pedra quebra a Tesoura, jogador 1 ganhou!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Comando incorreto.");
                }
                break;

            case 1:
                switch (p2) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Papel embrulha a Pedra, jogador 1 ganhou!");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Papel com Papel empata!");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Tesoura corta o Papel, jogador 2 ganhou!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Comando incorreto.");
                }
                break;

            case 2:
                switch (p2) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Pedra quebra a Tesoura, jogador 2 ganhou!");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Tesoura corta o Papel, jogador 1 ganhou!");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Tesoura com Tesoura empata!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Comando incorreto.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Comando incorreto.");
        }
        v = Integer.parseInt(JOptionPane.showInputDialog("Querem jogar de novo? Se sim, digite 1, se não, digite outro valor."));
        if (v == 1) {
            insereVal();
        } else {
            JOptionPane.showMessageDialog(null, "Jogo encerrado.");
        }
    }

}
