import java.util.Scanner;

public class Soal2Bahas {

    private static final String puluh = "puluh";
    private static final String ratus = "ratus";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int bil1 = s.nextInt();
        int bil2 = s.nextInt();

        String hasil = teksAngka(bil1 + bil2);

        System.out.println(hasil);
    }

    private static String teksAngka(int hasilJumlah) {
        int ratusan = hasilJumlah / 100;
        int puluhan = (hasilJumlah / 10) % 10;
        int satuan = hasilJumlah % 10;

        String rumus = String.format(
            "%s %s %s %s %s",
            getTeksDariAngka(ratusan),
            ratus,
            getTeksDariAngka(puluhan),
            puluh,
            getTeksDariAngka(satuan)
        );

        return rumus;
    }

    private static String getTeksDariAngka(int angka) {
        switch(angka) {
            case 2:
                return "dua";
            case 3:
                return "tiga";
            case 4:
                return "empat";
            case 5:
                return "lima";
            case 6:
                return "enam";
            case 7:
                return "tujuh";
            case 8:
                return "delapan";
            case 9:
                return "sembilan";
            default:
                return "Tidak valid";
        }
    }
}
