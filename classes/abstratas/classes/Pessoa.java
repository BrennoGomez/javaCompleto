package classes.abstratas.classes;

public abstract class Pessoa {
    protected String nome;

    /*
    Quando criamos o método abstrato, este terá de ser chamado na primeira classe concreta que tiver.
    Caso alguma classe extenda essa e seja abstrata, não ocorrerá erro.
     */

    public abstract void imprime();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
