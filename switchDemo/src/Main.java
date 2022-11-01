public class Main {
    public static void main(String[] args) {
        // ctrl+shift+alt+L sayfa düzeni oluşturur.
        char grade = 'F';

        switch (grade){
            case 'A':
                System.out.println("Mükemmel Geçtiniz!");
                break;
            case 'B':
                System.out.println("Fena Değil Geçtiniz");
                break;
            case 'C':
            case 'D':
                System.out.println("Daha çok çalışmalısın Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");

        }
    }
}