package creational.builder.solution;

import lombok.Builder;
import lombok.ToString;

// Immutable class - so no setters
@ToString
@Builder
public class User {
    // mandatory
    private String firstname;
    private String lastname;

    // optional
    private int age;
    private double height;
    private double weight;

    User(String firstname, String lastname, int age, double height, double weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String firstname;
        private String lastname;
        private int age;
        private double height;
        private double weight;

        UserBuilder() {
        }

        public UserBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public UserBuilder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder height(double height) {
            this.height = height;
            return this;
        }

        public UserBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public User build() {
            return new User(firstname, lastname, age, height, weight);
        }

        public String toString() {
            return "User.UserBuilder(firstname=" + this.firstname + ", lastname=" + this.lastname + ", age=" + this.age + ", height=" + this.height + ", weight=" + this.weight + ")";
        }
    }
//    private long salary;
}
