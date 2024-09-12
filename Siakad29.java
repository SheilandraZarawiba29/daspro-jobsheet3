import java.util.Scanner;

public class Siakad29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, NIM;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

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
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("Nama: " + nama + " NIM: " + NIM);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        

    }

}