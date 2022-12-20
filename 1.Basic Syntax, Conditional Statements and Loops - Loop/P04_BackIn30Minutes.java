package Lekciq01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hours*60)+minutes+30;
        int hoursAfter = totalMinutes/60;
        int minutesAfter = totalMinutes%60;

        if(hoursAfter>23){
            hoursAfter=0;
        }
        System.out.printf("%d:%02d",hoursAfter,minutesAfter);
    }
}
