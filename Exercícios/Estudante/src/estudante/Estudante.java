package estudante;

public class Estudante {

    private int ra;
    private String nome;
    private double nota1, nota2, nota3;

    public Estudante(int ra, String nome, double nota1, double nota2, double nota3) {
        this.ra = ra;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getMedia() {
        return (getNota1() + getNota2() + getNota3()) / 3;
    }

    public String isAprovado() {
        if (getMedia() > 7) {
            return "aprovado :)";
        } else {
            return "reprovado :/";
        }
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

}
