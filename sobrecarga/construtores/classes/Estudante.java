package sobrecarga.construtores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;

    //Construtor vazio (default)

    public Estudante(){

    }

    //Contrutor da classe, responsável por criar o objeto.

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);

        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print("| " + nota + " |");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
