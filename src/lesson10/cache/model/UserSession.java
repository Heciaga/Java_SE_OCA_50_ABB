package lesson10.cache.model;

public class UserSession {
    private Long userId;

    public UserSession(Long userId) {
        this.userId = userId;
    }

    public String toString() {
        return "UserSession{userId=" + userId + "}";
    }
}
