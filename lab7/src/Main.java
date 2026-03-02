import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] A = new int[20];
        int sum = 0;

        System.out.println("Массив:");

        for (int i = 0; i < 20; i++) {
            A[i] = random.nextInt(101) - 50; // числа от -50 до 50
            System.out.print(A[i] + " ");

            if (A[i] < 0) {
                sum += A[i];
            }
        }

        System.out.println("\nСумма отрицательных элементов: " + sum);
    }
}