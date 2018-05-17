package introducao.metodos.classes.classes;

public class Calculadora {
    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void subtraiDoisNumeros(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public void divideDoisNumeros(double num1, double num2) {

        if (num2 != 0){
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possível dividir números por 0.");

    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
