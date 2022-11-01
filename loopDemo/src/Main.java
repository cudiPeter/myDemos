public class Main {
    public static void main(String[] args) {
        //for
        for(int i=1;i<10;i+=1){    //i+=1  bir bir arttır ya da i++
            System.out.println(i); //i+=2  iki iki arttır
        }
        System.out.println("for Döngüsü Bitti!");

        //while
        int i=1;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("while Döngüsü Bitti!");

        //do while döngüsü log atmak icin kullanılır döngünün çalıştıgını belli etmek icin database e geridönüş
        int j =1;
        do{
            System.out.println(j);
            j++;
        }while (j<10);
        System.out.println("do while Döngüsü Bitti!");
        //____________________________________________________
        for(int b=1;b<20;b++){
            System.out.println(b);
        }
        System.out.println("1.ETAP TAMAM!");
        int c=1;
        while (c<20){
            System.out.println(c);
            c++;
        }
        System.out.println("2.ETAP TAMAM!");
        int d=1;
        do{
            System.out.println(d);
            d++;
        }
        while(d<20);
        System.out.println("3.ETAP TAMAM!");


    }
}