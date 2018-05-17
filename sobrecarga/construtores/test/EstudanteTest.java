package sobrecarga.construtores.test;

import sobrecarga.construtores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("13232018", "João N", new double[] {4, 6, 10, 8});
        estudante.imprime();
    }
}
