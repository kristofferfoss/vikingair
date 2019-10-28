package servlets.logio;

import java.io.Serializable;

public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username;
    private String user_password;

    public Login(String username, String user_password) {
        this.username = username;
        this.user_password = user_password;
    }

    public Login() {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}