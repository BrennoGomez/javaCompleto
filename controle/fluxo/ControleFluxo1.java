package controle.fluxo;

import java.sql.SQLOutput;

public class ControleFluxo1 {
    public static void main(String[] args) {
        int idade = 18;
        float salario = 1000f;

        if(idade >= 18) {
            System.out.println("Entra no clube, pois idade é: " + idade);
        } else {
            System.out.println("Não entra no clube, porque a idade é: " + idade);
        }

        // idade <= 15 : infantil
        // idade > 15 && < 18 : juvenil
        // idade >= 18 : adulto

        String categoria;
        if(idade <= 15){
            categoria = "infantil";
        } else if (idade > 15 && idade < 18){
            categoria = "juvenil";
        } else {
            categoria = "adulto";
        }
        System.out.println("Categoria é: " + categoria);
    }

}
