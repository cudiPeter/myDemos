public class Main {
    public static void main(String[] args) {
        char harf = 'Z';

        switch (harf){
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }
}