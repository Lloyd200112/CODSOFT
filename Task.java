import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int score=0;
        boolean play;
        do{
            int numberGuess=random.nextInt(100)+1;
            int attempts=0;
            int Max=5;
            boolean guess=false;
            System.out.println("The Number Guessing Game!");
            System.out.println("You have"+ Max+"attempts to guess the numbers between 1 to 100.");
           
            while(attempts<Max && !guess){
                System.out.println("Enter your Guess: ");
                int user=sc.nextInt();
                attempts++;
                
                if(user==numberGuess){
                    System.out.println("Congratulations! You Guessed the correct Number");
                    guess=true;
                } else if (user < numberGuess) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }
            if (!guess) {
                System.out.println("You've used all your attempts. The correct number was: " + numberGuess);
            } System.out.println("Your current score is: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            play = sc.next().equalsIgnoreCase("yes");

        } while (play);
        System.out.println("Thank you for playing! Your final score is: " + score);
        sc.close();
    }
}
