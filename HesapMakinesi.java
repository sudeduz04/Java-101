import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, select;
        Scanner scan = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz: ");
        sayi1 = scan.nextInt();

        System.out.print("2.sayıyı giriniz: ");
        sayi2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = scan.nextInt();

        if (select == 1) {
            System.out.print("Toplam: " + (sayi1 + sayi2));

        } else if (select == 2) {
            System.out.print("Çıkarma: " + (sayi1 - sayi2));

        } else if (select == 3) {
            System.out.print("Çarpma: " + (sayi1 * sayi2));

        } else if (select == 4) {
            if (sayi2 != 0) {
                System.out.print("Bölme: " + (sayi1 / sayi2));
            } else {
                System.out.print("Bir sayı sıfıra bölünemez. Tekrar deneyiniz");
            }

        } else {
            System.out.println("Yanlış seçim yaptınız. Tekrar denyiniz");
        }

    }
}

