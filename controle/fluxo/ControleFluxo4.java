package controle.fluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        // o WHILE recebe um valor booleano, uma variável booleana ou comparação

        int contador = 0;

        while (contador < 10){
            System.out.println(contador);
            contador++;
        }

        // FOR inicia uma variável local (i) de incremento e executa o comando

        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i: " + i);
            if(i == 5) {
                break;
            }
        }

        // DO WHILE vai executar o comando pelo menos uma vez, mesmo ele sendo falso

        contador = 0;
        do {
            System.out.println("Dentro do DO WHILE: " + contador++);
        } while (contador < 10);
    }
}
