import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Serisi: " + a + " " + b);
        
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
