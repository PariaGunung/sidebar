import java.util.Scanner;
public class minggu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan jumlah mobil:");
        int jb = input.nextInt();
        System.out.print("Lama waktu pinjaman:");
        int wp = input.nextInt();
        int  ht;
        double denda;
        if ( jb >=6 ) {
            System.out.println("mobil melebihi batas pinjam");
        }else if (wp >=8) {
            denda = (350000 * jb) * 0.3;
            System.out.println("waktu pinjaman anda melebihi batas maksimal");
            System.err.println("Anda akan dikenakan denda sebesar "+denda);
        }else{
            ht = jb * 350000;
            System.out.println("Harga Total Yanga Harus Anda Bayar adalah "+ht);
        }

    }
}
