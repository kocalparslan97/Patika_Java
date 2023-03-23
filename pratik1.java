import java.util.Scanner;

public class pratik1 {

    /**
     * @param args
     * @author ALPARSLAN
     */
    public static void main(String[] args) {
        // Degiskenleri tanimlama
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Ortalama degiskeni
        int toplam;
        double sonuc;

        // Gecti || Kaldi
        boolean durum = true;

        // Scanner sinifimizi tanimladik
        Scanner inp = new Scanner(System.in);

        // Kullanicidan degerleri al
        System.out.println("Matematik Notunuz:");
        mat = inp.nextInt();
        System.out.println("Fizik Notunuz:");
        fizik = inp.nextInt();
        System.out.println("Kimya Notunuz:");
        kimya = inp.nextInt();
        System.out.println("Turkce Notunuz:");
        turkce = inp.nextInt();
        System.out.println("Tarih Notunuz:");
        tarih = inp.nextInt();
        System.out.println("Muzik Notunuz:");
        muzik = inp.nextInt();

        toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        sonuc = toplam / 6;
        System.out.println("Ortalamaniz :" + sonuc);

        // Parantez icerisinde Gecme Durumu icin gecerli kosulu yazinca boolean
        // tipinde bir deger ciktisi veriyor bu sekilde if else yapisi kullanilmadan
        // gecme durumu ciktisini veriyor.
        durum = (sonuc > 60);
        System.out.println("Gecme Durumunuz: " + durum);

    }

}