import java.util.Scanner;

public class VKI_Hesaplama {
    public static void main(String[] args) {
        double kilo, boy, vki;
        Scanner input = new Scanner(System.in);

        System.out.print("Kilogram değerini giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Boy değerini giriniz(cm): ");
        boy = input.nextInt();
        boy /= 100;

        vki = (kilo) / (boy * boy);
        System.out.println("Vücut kitle indeksi: " + vki);
    }
}
