import java.util.Scanner;

public class dortIslem {
    public static void main(String[] args) {
        
        int sayi1, sayi2, islem;
        double sonuc = 0;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Birinci Sayı Giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayı Giriniz: ");
        sayi2 = input.nextInt();

        System.out.print("Toplama için 1, Çıkarma için 2, Çarpma için 3, Bölme için 4 seçiniz");
        System.out.println("Lütfen işlem seçiniz");
        islem = input.nextInt();
        
        if(islem == 1){
            sonuc = sayi1 + sayi2;
        }
        else if(islem == 2){
            sonuc = sayi1 - sayi2;
        }
        else if(islem == 3){
            sonuc = sayi1 * sayi2;
        }
        else if(islem == 4){
            if(sayi2 == 0){
                System.out.println("İkinci sayı 0'dan küçük olamaz");
            }
            else{
                sonuc = sayi1 / sayi2;
            }
        }
        else {
            System.out.println("Geçersiz işlem");
        }
        System.out.println("İşlemin sonucu: "+sonuc);
    }
}
