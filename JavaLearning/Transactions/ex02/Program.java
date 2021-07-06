package ex02;

public class Program {
    public static void main(String[] args) {
        UserArrayList userList = new UserArrayList();
        User user1 = new User("name1");
        User user2 = new User("name2");
        User user3 = new User("name3");
        User user4 = new User("name4");
        User user5 = new User("name5");
        User user6 = new User("name6");
        User user7 = new User("name7");
        User user8 = new User("name8");
        User user9 = new User("name9");
        User user10 = new User("name10");
        User user11 = new User("name11");
        User user12 = new User("name12");

        System.out.println("size: " + userList.getUsersCount());
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        userList.addUser(user4);
        userList.addUser(user5);
        userList.addUser(user6);
        userList.addUser(user7);
        userList.addUser(user8);
        userList.addUser(user9);
        userList.addUser(user10);
        userList.addUser(user11);
        userList.addUser(user12);
        System.out.println("size: " + userList.getUsersCount());

        try {
            User special = userList.getUserById(12);
            System.out.println(special);
        } catch(UserNotFoundException e) {
            System.out.println(e);
        }

        try {
            User special = userList.getUserByIndex(11);
            System.out.println(special);
        } catch(UserNotFoundException e) {
            System.out.println(e);
        }
    }
}
