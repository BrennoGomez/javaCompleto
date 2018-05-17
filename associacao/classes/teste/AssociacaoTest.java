package associacao.classes.teste;

import associacao.classes.classes.Aluno;
import associacao.classes.classes.Local;
import associacao.classes.classes.Professor;
import associacao.classes.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Breno", 23);
        Aluno aluno2 = new Aluno("João", 23);
        Aluno aluno3 = new Aluno("Carlos", 43);

        Seminario seminario = new Seminario("Seminário Java");

        Professor professor = new Professor("Adriano", "Algorítmos");

        Local local = new Local("Rua A", "Centro");

        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        aluno3.setSeminario(seminario);

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno1, aluno2, aluno3});

        Seminario[] seminarioArray = new Seminario[1];
        seminarioArray[0] = seminario;
        professor.setSeminarios(seminarioArray);

        seminario.print();
        professor.print();

    }
}
