package Lekciq01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1= Integer.parseInt(scanner.nextLine());
        int n2=Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (n2>10){
            sum = n1*n2;
            System.out.printf("%d X %d = %d",n1,n2,sum);
        }
        while (n2<=10){
            sum = n1*n2;

            System.out.printf("%d X %d = %d%n",n1,n2,sum);


            n2++;
        }
    }

}


