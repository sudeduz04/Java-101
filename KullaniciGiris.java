import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName, password, newPassword, karar;
        String sbtPassword = "Yazılım";
        Scanner input = new Scanner(System.in);


        System.out.print("Şifre giriniz: ");
        password = input.nextLine();

        if (!password.equals(sbtPassword)) {
            System.out.println("Şifreyi sıfırlamak istermisiniz?\nevet veya hayır?");
            karar = input.nextLine();

            if (karar.equals("evet")) {
                System.out.print("Yeni şifre giriniz: ");
                newPassword = input.nextLine();

                if (!newPassword.equals(sbtPassword)) {
                    System.out.print("Yeni şifre oluşturuldu.");
                } else {
                    while (newPassword.equals(sbtPassword)) {
                        System.out.println("Eski şifreyle yeni şifre aynı olamaz. Tekrar deneyiniz. ");
                        System.out.print("Yeni şifre giriniz: ");
                        newPassword = input.nextLine();
                    }
                    System.out.println("Yeni şifre oluşturuldu.");
                }
            } else {
                System.out.println("Sistem kapatılıyor.");
            }
        } else {
            System.out.println("Şifre doğru");
        }
    }
}



