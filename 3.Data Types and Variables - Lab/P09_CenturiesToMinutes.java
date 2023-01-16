package Lekciq02_DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P09_CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double century = Double.parseDouble(scanner.nextLine());;

        double years = century*100;
        double days = years*365.2422;
        double hours = days*24;
        BigDecimal minutes = new BigDecimal(hours*60);

        System.out.printf("%.0f centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",century,years,days,hours,minutes);

    }
}
