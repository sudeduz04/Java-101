import java.util.Scanner;

public class HesapMakinesi1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz: ");
        double n1 = scan.nextDouble();
        System.out.print("2.Sayıyı giriniz: ");
        double n2 = scan.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

        System.out.print("Yapacağınız işlem: ");
        int islem = scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplama: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme: " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez.");
                }
                break;
            default:
                System.out.println("Başka bir işlem deneyiniz");
                break;
        }
    }
}
