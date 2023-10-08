package BasicQuestions;

public class primeNumber {
    public static void main(String[] args) {
        int a = 5;

        boolean ans = isPrimeNum(a);

        System.out.println(ans);
    }

    public static boolean isPrimeNum(int a) {
        boolean isPrime = true;

        for (int i = 2; i <= a; i++) {

            if (a % 2 == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }
}
