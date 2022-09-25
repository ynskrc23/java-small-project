import java.util.Scanner;

public class interaktifSayiBulma {

    public static void main(String[] args) {
        int sayi1, sayi2,birlerBasamagi, yuzlerBasamagi, islem;
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen sadece 3 basamaklı sayı giriniz");

        System.out.println("birinci sayi giriniz:");
        sayi1 = input.nextInt();
        System.out.println("ikinci sayi giriniz:");
        sayi2 = input.nextInt();

        birlerBasamagi = sayi1 % 10;
        yuzlerBasamagi = sayi2 / 100;
        islem = birlerBasamagi * yuzlerBasamagi;

        System.out.println("işlemin sonucu: "+islem);
    }
}
