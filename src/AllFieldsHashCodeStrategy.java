import java.util.Objects;

public class AllFieldsHashCodeStrategy implements HashCodeStrategy {
    @Override
    public int hashCode(User user) {
        return Objects.hash(user.getName(), user.getOld(), user.getPhone());
    }

    @Override
    public boolean equals(User user1, Object obj) {
        if (user1 == obj) return true;
        if (obj == null || user1.getClass() != obj.getClass()) return false;
        User user2 = (User) obj;
        return user1.getOld() == user2.getOld()
                && Objects.equals(user1.getName(), user2.getName())
                && Objects.equals(user1.getPhone(), user2.getPhone());
    }
}
