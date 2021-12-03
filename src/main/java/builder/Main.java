package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().firstName("Taras").occupation("Teacher").build();
        System.out.println(user);
    }
}
