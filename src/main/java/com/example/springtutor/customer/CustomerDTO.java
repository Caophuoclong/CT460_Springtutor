package com.example.springtutor.customer;

public class CustomerDTO {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerDTO(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String name;
    public String age;
    public String gender;
}
