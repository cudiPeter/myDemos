public class Main {
    public static void main(String[] args) {
        int number1 = 221;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for(int i=1;i<number1;i++){
            if(number1%i==0){
                total1=total1+i;
            }
        }
        for(int j=1;j<number1;j++) {
            if (number2 % j == 0) {
                total2 = total2 + j;
            }
        }
        if (number1==total2 && number2==total1){            // && ve demek    ||ya da demek
            System.out.println("Bu iki sayı arkadaştır.");
        }else{
                System.out.println("Bu iki sayı arkadaş değildir.");
        }
    }
}