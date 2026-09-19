package Prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter a score from 0 to 100: ");

            int score = input.nextInt();

            if (score < 0 || score > 100) {
                throw new UnsupportedOperationException();
            }

            System.out.println("Score: " + score);

        } catch (InputMismatchException e) {

            System.out.println("Invalid input. Please enter an integer.");

        } catch (UnsupportedOperationException e) {

            System.out.println("Score must be between 0 and 100.");

        }

        input.close();
    }
}
