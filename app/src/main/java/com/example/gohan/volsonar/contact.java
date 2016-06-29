package com.example.gohan.volsonar;

/**
 * Created by Freeware Sys on 29-Jun-16.
 */
public class contact {
    private String Name;
    private String Email;

    public contact(String Name,String Email)
    {
        this.setName(Name);
        this.setEmail(Email);
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
