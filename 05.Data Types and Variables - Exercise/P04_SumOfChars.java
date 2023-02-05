package Uprajnenie02_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int count = 1; count <=n ; count++) {
            char symbol = scanner.nextLine().charAt(0);
            int ascii = (int) symbol;
            sum+=ascii;
            
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
