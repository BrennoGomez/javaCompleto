package polimorfismo.classes;

public class RelatorioPagamento {
/*
    public void relatorioPagamentoGerente (Gerente gerente) {
        System.out.println("Gerando relatório de pagamento para gerência");

        gerente.calcularPagamento();
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário deste mês: " + gerente.getSalario());
    }

    public void relatorioPagamentoVendedor (Vendedor vendedor) {
        System.out.println("Gerando relatório de pagamento para vendedor");

        vendedor.calcularPagamento();
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salário deste mês: " + vendedor.getSalario());
    }
*/

    //Código usando polimorfismo. Enxugando a classe de relatório!

    public void relatorioPagamentoGenerico (Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento:");

        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário deste mês: " + funcionario.getSalario());

        // Através de um CAST podemos pegar atributos únicos das subclasses

        /*
         Usamos o INSTANCEOF para dizer a classe a qual pertence a instância. Caso contrário, quebraria o código de
         execução com classCastException devido a não ter essa instância na classe Vendedor.
          */

        if (funcionario instanceof Gerente){
            Gerente gerente = (Gerente) funcionario;
            System.out.println("Participação nos lucros: " + gerente.getParticipacaoNosLucros());
        }

        /*
        Exemplo de CAST direto, sem criar variável de referência. Executa uma única vez, caso queiramos usar outra
        variável, não podemos acessa-la como no código acima.
         */

        if (funcionario instanceof Vendedor){
            System.out.println("Total de vendas: " + ((Vendedor) funcionario).getTotalVendas());
        }
    }
}
