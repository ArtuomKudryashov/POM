package interview;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

    private static boolean isPrime(int number) {
        // Числа меньше 2 не являются простыми
        if (number < 2) {
            return false;
        }
        // Числа 2 и 3 являются простыми
        if (number == 2 || number == 3) {
            return true;
        }
        // Исключаем четные числа и числа, делящиеся на 3
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        // Проверяем делители в форме 6k ± 1
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}