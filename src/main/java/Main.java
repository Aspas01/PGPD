import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        final int NUMERO_SIMULACOES = 1000;
        final int NUMERO_CLIENTES = 100;
        final double MEDIA_TEMPO = 5.00;
        final double DESVIO_PADRAO_TEMPO = 0.50;

        List<Double> mediasAtendimento = new ArrayList<>();
        SimulacaoCaixaSupermercado simulador = new SimulacaoCaixaSupermercado();

        for (int i = 0; i < NUMERO_SIMULACOES; i++) {
            simulador.setNumeroCaixas(1);
            simulador.setNumeroAtendimentos(NUMERO_CLIENTES);
            simulador.setMediaTempoAtendimentoPorCliente(MEDIA_TEMPO);
            simulador.setDesvioPadraoTempoAtendimentoPorCliente(DESVIO_PADRAO_TEMPO);

            double mediaAtendimento = simulador.simular();
            mediasAtendimento.add(mediaAtendimento);
        }

        double mediaDasMedias = media(mediasAtendimento);
        double desvioPadraoDasMedias = desvioPadrao(mediasAtendimento, mediaDasMedias);

        System.out.printf("Média dos tempos de atendimento (%d simulações): %.3f min%n",
                NUMERO_SIMULACOES, mediaDasMedias);
        System.out.printf("Desvio-padrão das médias: %.3f min%n", desvioPadraoDasMedias);
    }

    private static double media(List<Double> xs) {
        double soma = 0.0;
        for (double x : xs) {
            soma += x;
        }
        return soma / xs.size();
    }

    private static double desvioPadrao(List<Double> xs, double m) {
        double somaQuadrados = 0.0;
        for (double x : xs) {
            double d = x - m;
            somaQuadrados += d * d;
        }
        return Math.sqrt(somaQuadrados / (xs.size() - 1));
    }
}