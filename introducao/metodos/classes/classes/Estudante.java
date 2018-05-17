package introducao.metodos.classes.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    // Uso do THIS referencia o parâmetro da própria classe.

    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Notas: ");
        for(double nota : notas) {
            System.out.print(nota + " ");
        }
    }

    public void calcularMedia() {

        if(notas == null){
            System.out.println("Aluno não possui notas.");
            return;
        }

        double media = 0;
        for(double nota : notas) {
            media += nota;
        }
        media = media / notas.length;
        if(media >= 7) {
            this.aprovado = true;
            System.out.println("\nA média é: " + media + ".\nSituação: Aprovado por nota.");
        } else {
            this.aprovado = false;
            System.out.println("\nA média é: " + media + ".\nSituação: Reprovado por nota.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }
}
