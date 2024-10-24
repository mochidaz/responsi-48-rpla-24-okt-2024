public class ReviewUlangMethod {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int hasil = f(a, b);

        System.out.println(hasil);
    }

    // f(x, y) = 2x + 4y - 1
    private static int f(int x, int y) {
        int firstStep = 2 * x;
        int secondStep = 4 * y;
        int hasil = firstStep + secondStep - 1;

        return hasil;
    }
}
