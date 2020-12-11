package user;

import java.util.Date;

public class User {

    private Integer id;

    private String name;

    private Date birthDate;

    public User(Integer id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.birthDate = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return birthDate;
    }

    public void setDate(Date date) {
        this.birthDate = date;
    }
}
