package arrays;

public class Arrays3 {
    public static void main(String[] args) {

        // Formas de inicializar um ARRAY

        int [] forma1 = new int [5];
        int [] forma2 = {0, 1, 2, 3, 4};
        int [] forma3 = new int[] {1, 2, 3, 4, 5};

        // Iteração de valores ** forma2 ** FOR
/*
        for (int i = 0; i < forma2.length; i++) {
            System.out.println(forma2[i]);
        }*/

        // Nova iteração de valores ** forma2 ** FOREACH

        for (int num : forma2){
            System.out.println("Número: " + num);
        }
    }
}
