import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /* 彩票中奖案例，生成一个7位的随机数表示彩票号码
           键盘录入一个7位数表示用户购买的彩票
           判断用户输入的彩票号码是否和系统生成的彩票号码一致
        */

        // 1. Generate a 7-digit random number for the lottery ticket
        Random random = new Random();
        // NextInt(9000000) generates 0 to 8,999,999. Adding 1,000,000 shifts it to 1,000,000 to 9,999,999.
        int lotteryNumber = random.nextInt(9000000) + 1000000;
        
        System.out.println("System generated lottery number (for testing): " + lotteryNumber);

        // 2. Input a 7-digit number from the keyboard representing the user's purchased lottery ticket
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your 7-digit lottery number: ");
        
        // Ensure input is an integer
        if (scanner.hasNextInt()) {
            int userNumber = scanner.nextInt();
            
            // Optional: Validate if it's a 7-digit number
            if (userNumber >= 1000000 && userNumber <= 9999999) {
                // 3. Determine if the user's input matches the system-generated lottery number
                if (userNumber == lotteryNumber) {
                    System.out.println("Congratulations! You won the lottery!");
                } else {
                    System.out.println("Sorry, you didn't win. Better luck next time!");
                    System.out.println("The winning number was: " + lotteryNumber);
                }
            } else {
                System.out.println("Invalid input. Please enter a valid 7-digit number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
        
        scanner.close();
    }
}