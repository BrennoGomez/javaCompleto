package introducao.metodos.classes.introducao.metodos.test;

import introducao.metodos.classes.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setNome("Curry");
        estudante.setIdade(22);
        estudante.setNotas(new double[] {7, 8, 7});

        System.out.println("Aprovado? " + estudante.isAprovado());

        estudante.print();
        estudante.calcularMedia();
    }
}
