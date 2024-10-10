import java.util.Objects;

public class NameHashCodeStrategy implements HashCodeStrategy {
    @Override
    public int hashCode(User user) {
        return Objects.hash(user.getName());
    }

    @Override
    public boolean equals(User user1, Object obj) {
        if (user1 == obj) return true;
        if (obj == null || user1.getClass() != obj.getClass()) return false;
        User user2 = (User) obj;
        return Objects.equals(user1.getName(), user2.getName());
    }
}
