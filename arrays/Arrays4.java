package arrays;

public class Arrays4 {
    public static void main(String[] args) {
        // ARRAYS BIDIMENCIONAIS - Tipo primitivo INT

        int[][] dias = new int [2][2];

        dias[0][0] = 30;
        dias[0][1] = 31;

        dias[1][0] = 28;
        dias[1][1] = 29;

        //Utilizando o FOR normal

        for (int i = 0; i < dias.length; i++) {
            System.out.println("Posição de memória dos arrays: " + dias[i]);
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Dias: " + dias[i][j]);
            }
        }

        System.out.println("-----------------------------------------------");

        //Utilizando o FOREACH

        for (int [] ref : dias) {
            for (int dia : ref) {
                System.out.println("Dias: " + dia);
            }
        }
    }
}
