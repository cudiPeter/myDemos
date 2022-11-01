public class Main {
    public static void main(String[] args) {
        String mesaj ="Bugun hava çok güzel.";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı :"+mesaj.length()); //eleman sayısı
        System.out.println("5. Eleman :"+mesaj.charAt(4));    //x inci eleman parantez icindeki index
        System.out.println(mesaj.concat("Yaşasın!"));     //2 metni birleştirme
        System.out.println(mesaj.startsWith("B"));            //metnin ilk harfi ne?
        System.out.println(mesaj.endsWith("."));              //metnin son harfi ne?

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);                      //metinden belirli karakterleri yazdırmak ıcın
        System.out.println(mesaj.indexOf("a"));               //metinde aradıgımız harf bastan kacıncı karakter
        System.out.println(mesaj.lastIndexOf("a"));       //metinde aradıgımız harf sondan kacıncı karakter*/

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);                         //istedigimiz harfi baska bir harfle degistirebiliriz
        System.out.println(mesaj.substring(2,5));              //metinden belirli bir kısmı almamıza yarar

        for(String kelime : mesaj.split(" ")) {
            System.out.println(kelime);                        //sectigimiz harfe ya da bosluga gore kelımelerı tek tek ayırır
        }
        System.out.println(mesaj.toLowerCase());               //tüm harfleri kucuk harf yapar
        System.out.println(mesaj.toUpperCase());               //tüm harfleri buyuk harf yapar
        System.out.println(mesaj.trim());                      //baştaki ve sondaki tüm boşlukları kaldırır.



    }
}