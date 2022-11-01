public class Main {
    public static void main(String[] args) {

        int sayi1 = 17;
        int sayi2 = 8;
        int sayi3 = 25;
        int enBuyuk = sayi1;

        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En Büyük Sayı :"+ enBuyuk);
    }
}