import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSim = 0;
        int totalNao = 0;
        int mulheresSim = 0;
        int homensTotal = 0;
        int homensNao = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entrevistado " + i);
            System.out.print("Informe o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            System.out.print("Informe a resposta (S/N): ");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'S') {
                totalSim++;
                if (sexo == 'F') {
                    mulheresSim++;
                }
            } else if (resposta == 'N') {
                totalNao++;
                if (sexo == 'M') {
                    homensNao++;
                }
            }

            if (sexo == 'M' || sexo == 'm') {
                homensTotal++;
            }
        }

        double percentualHomensNao = 0.0;
        if (homensTotal != 0) {
            percentualHomensNao = (double) homensNao / homensTotal * 100;
        }

        System.out.println("Número de pessoas que responderam sim: " + totalSim);
        System.out.println("Número de pessoas que responderam não: " + totalNao);
        System.out.println("Número de mulheres que responderam sim: " + mulheresSim);
        System.out.println("Porcentagem de homens que responderam não: " + percentualHomensNao + "%");

        scanner.close();
    }
}
