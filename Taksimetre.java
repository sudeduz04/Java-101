import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        // Değişkenleri tanımlıyoruz.
        int km, startPrice = 30, perKm = 26, total;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kilometre giriniz: ");
        km = inp.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total < 60) ? 60 : total;

        System.out.println("Toplam: ₺" + total);

    }
}
