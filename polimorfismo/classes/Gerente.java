package polimorfismo.classes;

public class Gerente extends Funcionario {
    private double participacaoNosLucros;

    public Gerente(String nome, double salario, double participacaoNosLucros) {
        super(nome, salario);
        this.participacaoNosLucros = participacaoNosLucros;
    }

    public double getParticipacaoNosLucros() {
        return participacaoNosLucros;
    }

    public void setParticipacaoNosLucros(double participacaoNosLucros) {
        this.participacaoNosLucros = participacaoNosLucros;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + participacaoNosLucros;
    }
}
