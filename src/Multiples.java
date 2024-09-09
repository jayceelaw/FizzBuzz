public class Multiples {
    public static void main(String[] args) {
        int n = 1000;
        // (multiples of 3) + (multiples of 5) - (multiples of 3 and 5) - (zero)
        System.out.println((n / 3) + (n / 5) - (n / 15) - 1);
    }
}
