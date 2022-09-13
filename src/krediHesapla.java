import java.util.Scanner;

public class krediHesapla {

    public static void main(String[] args) {
        double cekilenTutar, geriOdenenTutar = 0;
        int vade;

        Scanner input = new Scanner(System.in);

        System.out.println("Kredi Tutarı");
        cekilenTutar = input.nextDouble();

        System.out.println("Kredi Vadesi");
        vade = input.nextInt();

        if(vade <= 3){
            geriOdenenTutar = cekilenTutar + (cekilenTutar * 1.99);
        }
        else if(vade <= 6) {
            geriOdenenTutar = cekilenTutar + (cekilenTutar * 2.08);
        }
        else if (vade <= 10) {
            geriOdenenTutar = cekilenTutar + (cekilenTutar * 2.69);
        }
        else {
            System.out.println("Hata Oluştu");
        }
        System.out.println("Cekilen Tutar: "+cekilenTutar+" TL Kredi vadesi "+vade+" yıl geri ödenecek tutar: "+geriOdenenTutar+"TL'dir.");
    }
}
