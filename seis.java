import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o salário do funcionário: ");
                    double salarioImposto = scanner.nextDouble();
                    double imposto = calcularImposto(salarioImposto);
                    System.out.println("Valor do imposto: R$ " + imposto);
                    break;
                case 2:
                    System.out.print("Digite o salário do funcionário: ");
                    double salarioNovo = scanner.nextDouble();
                    double novoSalario = calcularNovoSalario(salarioNovo);
                    System.out.println("Novo salário: R$ " + novoSalario);
                    break;
                case 3:
                    System.out.print("Digite o salário do funcionário: ");
                    double salarioClassificacao = scanner.nextDouble();
                    String classificacao = classificarSalario(salarioClassificacao);
                    System.out.println("Classificação: " + classificacao);
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static double calcularImposto(double salario) {
        if (salario < 1400) {
            return salario * 0.05;
        } else if (salario <= 2500) {
            return salario * 0.10;
        } else {
            return salario * 0.15;
        }
    }

    public static double calcularNovoSalario(double salario) {
        if (salario > 5000) {
            return salario + 25;
        } else if (salario >= 2500) {
            return salario + 50;
        } else if (salario >= 1400) {
            return salario + 75;
        } else {
            return salario + 100;
        }
    }

    public static String classificarSalario(double salario) {
        if (salario <= 1400) {
            return "Mal remunerado";
        } else {
            return "Bem remunerado";
        }
    }
}
