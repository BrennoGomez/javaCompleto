package bloco.inicializacao.test;

import bloco.inicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        System.out.print("Quantidade de parcelas: ");

        for (int parcela : cliente.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
