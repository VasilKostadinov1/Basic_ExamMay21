package BASIC.Additional_Problems_MIX.ExamPrepMay21;

import java.util.Scanner;

public class SuitcaseLoad_05 {
    public static void main(String[] args) {            // Solved completely myself
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int counter = 0;

        while (!command.equals("End")) {
            double volumeSuitcase = Double.parseDouble(command);
            counter++;
            if (counter % 3 == 0) {
                volumeSuitcase *= 1.10;     // Обемът на всеки трети куфар трябва да се увеличава с 10%,
            }
            capacity -= volumeSuitcase;
            if (capacity < 0) {                          //Ако свободното пространството в даден момент е по-малко от обема на куфар
                System.out.println("No more space!");    //товаренето трябва да прекъсне.  // break!
                System.out.printf("Statistic: %d suitcases loaded.", counter-1);
                break;
            }
            command = scanner.nextLine();
        }
        if (capacity >= 0) {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", counter);
        }



    }
}
