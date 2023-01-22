package Uprajnenie02_DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        //курсове = хората / капацитета -> дробно число -> нагоре -> отпечатвам
        double courses = Math.ceil(countPeople * 1.0 / capacity);
        System.out.printf("%.0f", courses);
    }
}
