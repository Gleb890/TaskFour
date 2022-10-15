import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y = scanner.nextDouble();

        double sm = Math.sqrt(99);

        for(int num = 96; num >= 3; num -= 3) {
            sm = Math.sqrt(num + sm);
        }

        System.out.println(sm);
    }
}