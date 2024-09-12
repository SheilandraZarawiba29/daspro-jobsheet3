import java.util.Scanner;

public class Tugas1_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double tarifperkWh = 1500;
        System.out.print("Masukkan jumlah penggunaan listrik (dalam kWh): ");
        double penggunaan = sc.nextDouble();

        double totalTagihan = penggunaan * tarifperkWh;
        boolean melebihiBatas = penggunaan >= 500;
        
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Apakah penggunaan melebihi 500 kWh? " + melebihiBatas);


    }
}
