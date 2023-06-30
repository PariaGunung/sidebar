public class kamis1 {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if (((i % 3)==0) && ((i % 5)==0)) {
                System.out.print("Unindra ");
            } else if ((i % 3)==0){
                System.out.print("Tiga ");
            }else if((i % 5)==0){
                System.out.print("lima ");
            }else{
                System.err.print(i);
                System.err.print(" ");
            }
        }
    }
    
}
