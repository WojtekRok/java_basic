package staticClass;

public class User {
    // składowa statyczna - pole lub metoda związana z klasą a nie z objektem
    public static int globalId;
    private String login;
    private String password;

    public static void incrementGlobalId() {
        globalId++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;




    }
}
