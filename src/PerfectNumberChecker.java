public class PerfectNumberChecker {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));  // false
    }

    public static boolean isPerfectNumber(int number) {
        // Parametre 0'dan küçükse false döndür
        if (number < 0) {
            return false;
        }

        // Bölenlerin toplamını hesapla
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Mükemmel sayı kontrolü
        return sum == number;
    }
}
