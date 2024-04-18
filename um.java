import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int somaIdades = 0;
        int contador = 0;

        do {
            System.out.print("Digite a idade (ou 0 para sair): ");
            idade = scanner.nextInt();

            if (idade != 0) {
                somaIdades += idade;
                contador++;
            } else {
                break;
            }
        } while (true);

        
        if (contador != 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades digitadas é: " + media);
        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }

        scanner.close();
    }
}
