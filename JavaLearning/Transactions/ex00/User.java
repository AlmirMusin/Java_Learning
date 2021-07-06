package ex00;

public class User {
    private int id;
    private static int lastId = 0;
    private String name;
    private int balance;

    public User(String name) {
        this.name = name;
        balance = 0;
        id = ++lastId;
    }

    public void changeBalance(int amount) {
        if (balance + amount < 0) {
            System.out.println("Error: insufficient funds");
        } else {
            this.balance += amount;
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
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
