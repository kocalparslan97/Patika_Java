import java.util.Scanner;

public class pratik5 {
    /**
     * @param args
     * @author ALPARSLAN
     */
    public static void main(String[] args) {

        // Girilen yaricap ile dairenin alanini ve cevresini hesaplayan kod
        // alan = pi*r*r
        // cevre = 2*pi*r
        // Formül : (𝜋 * (r*r) * 𝛼) / 360
        Scanner s = new Scanner(System.in);

        int yaricap, aci;
        double tum_cevre, tum_alan, dilimin_alani, pi = 3.14;

        System.out.println("Dairenin yaricapini giriniz :");
        yaricap = s.nextInt();

        System.out.println("Aci Derecesi :");
        aci = s.nextInt();

        dilimin_alani = (pi * (yaricap * yaricap) * aci) / 360;
        tum_alan = pi * yaricap * yaricap;
        tum_cevre = 2 * pi * yaricap;

        System.out.println("Girilen Acinin Daire Dilimin Alani :" + dilimin_alani);
        System.out.println("Dairenin Alani:" + tum_alan);
        System.out.println("Dairenin Cevresi:" + tum_cevre);

    }

}
