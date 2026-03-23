package CoreJava.day13basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserService {


    public Optional<User> getUserById(int id) {

        List<User> users = new ArrayList<>(Arrays.asList(new User(1, "John Doe"), new User(2, "Jane Doe"), new User(3, null), 
        new User(4, "Bob")));

        for (User user : users) {
                if (user.getId() == id) {
                    return Optional.of(user); // Return the user wrapped in an Optional if found
                }
            }   
            
        return Optional.empty(); // Return an empty Optional if user is not found
    }
}
