// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//değişkenleri oluştur
      int mat, fizik, kimya, turkce,tarih, muzik;

// Scanner sınıfını tanımla
      Scanner inp = new Scanner(System.in);

//Kullanıcıdan değer alma

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

int toplam = mat + fizik+ kimya+ turkce + tarih+ muzik;
double ort = toplam / 6.0;

      System.out.println("Ortalamanız: " +ort + (ort >= 60 ? " \nDurumunuz: geçtiniz" : "\nDurumunuz: kaldınız")) ;
/*
boolean kosul1 = ort <= 60;
boolean kosul2 = ort > 60;
boolean sonuc = kosul1 || kosul2 ;

String str = sonuc ? "Notunuz : "+ ort + " Geçtiniz" : "Notunuz : "+ ort+ " Kaldiniz";
*/

      
    }
}