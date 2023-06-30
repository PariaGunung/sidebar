public class latihan {
    public static void main(String[] args) {
    String[] npm = {"2334","2335","2336","2337","2338","2339"};
    String[] nama = {"iman","ibnu","yunil","Aji","imad","supri"};
    double[][]uji= {{30,80,70},{60,50,70},{70,70,90},{20,70,80},{50,70,50},{80,70,90},{80,70,80}};
    double nilai=0;
    System.out.println("+------+------+------+-------+-----+------------+");
    System.out.println("| NPM\t| Nama\t| UTS\t| UAS\t|prak\t| NILAI AHKIR|");
    System.out.println("+------+------+------+-------+-----+------------+");
    for (int row =0;row<7; row++ ) {
        System.out.print("|"+npm[row]+"\t| ");
        System.out.print(nama[row]+"\t| ");
        for (int colum = 0; colum< 3; colum++) {
        System.out.print(uji[row][colum]+"\t| ");
        }
        nilai = (0.35*uji[row][0]+0.45*uji[row][1]+0.2*uji[row][2]);
        
    System.out.println(nilai+"\t\t|");
    }
    System.out.println("+------+------+------+-------+-----+------------+");
}
}
