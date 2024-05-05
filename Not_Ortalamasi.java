import java.util.Scanner;

public class Not_Ortalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = scan.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = scan.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = scan.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = scan.nextInt();

        System.out.print("Müzik notunuz ");
        muzik = scan.nextInt();

        double sonuc = ((mat + fizik + kimya + turkce + muzik) / 5.0);
        System.out.print("Sonuç: " + sonuc);

    }
}