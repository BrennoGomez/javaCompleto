package modificador.estatico.test;

import modificador.estatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Audi", 285);
        Carro carro3 = new Carro("Ferrari", 310);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
