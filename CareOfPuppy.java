package BASIC.Additional_Problems_MIX.ExamPrepMay21;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodKG = Integer.parseInt(scanner.nextLine());
        int foodGrams =foodKG*1000;

        String commmand= scanner.nextLine();

        while (!commmand.equals("Adopted")){
            int foodPer1Eat = Integer.parseInt(commmand);
            foodGrams-=foodPer1Eat;

            commmand= scanner.nextLine();
        }
        if (foodGrams>=0){
            System.out.printf("Food is enough! Leftovers: %d grams.",Math.abs(foodGrams));
        } else {
            System.out.printf("Food is not enough. You need %d grams more.",Math.abs(foodGrams));
        }

    }
}
