package CoreJava.day13basics;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Demo demo = new Demo();
        // demo.demo();

        // UserService userService = new UserService();
        // User user = userService.getUserById(9);
        // System.out.println(user.getName());

        // Use Optional to handle the case when user is not found
        UserService userService = new UserService();
        Optional<User> user = userService.getUserById(3);
        

        if(user.isPresent()) {
            System.out.println(user.get().getName()); // This will print the name of the user if it is present.
        }

        user.ifPresent(u -> System.out.println(u.getName())); // This will print the name of the user if it is present, otherwise it will do nothing.

    }
}
