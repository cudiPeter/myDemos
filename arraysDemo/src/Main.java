public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Ali";
        String ogrenci2 = "Ceyda";
        String ogrenci3 = "Veli";
        String ogrenci4 = "Şule";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("_________________________________________");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Ali";
        ogrenciler[1] = "Ceyda";
        ogrenciler[2] = "Veli";
        ogrenciler[3] = "Şule";

        for(int i=0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("_________________________________________");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}