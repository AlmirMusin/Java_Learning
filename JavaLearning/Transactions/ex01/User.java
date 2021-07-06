package ex01;

public class User {
    private final int id;
    private String name;
    private int balance;

    public User(String name) {
        this.name = name;
        balance = 0;
        this.id = UserIdsGenerator.getInstance().generateId();
    }

    public void changeBalance(int amount) {
        if (balance + amount < 0) {
            System.out.println("Error: insufficient funds");
        } else {
            this.balance += amount;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

