public class tugas1 {
    public static void main(String[] args) {
        System.out.println("Pemrograman prima FOR");
        int bil,x=100;
        for (int i= 1; i <= x; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            } 
    }
    }
}
