package operadores;

public class Operadores {
    public static void main (String[] args) {
        int numeroInteiro = 20;
        long numeroLong = 2000000L;

        double numeroDouble = 10d;
        float numeroFloat = 20f;
        numeroFloat = (float) numeroDouble;

        int resto = 20%2;
        System.out.println("O resto é: " + resto);

        System.out.println(numeroDouble);
    }
}
