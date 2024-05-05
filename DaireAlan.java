import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        double r, alpha;
        final double PI = 3.14;

        Scanner scan = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz: ");
        r = scan.nextDouble();

        System.out.print("∝ açısını giriniz: ");
        alpha = scan.nextDouble();

        double alan =  (PI * (r*r) * alpha) / 360;

        System.out.println("Daire diliminin alanı: " + alan);

    }
}
