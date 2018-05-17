package heranca.classes;

public class Funcionario extends Pessoa{
    private double salario;

    //Construtor de Funcionario seguindo ordem de criação de pessoa ('Nome' como o argumento)

    public Funcionario(String nome) {
        super(nome);
        this.salario = salario;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu, " + super.nome + ", recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
