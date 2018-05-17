package controle.fluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {

        int idade = 23;
/*

        String status;
        if(idade > 18) {
            status = "adulto";
        } else {
            status = "Não adulto";
        }
*/

        // usando operador ternário

        String status;
        status = idade > 18 ? "adulto" : "Não adulto" ;

        System.out.println(status);
    }
}
