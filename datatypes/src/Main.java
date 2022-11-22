public class Main {
    public static void main(String[] args) {
        String metin = "Veri Tipleri";
        char harf = 'A';
        byte sayi1 =127;              //-128 ile 127 arası sayı tutar
        short sayi2 =128 ;            //-32768 ile 32767 arası sayı tutar
        int sayi3 =32768 ;            //-2147483648 ile 2147483647 arası sayı tutar
        long sayi4 = 2147483647;      //-9223372036854775808 ile 9223372036854775807 arası sayı tutar
        float sayi5 = (float) 1.78;   //ondalık sayı tutar
        double sayi6 =2.78 ;          //ondalık sayı tutar

        System.out.println(metin+harf+sayi1+sayi2+sayi3+sayi4+sayi5+sayi6);
    }
}