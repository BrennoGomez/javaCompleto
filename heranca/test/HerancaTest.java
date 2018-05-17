package heranca.test;

import heranca.classes.Endereco;
import heranca.classes.Pessoa;
import heranca.classes.Funcionario;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Regina");
        pessoa.setCpf("12345");

        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Américas");
        endereco.setBairro("Centro");

        Funcionario funcionario = new Funcionario("Weigl");
        funcionario.setCpf("54321");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);


        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("---------------------------");
        funcionario.imprime();

    }
}
