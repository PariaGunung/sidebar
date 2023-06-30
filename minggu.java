import java.util.Scanner;
public class minggu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan Lebar :");
        int lbr=input.nextInt();
        System.out.print("masukan panjang :");
        int pjg=input.nextInt(); 
        int luas;
        if (pjg * lbr <=0)
         {
            System.out.println("Anda memmasukan angka negatif");
         }
        else{
            luas = pjg*lbr;
            System.out.println("luas adalah "+luas);
            
        }
    }
}
