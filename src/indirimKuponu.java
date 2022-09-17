import java.util.Scanner;

public class indirimKuponu {

    public static void main(String[] args) {
        /*
            işin tanımı
            10 ürün üzeri alana %7 indirim
            25 ürün üzeri alana %20 indirim
            400 tl üzeri 65 tl indirim
            600 tl üzeri 125 tl indirim
            1000 tl üzeeri 200 tl indirim
            250 tl üzeri kargo ücretsiz
        */

        int urunAdeti, kargoUcreti = 75;
        double urunFiyat, urunIndirimi, araTutar=0.0, toplamTutar=0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürün Fiyatı: ");
        urunFiyat = input.nextDouble();

        System.out.print("\nÜrün Adedi: ");
        urunAdeti = input.nextInt();

        araTutar = urunAdeti * urunFiyat;

        if(urunAdeti >= 10){
            urunIndirimi = (urunAdeti * urunFiyat) * 0.07;
        }
        else if(urunAdeti >= 25){
            urunIndirimi = (urunAdeti * urunFiyat) * 0.2;
        }
        else if(araTutar >= 400){
            urunIndirimi = 65;
        }
        else if(araTutar >= 600){
            urunIndirimi = 125;
        }
        else if(araTutar >= 1000){
            urunIndirimi = 200;
        }
        else {
            urunIndirimi = 0;
        }

        if(araTutar - urunIndirimi >= 250){
            kargoUcreti = 0;
        }
        toplamTutar = araTutar - urunIndirimi + kargoUcreti;

        System.out.println("sepetin tutarı: "+toplamTutar+" TL'dir");
    }
}
