import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu de opções:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularMediaAritmetica(scanner);
                    break;
                case 2:
                    calcularMediaPonderada(scanner);
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    public static void calcularMediaAritmetica(Scanner scanner) {
        System.out.println("Digite as duas notas:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média aritmética é: " + media);
    }

    public static void calcularMediaPonderada(Scanner scanner) {
        System.out.println("Digite as três notas e seus respectivos pesos:");
        double nota1 = scanner.nextDouble();
        double peso1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double peso2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double peso3 = scanner.nextDouble();
        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.println("A média ponderada é: " + media);
    }
}
