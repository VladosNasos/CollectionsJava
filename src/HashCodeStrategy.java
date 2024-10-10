public interface HashCodeStrategy {
    int hashCode(User user);
    boolean equals(User user1, Object obj);
}
