package ex00;

import java.util.UUID;

public class Transaction {

    private User recipient;
    private User sender;
    TransferCategory transferCategory;
    private int transferAmount;
    private String id;

    private void executeTransaction() {
        if (transferCategory == TransferCategory.CREDIT) {
            if (recipient.getBalance() - transferAmount >= 0) {
                recipient.changeBalance(-transferAmount);
                sender.changeBalance(transferAmount);
            }
        } else if (sender.getBalance() - transferAmount >= 0) {
            recipient.changeBalance(transferAmount);
            sender.changeBalance(-transferAmount);
        } else {
            System.out.println("Error: insufficient funds");
        }
    }

    public Transaction(User recipient, User sender, int transferAmount, TransferCategory transferCategory) {
        this.recipient = recipient;
        this.sender = sender;
        this.transferAmount = transferAmount;
        this.transferCategory = transferCategory;
        id = UUID.randomUUID().toString();
        if (transferAmount <= 0) {
            System.out.println("Error: negative amount");
        } else {
            executeTransaction();
        }
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "recipient=" + recipient.getName() +
                ", sender=" + sender.getName() +
                ", transferCategory=" + transferCategory +
                ", transferAmount=" + transferAmount +
                ", id='" + id + '\'' +
                '}';
    }

    enum TransferCategory{
        DEBIT,
        CREDIT
    }
}
