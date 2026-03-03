package com.gentech.demo.details;

public class Student1 {

    private String firstName;
    private String email;
    private String location;

    public Student1(){

    }

    public Student1(String firstName, String email, String location) {
        this.firstName = firstName;
        this.email = email;
        this.location = location;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
