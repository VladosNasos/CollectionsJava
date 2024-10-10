import java.util.*;

public class UserOperations {
    private Set<User> userSet;

    public void performOperations() {
        createUserSet();
        createAndAddUsers();
        printUsers("Users in userSet:");
        overrideHashCodeWithNameOnly();
        printUsers("Users after overriding hashCode and equals (name only):");
        overrideHashCodeWithAllFields();
        printUsers("Users after overriding hashCode and equals (all fields):");
    }

    private void createUserSet() {
        userSet = new HashSet<>();
    }

    private void createAndAddUsers() {
        User user1 = new User("Alice", 25, "111-111-1111");
        User user2 = new User("Alice", 25, "111-111-1111");
        User user3 = new User("Alice", 30, "111-111-1111"); // Different age
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
    }

    private void printUsers(String message) {
        System.out.println("\n" + message);
        for (User user : userSet) {
            System.out.println(user);
        }
    }

    private void overrideHashCodeWithNameOnly() {
        User.setHashCodeStrategy(new NameHashCodeStrategy());
        userSet.clear();
        createAndAddUsers();
    }

    private void overrideHashCodeWithAllFields() {
        User.setHashCodeStrategy(new AllFieldsHashCodeStrategy());
        userSet.clear();
        createAndAddUsers();
    }
}
