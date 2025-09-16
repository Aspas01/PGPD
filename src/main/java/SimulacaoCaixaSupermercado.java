// tempo de atendimento aleatório (estocástico) para cada cliente.

import java.util.Random;

public class SimulacaoCaixaSupermercado {

    private int numeroCaixas; 
    private int numeroAtendimentos;
    private double mediaTempoAtendimentoPorCliente;
    private double desvioPadraoTempoAtendimentoPorCliente;

    private static final double TEMPO_MINIMO_ATENDIMENTO = 0.1;

    private final Random rng = new Random(42);

    public void setNumeroCaixas(int n) {
        this.numeroCaixas = n;
    }

    public void setNumeroAtendimentos(int n) {
        this.numeroAtendimentos = n;
    }

    public void setMediaTempoAtendimentoPorCliente(double mu) {
        this.mediaTempoAtendimentoPorCliente = mu;
    }

    public void setDesvioPadraoTempoAtendimentoPorCliente(double sigma) {
        this.desvioPadraoTempoAtendimentoPorCliente = sigma;
    }

    private double tempoAtendimentoNormalTruncado() {

        double z = rng.nextGaussian();

        double s = mediaTempoAtendimentoPorCliente + desvioPadraoTempoAtendimentoPorCliente * z;

        return Math.max(TEMPO_MINIMO_ATENDIMENTO, s);
    }

    public double simular() {
        double soma = 0.0;
        for (int i = 0; i < numeroAtendimentos; i++) {
            soma += tempoAtendimentoNormalTruncado();
        }
        return soma / numeroAtendimentos;
    }
}