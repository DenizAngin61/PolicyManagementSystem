import java.util.Date;

public class User {
    private String name;
    private String email;
    private String password;
    private String job;
    private Date lastLoginDate;

    public User(String name, String email, String password, String job, Date lastLoginDate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.job = job;
        this.lastLoginDate = lastLoginDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJob() {
        return job;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', job='" + job + "', lastLoginDate=" + lastLoginDate + "}";
    }
}
