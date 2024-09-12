import java.util.Scanner;

public class Siakad29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, NIM;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("masukkan nama: ");
        nama = sc.nextLine();
		System.out.print("masukkan NIM: ");
		NIM = sc.nextLine();
		System.out.print("masukkan kelas: ");
		kelas = sc.nextLine(). charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = ((nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35));
        System.out.println("Nama: " + nama + " NIM: " + NIM);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        

    }

}