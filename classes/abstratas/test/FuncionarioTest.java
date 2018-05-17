package classes.abstratas.test;

import classes.abstratas.classes.Funcionario;
import classes.abstratas.classes.Gerente;
import classes.abstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carla", "22420-2", 2000);
        Vendedor vendedor = new Vendedor("João", "12333-6", 1500, 3000);

        gerente.calculaSalario();
        vendedor.calculaSalario();

        System.out.println(gerente);
        System.out.println(vendedor);

    }
}
