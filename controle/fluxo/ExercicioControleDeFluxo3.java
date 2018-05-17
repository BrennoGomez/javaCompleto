package controle.fluxo;

public class ExercicioControleDeFluxo3 {
    public static void main(String[] args) {
        // Imprimindo todos os números pares de 0 até 100000

        int valor = 100000;

        for(int i = 0; i <= valor; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
