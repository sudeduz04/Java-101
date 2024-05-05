import java.util.Scanner;

public class KDV {
    public static void main(String[] args){

        double tutar, kdvTutar, kdvliTutar, kdvOran = 0.25;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Ücret Tutarı: " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutar: " + kdvTutar);
        System.out.println("KDV'li tutar: " + kdvliTutar);

    }
}
