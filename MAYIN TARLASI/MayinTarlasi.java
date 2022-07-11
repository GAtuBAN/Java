package Others;

import java.util.Scanner;

public class MayinTarlasi {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Satir sayisi : ");
	        int a = sc.nextInt();
	        System.out.print("Sutun sayisi : ");
	        int b = sc.nextInt();
	        String[][] alan = MineSweeper.oyunAlani(a, b);
	        String[][] bosAlan = MineSweeper.bosAlan(a, b);
	        MineSweeper.print(bosAlan);
	        MineSweeper.check(alan, bosAlan, a, b);
	    }

}
