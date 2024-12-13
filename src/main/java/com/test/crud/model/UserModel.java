package com.test.crud.model;

public class UserModel {
    private int id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String debName;
    private String emailAddress;
    private double salary;

    public UserModel(
            int id,
            String firstName,
            String secondName,
            String lastNmae,
            String debName,
            String emailAddress,
            double salary) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastNmae;
        this.debName = debName;
        this.emailAddress = emailAddress;
        this.salary = salary;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDebName() {
        return this.debName;
    }

    public void setDebName(String debName) {
        this.debName = debName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
