package controle.fluxo;

public class ExercicioControleDeFluxo2 {
    /*
    Criação de um switch que dado um valor de 1 a 7, considerando 1 = domingo, imprima se é dia útil ou final de semana
     */

    public static void main(String[] args) {
        byte dia = 1;

        switch (dia){
            case 1: case 7:
                System.out.println("Fim de semana");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}
