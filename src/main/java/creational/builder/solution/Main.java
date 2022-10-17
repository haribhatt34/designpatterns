package creational.builder.solution;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstname("Hari")
                .lastname("Bhatt")
                .height(5.11)
                .build();
        System.out.println(user);
    }
}
