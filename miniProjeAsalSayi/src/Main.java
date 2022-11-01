public class Main {
    public static void main(String[] args) {
        int number=25;    //girilen sayı asal mı degıl mı?
        int remainder=number%2;
        //System.out.println(remainder);
        boolean isPrime=true;
        if(number==1){
            System.out.println(number+" Asal sayı değildir.");
            return;
        }
        if (number<1){
            System.out.println("Geçersiz sayı girdiniz.");
            return;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println(number+" Asal sayıdır.");
        }else{
            System.out.println(number+" Asal sayı değildir.");
        }
    }
}