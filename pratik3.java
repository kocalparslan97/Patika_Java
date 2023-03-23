import java.util.Scanner;

public class pratik3 {
    /**
     * @param args
     * @author ALPARSLAN
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // Kullanicidan alinacak degiskenlerin tanimlanmasi
        int kenar_a, kenar_b;
        double hipotenus;

        System.out.println("İlk Kenar Uzunlugunu Girin :");
        kenar_a = s.nextInt();
        System.out.println("İkinci Kenar Uzunlugunu Girin :");
        kenar_b = s.nextInt();

        hipotenus = Math.sqrt((kenar_a * kenar_a) + (kenar_b * kenar_b));

        System.out.println("Hipotenus Hesabi : " + hipotenus);

    }
}
