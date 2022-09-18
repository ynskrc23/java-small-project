package atmProjesi;

import java.util.HashMap;

public class Main {
    public static String paraYatir(String hesapNo, String hesapBakiye, int miktar){
        int bakiye = Integer.parseInt(hesapBakiye) + miktar;
        System.out.println(bakiyeSorgula(hesapNo, String.valueOf(bakiye)));

        return "bu "+hesapNo+" hesap numarasına "+miktar+" TL yatirildi mevcut hesabınızda toplam "+bakiye+" TL vardır.";
    }

    public static String paraCek(String hesapNo, String hesapBakiye, int miktar){
        if(Integer.parseInt(hesapBakiye) < miktar){
            return "hesabınızda yeterli para mevcut değil";
        }
        int bakiye = Integer.parseInt(hesapBakiye) - miktar;
        System.out.println(bakiyeSorgula(hesapNo, String.valueOf(bakiye)));

        return "bu "+hesapNo+" hesap numarasına "+miktar+" TL çekildi mevcut hesabınızda toplam "+bakiye+" TL vardır.";
    }

    public static String paraTransferi(String alicihesapNo, String alicihesapBakiye, String gonderenhesapNo, String gonderenhesapBakiye, int miktar){
        if(Integer.parseInt(gonderenhesapNo) > miktar){
            int alicibakiye = Integer.parseInt(alicihesapBakiye) + miktar;
            int gonderenbakiye = Integer.parseInt(gonderenhesapBakiye) - miktar;

            return gonderenhesapNo+" nolu hesaba para transferi yapıldı.";
        }
        else {
            return "limit yetersiz hesabınızda"+ gonderenhesapBakiye+ " TL para mevcut";
        }
    }

    public static String bakiyeSorgula(String hesapNo, String hesapBakiye){
        return hesapNo+ " nolu hesabınızda "+ hesapBakiye +" TL para mevcuttur.";
    }

    public static void main(String[] args) {
        HashMap<String,String> hesapElbistan = new HashMap<>();
        hesapElbistan.put("isim","yunus karaca");
        hesapElbistan.put("hesap_no","046082");
        hesapElbistan.put("bakiye","10000");

        HashMap<String,String> hesapMalatya = new HashMap<>();
        hesapMalatya.put("isim","yunus karaca");
        hesapMalatya.put("hesap_no","046044");
        hesapMalatya.put("bakiye","8000");

        System.out.println(paraYatir(hesapElbistan.get("hesap_no"),hesapElbistan.get("bakiye"),2000));
        System.out.println("---------------------------");
        System.out.println(paraCek(hesapElbistan.get("hesap_no"),hesapElbistan.get("bakiye"),800));
        System.out.println("---------------------------");
        System.out.println(paraTransferi(hesapMalatya.get("hesap_no"),hesapMalatya.get("bakiye"),hesapElbistan.get("hesap_no"),hesapElbistan.get("bakiye"),8000));
    }
}
