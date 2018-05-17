package bloco.inicializacao.classes;

public class Cliente {
    private int[] parcelas;

    // Bloco de Inicialização *OBS* Ele é excetutado antes do construtor

    {
        parcelas = new int[12];

        for (int i = 1; i <= 12; i++) {
            parcelas[i - 1] = i;
        }
    }

    // Construtor Default

    public Cliente(){
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
