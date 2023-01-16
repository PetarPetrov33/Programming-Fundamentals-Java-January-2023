package Uprajnenie01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P02_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (number%10==0){
            sum = 10;System.out.printf("The number is divisible by %d",sum);
        } else if(number%7==0){
            sum = 7;System.out.printf("The number is divisible by %d",sum);
        } else if(number%6==0){
            sum = 6;System.out.printf("The number is divisible by %d",sum);
        } else if(number%3==0){
            sum=3;System.out.printf("The number is divisible by %d",sum);
        } else if(number%2==0){
            sum=2;System.out.printf("The number is divisible by %d",sum);
        } else {
            System.out.println("Not divisible");
        }
    }
}

