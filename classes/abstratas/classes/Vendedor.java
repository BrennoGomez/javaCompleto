package classes.abstratas.classes;

public class Vendedor extends Funcionario {

    private double totalVendas;

    /*
    Ocorre um erro na classe Vendedor quando transformamos a classe Funcionário em abstrata.
    Nisso, a sobrescrita do método abstrato é obrigatória, mesmo que não use a implementação da mesma.
     */

    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.05);

    }

    public void Vendedor(){

    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void imprime() {

    }
}
