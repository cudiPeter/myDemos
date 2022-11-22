public class Main {
    public static void main(String[] args) {
        int number = -1;
        //int remainder = number % 2;
        //System.out.println(remainder);
        if(number==1){
            System.out.println(number+" asal sayi değildir.");
            return;
        }
        if(number<1){
            System.out.println("Geçersiz sayi girdiniz.");
            return;
        }
        boolean isPrime=true;
        for (int i=2;i<number;i++){
            if (number%i==0)
                isPrime=false;
            }
        if (isPrime){
            System.out.println(number+" asal sayidir.");
        }else{
            System.out.println(number+" asal  değildir.");
        }


    }
}