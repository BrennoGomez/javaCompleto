package br.com.brennogomez.introducao.classes.test;

import br.com.brennogomez.introducao.classes.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.placa = "KGB-2018";
        carro.modelo = "Ford Ká +";
        carro.velocidadeMaxima = 210f;

        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima);
    }
}
