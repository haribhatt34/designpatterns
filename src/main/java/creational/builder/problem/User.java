package creational.builder.problem;

import lombok.ToString;

// Immutable class - so no setters
@ToString
public class User {
    // mandatory
    private String firstname;
    private String lastname;

    // optional
    private int age;
    private double height;
    private double weight;
//    private long salary;

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public User(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public User(String firstname, String lastname, double height) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.height = height;
    }

    // below constructor not allowed, as contructor(String, String, String) already present
/*    public User(String firstname, String lastname, double weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
    }*/

    public User(String firstname, String lastname, int age, double height, double weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

}

/*
    Issue with builder:
    1. when too many parameters, then error prone initialize an object using constructor.
    2. can't overload constructor as commented out above
    3. if we want a immutable object creation, lots of combinations of constructor needed,
        very difficult when the no of parameters increases.
        or else loose immutability and allow parameters to set through setters as well.
 */