
package com.entity;

//@Entity
//@Table(name = "accounts")
public class User {
    //@Id
    //@GeneratedValue
    private int id;
    //@Column(nullable = false, unique = true)
    private String login;
    //@Column(nullable = false)
    private String password;
    //@Column(nullable = false, unique = true)
    private String email;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
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
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

 
