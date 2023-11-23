package trabalhoPratico01APA;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App {

    public static void main(String[] args) {

        Distribuicao distribuicao = new Distribuicao();
        distribuicao.run();

    }
}

class Distribuicao implements Runnable {

    private static final Logger logger = Logger.getLogger(Distribuicao.class.getName());

    @Override
    public void run() {
        Scanner input = new Scanner(System.in);

        logger.log(Level.INFO, "Digite o número de crianças:");
        int numeroCriancas = input.nextInt();

        logger.log(Level.INFO, "Digite a pontuação de cada criança:");
        int[] pontos = new int[numeroCriancas];

        for (int i = 0; i < numeroCriancas; i++) {
            pontos[i] = input.nextInt();
        }

        input.close();

        long tempoInicio = System.nanoTime();

        long totalDoces = calcularTotalDoces(numeroCriancas, pontos);
        logger.log(Level.INFO, "O número mínimo de doces que a professora Alice deve comprar é: {0}", totalDoces);
        long tempoFim = System.nanoTime();

        long duracao = (tempoFim - tempoInicio);
        logger.log(Level.WARNING, "Tempo de execução: {0} nanosegundos", duracao);

    }

    private long calcularTotalDoces(int numeroCriancas, int[] pontos) {
        long[] listaDoces = distribuirDoces(numeroCriancas, pontos);
        long totalDoces = listaDoces[numeroCriancas - 1];

        for (int i = numeroCriancas - 2; i >= 0; i--) {
            if (listaDoces[i] <= listaDoces[i + 1] && pontos[i] > pontos[i + 1]) {
                listaDoces[i] = listaDoces[i + 1] + 1;
            }

            totalDoces += listaDoces[i];
        }

        return totalDoces;
    }

    private long[] distribuirDoces(int numeroCriancas, int[] pontos) {
        long[] listaDoces = new long[numeroCriancas];
        listaDoces[0] = 1;

        for (int i = 1; i < numeroCriancas; i++) {
            if (pontos[i] > pontos[i - 1]) {
                listaDoces[i] = listaDoces[i - 1] + 1;
            } else {
                listaDoces[i] = 1;
            }
        }

        return listaDoces;
    }
}
