package polimorfismo.test;

import polimorfismo.classes.Funcionario;
import polimorfismo.classes.Gerente;
import polimorfismo.classes.RelatorioPagamento;
import polimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 10000, 2000);
        Vendedor vendedor = new Vendedor("Yuri", 3000, 15000);

        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();

/*
        relatorioPagamento.relatorioPagamentoGerente(gerente);
        relatorioPagamento.relatorioPagamentoVendedor(vendedor);
*/
        //Abaixo exemplo do polimorfismo:

        relatorioPagamento.relatorioPagamentoGenerico(gerente);
        relatorioPagamento.relatorioPagamentoGenerico(vendedor);

    }
}
