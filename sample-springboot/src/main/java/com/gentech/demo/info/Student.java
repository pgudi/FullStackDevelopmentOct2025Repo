package com.gentech.demo.info;

public class Student {

    private String firstName;
    private String email;
    private String location;

    public Student(){

    }

    public Student(String firstName, String email, String location) {
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
