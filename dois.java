import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int audienciaCanal4 = 0;
        int audienciaCanal5 = 0;
        int audienciaCanal7 = 0;
        int audienciaCanal12 = 0;

        int totalAudiencia = 0;

        while (true) {
            System.out.print("Digite o número do canal (ou 0 para encerrar): ");
            int numeroCanal = scanner.nextInt();

            if (numeroCanal == 0) {
                break;
            }

            System.out.print("Digite o número de pessoas assistindo: ");
            int numeroPessoas = scanner.nextInt();

            switch (numeroCanal) {
                case 4:
                    audienciaCanal4 += numeroPessoas;
                    break;
                case 5:
                    audienciaCanal5 += numeroPessoas;
                    break;
                case 7:
                    audienciaCanal7 += numeroPessoas;
                    break;
                case 12:
                    audienciaCanal12 += numeroPessoas;
                    break;
                default:
                    System.out.println("Canal inválido.");
            }

            totalAudiencia += numeroPessoas;
        }

        System.out.println("Porcentagem de audiência de cada canal:");
        if (totalAudiencia > 0) {
            System.out.printf("Canal 4: %.2f%%\n", ((double) audienciaCanal4 / totalAudiencia) * 100);
            System.out.printf("Canal 5: %.2f%%\n", ((double) audienciaCanal5 / totalAudiencia) * 100);
            System.out.printf("Canal 7: %.2f%%\n", ((double) audienciaCanal7 / totalAudiencia) * 100);
            System.out.printf("Canal 12: %.2f%%\n", ((double) audienciaCanal12 / totalAudiencia) * 100);
        } else {
            System.out.println("Nenhuma pessoa assistindo TV.");
        }

        scanner.close();
    }
}
