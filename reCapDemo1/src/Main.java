public class Main {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=25;
        int sayi3=3;
        int enBuyuk=sayi1;
        int enKucuk=sayi1;

        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if (enBuyuk<sayi3) {
            enBuyuk=sayi3;
        }
        if(enKucuk>sayi2){
            enKucuk=sayi2;
        }
        if(enKucuk>sayi3){
            enKucuk=sayi3;
        }
        System.out.println("En büyük sayi "+enBuyuk+" dir.");
        System.out.println("En küçük sayi "+enKucuk+" dir.");
    }
}