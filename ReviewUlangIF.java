public class ReviewUlangIF {
    public static void main(String[] args) {
        // Kalau Dira sakit dan hari sedang cerah, maka Dira ke dokter
        // Kalau Dira sakit dan hari tidak cerah, maka Dira istirahat di rumah
        // Kalau Dira tidak sakit dan hari sedang cerah, maka Dira main ke luar
        // Kalau Dira tidak sakit dan hari tidak cerah, maka Dira main game di rumah

        boolean apakahDiraSakit = false;
        boolean apakahHariCerah = true;

        if (apakahDiraSakit == true && apakahHariCerah == true) {
            System.out.println("Dira pergi ke dokter");
        } else if (apakahDiraSakit == true && apakahHariCerah == false) {
            System.out.println("Dira istirahat di rumah");
        } else if (apakahDiraSakit == false && apakahHariCerah == true) {
            System.out.println("Dira main ke luar");
        } else if (apakahDiraSakit == false && apakahHariCerah == false) {
            System.out.println("Dira main game di rumah");
        }
    }
}