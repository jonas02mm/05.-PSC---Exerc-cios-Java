import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Digite o número de cidades: ");
        n = scanner.nextInt();

        String cidadeMaiorIndice = "";
        String cidadeMenorIndice = "";
        double maiorIndice = Double.MIN_VALUE;
        double menorIndice = Double.MAX_VALUE;
        int totalVeiculos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da cidade: ");
            String cidade = scanner.next();
            System.out.print("Digite o número de veículos de passeio: ");
            int veiculos = scanner.nextInt();
            System.out.print("Digite o número de acidentes com vítimas: ");
            int acidentes = scanner.nextInt();

            double indice = (double) acidentes / veiculos;

            if (indice > maiorIndice) {
                maiorIndice = indice;
                cidadeMaiorIndice = cidade;
            }

            if (indice < menorIndice) {
                menorIndice = indice;
                cidadeMenorIndice = cidade;
            }

            totalVeiculos += veiculos;
        }

        System.out.println("Cidade com maior índice de acidentes: " + cidadeMaiorIndice);
        System.out.println("Maior índice de acidentes: " + maiorIndice);
        System.out.println("Cidade com menor índice de acidentes: " + cidadeMenorIndice);
        System.out.println("Menor índice de acidentes: " + menorIndice);
        System.out.println("Média de veículos nas cidades: " + (double) totalVeiculos / n);

        scanner.close();
    }
}
