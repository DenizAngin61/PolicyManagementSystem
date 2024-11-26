public class CorporateAccount extends Account {
    public CorporateAccount(User user) {
        super(user);
    }

    @Override
    public void showAccountType() {
        System.out.println("Hesap Türü: Kurumsal");
    }
}
