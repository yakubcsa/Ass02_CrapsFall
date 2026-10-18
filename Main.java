import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            IO.println("Die 1: " + die1);
            IO.println("Die 2: " + die2);
            IO.println("Craps Roll: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {

                IO.println("You lose!");
            }
            else if (crapsRoll == 7 || crapsRoll == 11) {

                IO.println("You win!");
            }
            else {
                int point = crapsRoll;

                IO.println("The point is " + point);

                while (true)
                {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;

                    IO.println("Die 1: " + die1);
                    IO.println("Die 2: " + die2);
                    IO.println("Craps Roll: " + crapsRoll);

                    if (crapsRoll == point) {

                        IO.println("Made point and won.");
                        break;

                    }
                    else if (crapsRoll == 7) {
                        IO.println("Got 7 and lost!");
                        break;
                    }
                    else {
                        IO.println("Trying for point!");
                    }

                }

            }
            IO.println("Do you want to play again? [Y/N]: ");
            String answer = input.nextLine();

            if(answer.equalsIgnoreCase("n")) {
                playAgain = false;
            }
        }

        IO.println("Thanks for playing!");
        input.close();

    }
}