import java.util.Scanner;

public class GenelOrtalama {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();


        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scan.nextInt();
        double toplam = mat + fizik + turkce + kimya + muzik;
        int adet = 5;



        if(mat>100 || mat<0){
            toplam -= mat;
            adet--;
        }
        if(fizik>100 || fizik<0){
            toplam -= fizik;
            adet--;
        }

        if(turkce>100 || turkce<0){
            toplam -= turkce;
            adet--;
        }
        if(kimya>100 || kimya<0){
            toplam -= kimya;
            adet--;
        }
        if(muzik>100 || muzik<0){
            toplam -= muzik;
            adet--;
        }
        double ortalama = toplam / adet;

        if (ortalama <= 55) {
            System.out.println("Sınıfta kaldınız!");
        } else {
            System.out.println("Ortalamanız: " + ortalama);
        }
    }
}
