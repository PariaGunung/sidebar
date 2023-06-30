import java.util.Scanner;
public class rabu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan golongan anda :");
        int gl=input.nextInt();
        switch (gl) {
            case 1 : System.out.println("Gaji Anda adalah 1500000");
                break;

                case 2 :System.out.println("Gaji Anda adalah 2000000");
                    break;

                    case 3 : System.out.println("Gaji Anda adalah 2500000");                       
                        break;
        
            default: System.out.println("Masukan golongan dari 1-3");
        }
    }
    
}