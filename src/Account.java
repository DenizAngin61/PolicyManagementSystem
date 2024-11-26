import java.util.ArrayList;

public abstract class Account {
    private User user;
    private ArrayList<Insurance> insurances = new ArrayList<>();

    public Account(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
        System.out.println(insurance.getName() + " eklendi.");
    }

    public void listInsurances() {
        if (insurances.isEmpty()) {
            System.out.println("Sigortanız bulunmamaktadır.");
        } else {
            for (Insurance insurance : insurances) {
                System.out.println(insurance);
            }
        }
    }

    public abstract void showAccountType();
}
