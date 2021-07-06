package ex01;

public class UserIdsGenerator {
    private int prevId;

    private static UserIdsGenerator instance;

    private UserIdsGenerator() {this.prevId = 0;}

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
