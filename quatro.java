import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorIdades = 0;
        double somaIdades = 0;
        int contadorPessoas = 0;
        int contadorIdadePesoAltura = 0;
        int contadorPessoasAlta = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe a idade, o peso (em kg) e a altura (em metros) da pessoa " + i + ":");
            int idade = scanner.nextInt();
            double peso = scanner.nextDouble();
            double altura = scanner.nextDouble();

            somaIdades += idade;
            contadorIdades++;

            if (peso > 90 && altura < 1.50) {
                contadorPessoas++;
            }

            if (altura > 1.90) {
                contadorPessoasAlta++;
                if (idade >= 10 && idade <= 30) {
                    contadorIdadePesoAltura++;
                }
            }
        }

        double mediaIdades = somaIdades / contadorIdades;
        double porcentagemIdadePesoAltura = (double) contadorIdadePesoAltura / contadorPessoasAlta * 100;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + contadorPessoas);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + porcentagemIdadePesoAltura + "%");

        scanner.close();
    }
}
