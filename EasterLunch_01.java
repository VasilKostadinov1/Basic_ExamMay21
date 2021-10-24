package BASIC.Additional_Problems_MIX.ExamPrepMay21;

import java.util.Scanner;

public class EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kozunak = Integer.parseInt(scanner.nextLine());
        int dozenEggs = Integer.parseInt(scanner.nextLine());  //•	Яйца –  4.35 лв. за кора с 12 яйца
        int kurabii = Integer.parseInt(scanner.nextLine());     //  •	Курабии – 5.40 лв. за килограм

        double priceKozunak =kozunak*3.20;
        double priceEggs =dozenEggs*4.35;
        double priceKurabii = kurabii*5.40;
        double pricePaintEggs = dozenEggs*12*0.15;
        double total = priceKozunak+priceEggs+priceKurabii+pricePaintEggs;

        System.out.printf("%.2f",total);
    }
}
