import java.util.Scanner;

public class pratik6 {
    /**
     * @param args
     * @author ALPARSLAN
     */
    public static void main(String[] args) {

        // Formul : Kilo (kg) / Boy(m) * Boy(m)

        // Degiskenleri tanimlama
        double kilo, boy, vki;

        Scanner s = new Scanner(System.in);

        System.out.println("Kilo(kg) degerinizi giriniz:");
        kilo = s.nextDouble();

        System.out.println("Boy(m) degerinizi giriniz:");
        boy = s.nextDouble();

        vki = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indexi :" + vki);
    }
}
