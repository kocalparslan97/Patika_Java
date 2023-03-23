import java.util.Scanner;

public class pratik7 {
    /**
     * @param args
     * @author ALPARSLAN
     */
    public static void main(String[] args) {

        /*
         * Meyveler ve KG Fiyatları
         * 
         * Armut : 2,14 TL
         * Elma : 3,67 TL
         * Domates : 1,11 TL
         * Muz: 0,95 TL
         * Patlıcan : 5,00 TL
         */
        double a_ucret = 2.14, e_ucret = 3.67, d_ucret = 1.11, m_ucret = 0.95, p_ucret = 5.0, top_tutar;
        int armut, elma, domates, muz, patlican;

        Scanner s = new Scanner(System.in);

        System.out.println("Armut Kac Kilo? :");
        armut = s.nextInt();

        System.out.println("Elma Kac Kilo? :");
        elma = s.nextInt();

        System.out.println("Domates Kac Kilo? :");
        domates = s.nextInt();

        System.out.println("Muz Kac Kilo? :");
        muz = s.nextInt();

        System.out.println("Patlican Kac Kilo? :");
        patlican = s.nextInt();

        top_tutar = (armut * a_ucret) + (elma * e_ucret) + (domates * d_ucret) + (muz * m_ucret) + (patlican * p_ucret);

        System.out.println("Toplam Tutar :" + top_tutar + " TL");
    }

}
