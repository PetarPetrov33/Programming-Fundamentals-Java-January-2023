package Lekciq02_DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class P04_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        BigDecimal population = new BigDecimal(scanner.nextLine());
        BigDecimal area = new BigDecimal(scanner.nextLine());

        System.out.printf("Town %s has population of %.0f and area %.0f square km.",city,population,area);

    }
}
