package ex00;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Nadya");
        user1.setBalance(123);
        System.out.println(user1);
        user1.changeBalance(-100);
        System.out.println(user1);

        User user2 = new User("PashA");
        user2.setBalance(999);
        System.out.println(user2);
        user2.changeBalance(-1000);
        System.out.println(user2);

        System.out.println("\nTransaction: PashA -> Nadya -500");
        Transaction tr1 = new Transaction(user2, user1, 500, Transaction.TransferCategory.CREDIT);
        System.out.println(user1);
        System.out.println(user2);
    }
}
