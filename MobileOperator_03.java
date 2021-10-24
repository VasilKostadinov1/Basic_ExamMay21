package BASIC.Additional_Problems_MIX.ExamPrepMay21;

import java.util.Scanner;

public class MobileOperator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String period = scanner.nextLine();                  //  "one", или "two"
        String type = scanner.nextLine();                      // Small",  "Middle", "Large"или "ExtraLarge"
        String internetYesNo = scanner.nextLine();           // yes" или "no"
        int months = Integer.parseInt(scanner.nextLine());    // 1-24

        double monthlyFee = 0;

        switch (period) {
            case "one":
                if (type.equals("Small")) {
                    monthlyFee = 9.98;
                } else if (type.equals("Middle")) {
                    monthlyFee = 18.99;
                } else if (type.equals("Large")) {
                    monthlyFee = 25.98;
                } else if (type.equals("ExtraLarge")) {
                    monthlyFee = 35.99;
                }

                break;
            case "two":
                if (type.equals("Small")) {
                    monthlyFee = 8.58;
                } else if (type.equals("Middle")) {
                    monthlyFee = 17.09;
                } else if (type.equals("Large")) {
                    monthlyFee = 23.59;
                } else if (type.equals("ExtraLarge")) {
                    monthlyFee = 31.79;
                }
                break;
        }                                 //•	при добавен мобилен интернет, към таксата за един месец се добавя
        if (internetYesNo.equals("yes")){   //към таксата за един месец се добавя
            if (monthlyFee<=10){
                monthlyFee+=5.50;
            }else if (monthlyFee<=30){
                monthlyFee+=4.35;
            }else {
                monthlyFee+=3.85;
            }
        }
        double total = monthlyFee*months;  // !!! first add internet, then calculate total
        if (period.equals("two")){
            total=total - total*3.75/100;   //общата сума се намалява с 3.75%
        }
        System.out.printf("%.2f lv.",total);


    }
}
