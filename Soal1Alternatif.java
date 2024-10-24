import java.util.Scanner;

public class Soal1Alternatif {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int angka = s.nextInt();

        int hasil = enkripsi(angka);

        String hasilString = String.valueOf(hasil);

        if (hasil / 1000 == 0) {
            hasilString = "0" + hasil;
        }

        System.out.println(hasilString);
    }

    private static int enkripsi(int angka) {
       int ribuan = angka / 1000;
       int ratusan = (angka / 100) % 10;
       int puluhan  = (angka / 10) % 10;
       int satuan = angka % 10;

       ribuan = ribuan + 5;
    
       ribuan = ribuan > 9 ? ribuan % 10 : ribuan;

       ratusan = ratusan + 5;

       ratusan = ratusan > 9 ? ratusan % 10 : ratusan;

       puluhan = puluhan + 5;

       puluhan = puluhan > 9 ? puluhan % 10 : puluhan;

       satuan = satuan + 5;

       satuan = satuan > 9 ? satuan % 10 : satuan;

       return (ribuan * 1000) + (satuan * 100) + (puluhan * 10) + ratusan;
    }
}