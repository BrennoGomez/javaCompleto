package operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {

        // =, -=, +=, *=, /=, $=

        int salario = 1000;
        //salario += 1000;

        // uso do CAST para que a transformação não venha double

        salario = salario + (int) (salario * 0.1);

        System.out.println(salario);
    }

}
