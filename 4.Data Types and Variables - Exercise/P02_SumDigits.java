package Uprajnenie02_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumDigit = 0;

        while (number>0){
         int lastNumber = number%10;


         sumDigit+=lastNumber;
         number = number/10;
        }
        System.out.println(sumDigit);
    }
}
