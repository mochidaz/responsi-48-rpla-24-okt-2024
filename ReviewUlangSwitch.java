import java.util.Scanner;

public class ReviewUlangSwitch {

    static final String karakter1 = "Dira";
    static final String karakter2 = "Radi";
    static final String karakter3 = "Idar";

    static final String prefixKodeNomorHPIndonesia = "+62";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String karakterYangDipilih = s.nextLine();

        String senjata = "";

        switch (karakterYangDipilih) {
            case karakter1:
                senjata = "Tongkat Sihir";
                break;
            case karakter2:
                senjata = "Pedang";
                break;
            case karakter3:
                senjata = "Pistol";
                break;
            default:
                senjata = "Gaada";
                break;
        }

        System.out.printf("Memilih karakter %s dengan senjata %s",
         karakterYangDipilih, senjata);
    }
}
