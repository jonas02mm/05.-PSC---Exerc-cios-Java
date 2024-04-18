public class Main {
    public static void main(String[] args) {
        double S = 0.0;

        for (int i = 1, j = 1000; i <= 50; i++, j -= 3) {
            if (i % 2 == 0) {
                S -= j / (double)i;
            } else {
                S += j / (double)i;
            }
        }

        System.out.println("A soma dos 50 primeiros termos da série é: " + S);
    }
}
