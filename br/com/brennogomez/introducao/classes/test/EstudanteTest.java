package br.com.brennogomez.introducao.classes.test;

import br.com.brennogomez.introducao.classes.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "João";
        estudante.idade = 12;
        estudante.matricula = "10052018";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.matricula);
    }
}
