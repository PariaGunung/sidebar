
public class tugas {

public static void main(String[] args) {
    int x = 11;
    for (int i = 1; i <= x; i++){
        for (int j=1; j<=i; j++) {
            if (i+j<= (x+1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}