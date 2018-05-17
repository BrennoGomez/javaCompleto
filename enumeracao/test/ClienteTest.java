package enumeracao.test;

import enumeracao.classes.Cliente;
import enumeracao.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana",  TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.A_VISTA);
        System.out.println(cliente);
    }
}
