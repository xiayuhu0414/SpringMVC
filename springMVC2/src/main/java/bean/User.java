package bean;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer ager;
    private String sex;
    private String email;

    public User(Integer id, String username, String password, Integer ager, String sex, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ager = ager;
        this.sex = sex;
        this.email = email;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAger() {
        return ager;
    }

    public void setAger(Integer ager) {
        this.ager = ager;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ager=" + ager +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
