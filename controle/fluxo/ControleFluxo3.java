package controle.fluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;

        /*
        São permitidos no switch: char, int, byte, short, enum e string
         */
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

        char sexo = 'F';

        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
