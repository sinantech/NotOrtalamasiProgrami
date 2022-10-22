import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Ortalama Hesaplama ve Sınıf Geçme Durumu Programına Hoş Geldiniz");
        System.out.print("Lütfen Notlarınızı Giriniz");

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("matematik notunuz : ");
        mat = inp.nextInt();
        System.out.print("fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.print("kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.print("turkce notunuz : ");
        turkce = inp.nextInt();
        System.out.print("tarih notunuz : ");
        tarih = inp.nextInt();
        System.out.print("muzik notunuz : ");
        muzik = inp.nextInt();

        if (mat<0 || fizik<0 || kimya<0 || turkce <0 || tarih<0 | muzik<0 ) {
            System.out.println("Notunuzu Kontrol Ediniz");
        } else {
            int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

            double sonuc = (toplam / 6.0);

            System.out.println("Ortalamaniz" + " " + sonuc);
            int average = 55;

            if (sonuc < average) {
                System.out.println("SENEYEGORUSURUZAQCOCU");
            } else if (sonuc == average) {
                System.out.println("HADI YINE IYISIN AQ");
            } else {
                System.out.println("gectiniz");
            }

            System.out.print("Harf Notunuz : ");

            if (sonuc >= 90) {
                System.out.println(sonuc + " " + "AA");
            } else if (sonuc >= 80) {
                System.out.println(sonuc + " " + "BA");
            } else if (sonuc >= 75) {
                System.out.println(sonuc + " " + "BB");
            } else if (sonuc >= 70) {
                System.out.println(sonuc + " " + "CB");
            } else if (sonuc >= 65) {
                System.out.println(sonuc + " " + "CC");
            } else if (sonuc >= 60) {
                System.out.println(sonuc + " " + "DC");
            } else if (sonuc >= 55) {
                System.out.println(sonuc + " " + "DD");
            } else {
                System.out.println(sonuc + " " + "KALDİNİZNIHAHAHAHAHAHAHABETEROL");
            }


        }
    }
}