import java.util.*;

public class palindromSayilar {

    static String isPalidromMu(int sayi){
        int temp, tersSayi = 0, kalan;
        temp = sayi;

        while(temp != 0){
            kalan = temp % 10;
            tersSayi = tersSayi * 10 + kalan;
            temp /= 10;
        }
        if(sayi == tersSayi){
            return sayi+" palindrom sayidir";
        }
        else {
            return sayi+" palindrom sayı değil";
        }
    }

    public static void main(String[] args) {
        for(int m = 10; m < 100; m++){
            System.out.println(isPalidromMu(m));
        }
    }
}
