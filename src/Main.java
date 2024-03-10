//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sayi, kdvTutar, toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatı giriniz : " );
        sayi = input.nextDouble();

        double kdvdegiskenoran = (sayi >= 0 && sayi <= 1000) ? 0.18 : 0.08;

        kdvTutar = sayi * kdvdegiskenoran;
        toplam = sayi + kdvTutar;

        System.out.println("Kdv'siz tutar:" + sayi);
        System.out.println("Kdv oranı:" + kdvdegiskenoran);
        System.out.println("Kdv'li tutar:" + toplam);
        System.out.print("KDV tutarı:" + kdvTutar);
    }
}