import java.util.Scanner;

public class ManavProgrami {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, paticanKilo;
        double totalArmut, totalElma, totalDomates, totalMuz, totalPatlican, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo: ");
        armutKilo = input.nextDouble();

        System.out.print("Elma kaç kilo: ");
        elmaKilo = input.nextDouble();

        System.out.print("Domates kaç kilo: ");
        domatesKilo = input.nextDouble();

        System.out.print("Muz kaç kilo: ");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilo: ");
        paticanKilo = input.nextDouble();

        totalArmut = armut * armutKilo;
        totalElma = elma * elmaKilo;
        totalDomates = domates * domatesKilo;
        totalMuz = muz * muzKilo;
        totalPatlican = patlican * paticanKilo;
        
        total = totalArmut + totalMuz + totalDomates + totalElma + totalPatlican;


        System.out.println("Toplam tutar: " + total);
    }
}

