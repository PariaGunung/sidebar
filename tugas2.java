import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Pemrograman prima FOR");
        int bil;
        System.out.println("Masukan Jumlah bilangan prima pertama:");
        int awal = Input.nextInt();
        for (int i = 1; i <= awal; i++){
            bil=0;
            for (int j = 1; j <= i; j++){
                if (i % j==0){
                    bil= bil + 1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            } 
    }
    }
}