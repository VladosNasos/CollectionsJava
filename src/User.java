import java.util.Objects;

public class User {
    private String name;
    private int old;
    private String phone;
    private static HashCodeStrategy hashCodeStrategy = new AllFieldsHashCodeStrategy();

    public User(String name, int old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

    public static void setHashCodeStrategy(HashCodeStrategy strategy) {
        hashCodeStrategy = strategy;
    }

    @Override
    public int hashCode() {
        return hashCodeStrategy.hashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return hashCodeStrategy.equals(this, obj);
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', old=" + old + ", phone='" + phone + "'}";
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public String getPhone() {
        return phone;
    }
}
