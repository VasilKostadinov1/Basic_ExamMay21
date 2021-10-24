package BASIC.Additional_Problems_MIX.ExamPrepMay21;

import java.util.Scanner;

public class PCGameShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countHearthstone = 0;
        int countFornite = 0;
        int countOverwatch = 0;
        int countOthers = 0;


        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();     //За следващите n реда се чете по един ред
            if (name.equals("Hearthstone")){
                countHearthstone++;
            }else if (name.equals("Fornite")){
                countFornite++;
            }else if (name.equals("Overwatch")){
                countOverwatch++;
            }else {
                countOthers++;
            }
        }
        double percentHeartsone= (double)countHearthstone*100/n;
        double percentFornite= (double)countFornite*100/n;
        double percentOverwatch= (double)countOverwatch*100/n;
        double percentOthers= (double)countOthers*100/n;

        System.out.printf("Hearthstone - %.2f%%%n", percentHeartsone);
        System.out.printf("Fornite - %.2f%%%n", percentFornite);
        System.out.printf("Overwatch - %.2f%%%n", percentOverwatch);
        System.out.printf("Others - %.2f%%%n", percentOthers);
    }
}
