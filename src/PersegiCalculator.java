import java.util.Scanner;

/**
 *
 */
public class PersegiCalculator {

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah yang mungkin digunakan (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sisi;

        // Menampilkan pesan sambutan kepada pengguna
        System.out.println("Program Hitung Luas dan Keliling Persegi");

        // Meminta pengguna untuk memasukkan panjang sisi persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        sisi = input.nextDouble();

        // Menghitung luas persegi
        double luas = sisi * sisi;

        // Menghitung keliling persegi
        double keliling = 4 * sisi;

        // Menampilkan hasil luas persegi ke layar
        System.out.println("Luas persegi: " + luas);

        // Menampilkan hasil keliling persegi ke layar
        System.out.println("Keliling persegi: " + keliling);
    }
}
