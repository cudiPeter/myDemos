public class Main {
    public static void main(String[] args) {
        String[][] sehirler =new String[3][3];

        sehirler[0][0]="istanbul";
        sehirler[0][1]="sivas";
        sehirler[0][2]="trabzon";
        sehirler[1][0]="balıkesir";
        sehirler[1][1]="ankara";
        sehirler[1][2]="erzurum";
        sehirler[2][0]="izmir";
        sehirler[2][1]="denizli";
        sehirler[2][2]="gaziantep";

        for(int i=0;i<=2;i++){
            System.out.println("___________________________");
            for (int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}