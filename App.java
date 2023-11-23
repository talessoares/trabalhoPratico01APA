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

    @Override
    public void run() {
        Scanner input = new Scanner(System.in);

        int numeroCriancas = input.nextInt();

        int[] pontos = new int[numeroCriancas];

        for (int i = 0; i < numeroCriancas; i++) {
            pontos[i] = input.nextInt();
        }

        input.close();

        long totalDoces = calcularTotalDoces(numeroCriancas, pontos);
        System.out.println(totalDoces);
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
