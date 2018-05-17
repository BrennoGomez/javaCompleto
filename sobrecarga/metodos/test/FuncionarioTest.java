package sobrecarga.metodos.test;

import sobrecarga.metodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario func = new Funcionario("Samuel", "20200255", 1200, "1294514");

        Funcionario funcionario = new Funcionario();

        funcionario.init("Breno", "20202018", 1000, "123444");
        funcionario.imprime();

        func.imprime();

    }
}
