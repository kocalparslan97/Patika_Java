import java.util.Scanner;

public class pratik4 {
    /**
     * @param args
     * @author ALPARSLAN
     */
    public static void main(String[] args) {
        // Taksimetre KM basina 2.20 TL tutmaktadir.
        // Min Odenecek Tutar : 20 TL
        // 20 TL altindaki tüm tutarlarda 20 TL olarak alinacak.
        // Taksimetre acilis ucreti 10 TL

        double km_ucreti = 2.20;
        // double min_odenecek = 20.0;
        int tk_baslangic = 10;
        double verilen_mesafe, tk_tutar;

        Scanner s = new Scanner(System.in);

        System.out.println("Gidilecek olan yerin KM cinsinden mesafesini giriniz : ");
        verilen_mesafe = s.nextDouble();

        tk_tutar = tk_baslangic + (verilen_mesafe * km_ucreti);

        System.out.println("KM Basi Ucret :" + km_ucreti);
        System.out.println("TK Baslangic Ucreti: " + tk_baslangic);
        System.out.println("Girilen KM Degeri :" + verilen_mesafe);
        System.out.println("Gercek TK Hesaplanan Ucret :" + tk_tutar);

        // tk_tutar degeri 20 TL altinda oldugu icin musterinin odemesi
        // gereken ucret 20 TL olarak tanimlandi bu kosulda
        if (tk_tutar < 20) {
            tk_tutar = 20;
        }

        System.out.println("Odenecek Taksi Ucreti :" + tk_tutar);
    }
}
