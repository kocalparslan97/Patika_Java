import java.util.Scanner;

public class pratik2 {
    /**
     * @param args
     * @author ALPARSLAN
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // Degiskenlerin tanimlanmasi
        double brüt, kdv_oran, kdv_tutar, odenecek_tutar;

        kdv_oran = 0.18;
        System.out.println("Brüt Ücreti :");
        brüt = s.nextDouble();

        kdv_tutar = (brüt * kdv_oran);
        odenecek_tutar = brüt + kdv_tutar;

        System.out.println("Not : KDV tutari 18% olarak alinmistir. ");
        System.out.println("KDV'siz Tutar :" + brüt);
        System.out.println("KDV Orani :" + kdv_oran);
        System.out.println("KDV Tutari :" + kdv_tutar);
        System.out.println("KDV'li Tutar :" + odenecek_tutar);
    }

}
