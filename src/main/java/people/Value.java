package people;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jerieshasmith on 3/29/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
private Long id;
private String user;

public Value(){

}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", user='" + user + '\'' +
                '}';
    }
}
