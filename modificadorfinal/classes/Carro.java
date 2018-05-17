package modificadorfinal.classes;

public class Carro {
    public static final double VELOCIDADE_FINAL;
    private String nome;
    private String marca;

    private final Comprador comprador = new Comprador();

    // Forma de inicializar uma variável estática. Outra forma é passar o valor junto com a variável.

    static {
        VELOCIDADE_FINAL = 240;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    //Modificador FINAL para não permitir a alteração do comportamento do método

    public final void imprime(){
        System.out.println("Carro vendido!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Comprador getComprador() {
        return comprador;
    }
}
