import java.util.Scanner;

public class Tugas2_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = sc.nextDouble();
        System.out.print("Masukkan upah per jam: ");
        double upahPerjam = sc.nextDouble();

        double gajiSebelumBonus = jamKerja * upahPerjam;
        double bonus = 0.10 * gajiSebelumBonus;
        double totalSebelumPajak = gajiSebelumBonus + bonus;
        double pajak = 0.05 * totalSebelumPajak;
        double gajiBersih = totalSebelumPajak - pajak;

        System.out.print("Gaji bersih setelah pajak: " + gajiBersih);
    

    }
}
