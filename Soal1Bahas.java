// Mau bikin enkripsi, dari bilangan bulat dengan 4 digit
// Pertama-tama, tiap digit harus ditambah 5
// Kalau hasil pertambahannya ada lebih dari 2 digit, maka pakai
// digit terakhir saja
// Setelah itu, tukar digit ke-dua dengan ke-empat


import java.util.Scanner;

public class Soal1Bahas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int bilangan1 = s.nextInt();
        int bilangan2 = s.nextInt();
        int bilangan3 = s.nextInt();

        String hasil1 = enkripsi(bilangan1);
        String hasil2 = enkripsi(bilangan2);
        String hasil3 = enkripsi(bilangan3);

        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
    }

    private static String enkripsi(int bilangan) {
        // Ini dari 5128 -> 5
        int ribuan = bilangan / 1000; // 5
        // Ini dari 5128 -> 51 -> 1
        int ratusan = (bilangan / 100) % 10; // 1
        // Ini dari 5128 -> 512 -> 2
        int puluhan = (bilangan / 10) % 10; // 2
        // Ini dari 5128 -> 8
        int satuan = bilangan % 10; // 8

        ribuan += 5;
        ratusan += 5;
        puluhan += 5;
        satuan += 5;

        if (ribuan > 9) {
            ribuan = ribuan % 10;
        }
        if (ratusan > 9) {
            ratusan = ratusan % 10;
        }
        if (puluhan > 9) {
            puluhan = puluhan % 10;
        }
        if (satuan > 9) {
            satuan = satuan % 10;
        }

        // Jangan lupa tuker bilangan ke dua dengan ke empat
        return String.format("%d%d%d%d", ribuan, satuan, puluhan, ratusan);
    }
}
