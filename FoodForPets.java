package BASIC.Additional_Problems_MIX.ExamPrepMay21;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {           // 66/100
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        double biscuits = 0;
        double dog=0;
        double cat=0;
        double sum=0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            counter++;
            sum+= dogFood + catFood;
            dog+=dogFood;
            cat+=catFood;
            if (counter % 3 == 0) {
                biscuits += (dogFood+catFood) * 0.10;    // += for 100/100
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n",biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n",(dog+cat)*100/totalFood);
        System.out.printf("%.2f%% eaten from the dog.%n",dog*100/(dog+cat));
        System.out.printf("%.2f%% eaten from the cat.%n",cat*100/(dog+cat));

    }
}
