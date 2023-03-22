public class App {
    public static void main(String[] args) throws Exception {
        String cabeçalho = "Piramide de números";
        System.out.println(cabeçalho);
    }

    public static void piramideNum(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

