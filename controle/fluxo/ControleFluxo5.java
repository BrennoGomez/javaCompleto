package controle.fluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        //Dado um valor de um carro, descobrir em quantas vezes ele pode ser parcelado. Parcelas maiores que 1.000

        double valorTotal = 36000;

        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000) {
                System.out.println(parcela + " parcelas de " + valorParcela + "R$");
            } else {
                System.out.println("Obrigado pela cotação");
                break;
            }
        }
    }
}
