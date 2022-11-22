public class Main {
    public static void main(String[] args) {
        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel, geçtiniz.");
                break;
            case 'B':
                System.out.println("İyi not, geçtiniz.");
                break;
            case 'C':
                System.out.println("Biraz daha gayret, geçtiniz.");
                break;
            case 'D':
                System.out.println("Çok çalışmalısın, geçtiniz.");
                break;
            case 'F':
                System.out.println("Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}