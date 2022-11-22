public class Main {
    public static void main(String[] args) {
        char harf = 'a';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harftir.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("İnce sesli harftir.");
                break;
            default:
                System.out.println("Sessiz harf girdiniz.");
        }
    }
}