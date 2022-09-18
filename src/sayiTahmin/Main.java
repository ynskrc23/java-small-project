package sayiTahmin;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int tahmin, can=5;

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int sayi = rnd.nextInt(50);
        boolean oyunDurumu = false;

        System.out.println("0-50 arasında tahmin yapınız");
        while(can > 0){
            System.out.print("Tahmin yapınız: ");
            tahmin = input.nextInt();

            if(tahmin == sayi){
                oyunDurumu = true;
                break;
            }
            else {
                if(tahmin > sayi){
                    System.out.println("sayi "+tahmin+" küçük");
                }
                else {
                    System.out.println("sayi "+tahmin+" büyük");
                }
                System.out.println("tahminiz yanlış, tekrar deneyiniz. Kalan hakkınız: "+can);
                can--;
            }
        }

        if(oyunDurumu){
            System.out.println("doğru tahmin yaptınız");
            System.out.println("tahmin edilen sayımız: "+sayi);
        }
        else {
            System.out.println("oyun bitti");
        }
    }
}

