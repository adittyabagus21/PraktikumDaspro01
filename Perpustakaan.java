package PraktikumDaspro01;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean kartu = sc.nextBoolean();

        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean registrasi = sc.nextBoolean();

        if (kartu || registrasi) {
            System.out.println("Boleh masuk perpustakaan.");
        } else {
            System.out.println("Ditolak masuk.");
        }

        sc.close();
    }
}
