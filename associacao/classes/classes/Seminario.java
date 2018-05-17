package associacao.classes.classes;

public class Seminario {
    private String titulo;

    private Aluno[] alunos;

    private Professor professor;

    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print(){

        System.out.println("Relatório de seminário");

        System.out.println("Título: " + this.titulo);
        if (professor != null)
        System.out.println("Professor palestrante: " + this.professor.getNome());

        if (local != null) {
            System.out.println("Local: " + this.local.getRua() + "\nBairro: " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado para esse seminário");
        }

        if (alunos != null && alunos.length != 0) {
            System.out.println("Alunos participantes: ");
            for (Aluno aluno : alunos) {
                System.out.print("| " + aluno.getNome() + " | ");
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado.");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
