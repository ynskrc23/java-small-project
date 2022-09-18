public class enBuyukElemanBul {

    public static void main(String[] args) {
        int [] veriler = {7,40,28,61,1,5,3};
        int maxSayi = veriler[0];

        for(int i=0; i<veriler.length; i++){
            if(veriler[i] > maxSayi){
                maxSayi = veriler[i];
            }
        }
        System.out.println("En büyük sayi: "+maxSayi);
    }
}
