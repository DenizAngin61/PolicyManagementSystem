public class IndividualAccount extends Account {
    public IndividualAccount(User user) {
        super(user);
    }

    @Override
    public void showAccountType() {
        System.out.println("Hesap Türü: Bireysel");
    }
}

