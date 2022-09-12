import java.util.Scanner;

public class notHesapla {

    public static void main(String[] args) {

        int not1, not2, not3;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("Sınav 1: ");
        not1 = input.nextInt();

        System.out.println("Sınav 2: ");
        not2 = input.nextInt();

        System.out.println("Sınav 3: ");
        not3 = input.nextInt();

        sonuc = (not1 * 0.15) + (not2 * 0.35) + (not3 * 0.50);

        if(sonuc >= 45){
            System.out.println("Geçtiniz Notunuz: "+ sonuc);
        }
        else {
            System.out.println("Kaldınız Notunuz: "+ sonuc);
        }
    }
}
