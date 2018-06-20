package prova;

public class Passaros {

    String especie;
    String nome;
    int arvore;
    String cor;

    public Passaros(String especie, String nome, int arvore, String cor) {
        this.especie = especie;
        this.nome = nome;
        this.arvore = arvore;
        this.cor = cor;
    }

    public Passaros() {

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getArvore() {
        return arvore;
    }

    public void setArvore(int arvore) {
        this.arvore = arvore;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
