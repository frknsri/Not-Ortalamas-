import java.util.Scanner;

public class NewMain {
    public static <string> void main(String[] args) {
        // değişkenler oluştur
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik  ;
        // scanner sınıfını tanımladık
        Scanner frk = new Scanner(System.in);
        //kullanıcıdan değerleri al
        System.out.print("Matematik Notu  :");
        Matematik = frk.nextInt();
        System.out.print("Fizik Notu  : ");
        Fizik = frk.nextInt();
        System.out.print("Kimya Notu  :");
        Kimya = frk.nextInt();
        System.out.print("Turkce Notu  :");
        Turkce = frk.nextInt();
        System.out.print("Tarih Notu  :");
        Tarih = frk.nextInt();
        System.out.print("Muzik Notu  70:");
        Muzik = frk.nextInt();
        //Derslerin toplamı
        int toplam = ( Matematik + Fizik + Kimya + Turkce + Tarih + Muzik );
        //Derslerin ortalaması
        double ortalama = toplam / 6.0 ;
        //Derslerin geçerli not sayısana eşitliği
        boolean genel = (ortalama >= 60);


        System.out.println("ortalamanız  : " + ortalama);

        string srt = (string)  (genel  ? "Sınıfı Geçti" : "Sınıfta Kaldı");

        System.out.println(srt);





    }
}









