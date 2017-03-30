package people;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jerieshasmith on 3/29/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
 private String username;
 private String address;
 private String email;
 private String password;
 private String phonenumber;
 private Value value;


public User(){

}

    public User(String username, String address, String email, String password, String phonenumber) {
        this.username = username;
        this.address = address;
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;


}

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", value=" + value +
                '}';
    }
}



