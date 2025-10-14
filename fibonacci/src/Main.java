import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite = scanner.nextInt();

        int f1 = 0;
        int f2 = 1;


        while (f2 < limite) {
            int fn = f1 + f2;
            if (fn > limite) {
                break;
            }

            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }


    }
}