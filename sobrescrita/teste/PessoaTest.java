package sobrescrita.teste;

import sobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(33);

        System.out.println(pessoa);
    }
}
