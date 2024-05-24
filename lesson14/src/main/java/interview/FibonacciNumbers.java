package interview;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 100; // Количество чисел Фибоначчи, которые нужно вывести
        printFibonacciNumbers(n);
    }

    private static void printFibonacciNumbers(int n) {
        int a = 0, b = 1;

        System.out.println("Числа Фибоначчи:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}


