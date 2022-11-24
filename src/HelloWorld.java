import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile razy program ma przywitać użytkownika?");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Liczba nie może być mniejsza od zera.");
                scanner.close();
            } else {
                for (int i = 0; i < number; i++) {
                    System.out.println("Hello World!!!");
                }
                scanner.close();
            }
        } else {
            System.out.println("Podałeś błędną wartość.");
            scanner.close();
        }
    }
}
