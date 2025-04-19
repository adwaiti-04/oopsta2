public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0) return false;

        int[] primes = {2, 3, 5};
        for (int p : primes) {
            while (n % p == 0) {
                n /= p;
            }
        }

        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));   // true
        System.out.println(isUgly(1));   // true
        System.out.println(isUgly(14));  // false
    }
}
