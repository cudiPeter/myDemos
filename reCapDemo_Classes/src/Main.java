public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int toplamaSonuc = dortIslem.Topla(3,4);
        System.out.println(toplamaSonuc);
        int cikarmaSonuc = dortIslem.Cikar(5,2);
        System.out.println(cikarmaSonuc);
        int carpmaSonuc = dortIslem.Carp(3,7);
        System.out.println(carpmaSonuc);
        int bolmeSonuc = dortIslem.Bol(100,5);
        System.out.println(bolmeSonuc);
    }
}