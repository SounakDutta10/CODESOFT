import java.util.Scanner;

public class NumberGame extends Thread {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int num=0, attempts = 0, score = 0, maxAttempts = 5;
        boolean play = true;
        System.out.println("Welcome to Number Game !!");
        System.out.print("Enter your Name: ");
        name = in.nextLine();

        while (play) {
            int range = 100;
            int fnum = (int) (Math.random() * range) + 1;
            System.out.println("Guess a number in range 1-100.");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (attempts = 1; attempts <= maxAttempts; attempts++) {
                System.out.print("Enter the Guessed Number: ");
                num = in.nextInt();

                if (num == fnum) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts");
                    score += 5;
                    break;
                } else if (num > fnum) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Too low. Try again.");
                }
            }
            if(attempts>5 && num != fnum)
            {
                System.out.println("Out of attempts! The number was: "+fnum);
            }
            in.nextLine();

            System.out.print("Do you want to play again? (yes/no): ");
            String ans = in.nextLine();
            if (!ans.equalsIgnoreCase("yes")) {
                play = false;
                System.out.println("Thank you for playing! Your total score is: " + score);
            }
        }

        in.close(); 
    }
}