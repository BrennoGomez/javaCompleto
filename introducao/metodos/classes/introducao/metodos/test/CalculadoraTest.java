package introducao.metodos.classes.introducao.metodos.test;

import introducao.metodos.classes.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros(3,2);
        calculadora.subtraiDoisNumeros(3,1);
        calculadora.multiplicaDoisNumeros(3,4);
        calculadora.divideDoisNumeros(10,0);

        /*
        Uma diferença entre o ARRAY e o VARARGS é que no varArgs você pode fazer a soma tanto de um objeto array quanto
        objeto setados por vírgulas, diferente do array que recebe só um array.

        *OBS* O varArgs só pode ter um varArgs por assinatura de método.
        * Caso tenho outro parâmetro no método, o varArgs terá de ser o último.
         */

        int[] numeros = {1, 2, 3, 4, 5, 6};

        System.out.println("Soma dos números: ");
        calculadora.somaVarArgs( 1, 2, 3, 4, 5, 6);

    }
}
