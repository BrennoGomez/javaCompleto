package modificadorfinal.teste;

import modificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.getComprador().setNome("Casão");

        System.out.println("Comprador do carro: " + carro.getComprador());

        carro.imprime();
    }
}
