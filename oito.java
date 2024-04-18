import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o valor de N: ");
            int N = scanner.nextInt();

            if (N <= 0) {
                System.out.println("N deve ser um número inteiro positivo.");
            } else {
                double H = 0.0;

                for (int i = 1; i <= N; i++) {
                    H += 1.0 / i;
                }

                System.out.println("O número H é: " + H);
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }
}
