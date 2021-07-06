package ex02;

public class UserIdsGenerator {
    private static UserIdsGenerator instance;
    private int prevId;

    private UserIdsGenerator() {
        this.prevId = 0;
    }

    public static UserIdsGenerator getInstance() {
        if (instance == null) {
            instance = new UserIdsGenerator();
        }
        return instance;
    }

    public int generateId() {
        return ++prevId;
    }
}
