package Lecture11;

public class OOPs {
    private String username;
    private String password;

    public void setDefaultUsername() {
        setDefaultUsername("default-user");
    }

    private void setDefaultUsername(String username) {
        this.username = username;
    }

    public String getUsername(boolean key) {
        if (key)
            return username;
        else
            return "Nice Try";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean pass) {
        if (pass)
            return password;
        else
            return "Wrong Password";
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
