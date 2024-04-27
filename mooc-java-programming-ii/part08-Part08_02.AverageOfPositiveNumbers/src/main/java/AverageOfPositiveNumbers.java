
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersAmount = 0;
        int sum = 0;
        double avg = 0.0;

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            } else if (input > 0) {
                numbersAmount++;
                sum += input;
            }
        }

        if (sum <= 0) {
            System.out.println("Cannot calculate average");
        } else {
            avg = Double.valueOf(sum) / Double.valueOf(numbersAmount);
            System.out.println(avg);
        }

    }
}
