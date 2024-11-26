import java.util.Date;
import java.util.Scanner;

public class PolicyManagementSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Poliçe Yönetim Sistemi ===");
        System.out.println("Lütfen aşağıdaki bilgileri doldurun:");

        // Kullanıcıdan bilgi al
        System.out.print("Adınız: ");
        String name = scanner.nextLine();

        System.out.print("E-posta adresiniz: ");
        String email = scanner.nextLine();

        System.out.print("Şifreniz: ");
        String password = scanner.nextLine();

        System.out.print("Mesleğiniz: ");
        String job = scanner.nextLine();

        Date lastLoginDate = new Date(); // Şu anki tarih ve saat

        // Kullanıcı oluştur
        User user = new User(name, email, password, job, lastLoginDate);

        // Hesap türü seçimi
        System.out.println("Hesap türünü seçin: ");
        System.out.println("1. Bireysel");
        System.out.println("2. Kurumsal");
        System.out.print("Seçiminiz: ");
        int accountTypeChoice = scanner.nextInt();
        scanner.nextLine(); // Buffer temizliği

        Account account;
        if (accountTypeChoice == 1) {
            account = new IndividualAccount(user);
        } else if (accountTypeChoice == 2) {
            account = new CorporateAccount(user);
        } else {
            System.out.println("Geçersiz seçim. Varsayılan olarak bireysel hesap oluşturuluyor.");
            account = new IndividualAccount(user);
        }

        account.showAccountType();
        System.out.println("Hesap başarıyla oluşturuldu!");

        // Kullanıcıya sigorta ekleme seçeneği sun
        System.out.println("\nSigorta eklemek ister misiniz? (Evet için 1, Hayır için 0)");
        int addInsuranceChoice = scanner.nextInt();
        scanner.nextLine(); // Buffer temizliği

        if (addInsuranceChoice == 1) {
            addInsurance(account);
        }

        // Sigortaları listele
        System.out.println("\nHesap bilgileri ve sigortalar:");
        System.out.println(account.getUser());
        account.listInsurances();
    }

    private static void addInsurance(Account account) {
        System.out.print("Sigorta adını girin: ");
        String insuranceName = scanner.nextLine();

        System.out.print("Sigorta fiyatını girin: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Buffer temizliği

        Insurance insurance = new HealthInsurance(insuranceName, price); // Örnek: Sağlık sigortası
        account.addInsurance(insurance);

        System.out.println("Sigorta başarıyla eklendi!");
    }
}
