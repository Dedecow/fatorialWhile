public class App {
    public static void main(String[] args) throws Exception {
        int n = 4;
        int fatorial = 1;
        int i = 1;

        while (i <= n) {
            fatorial*= i;
            i++;
        }
        System.out.println("O fatorial de " + n + " é " + fatorial);
    }
}
