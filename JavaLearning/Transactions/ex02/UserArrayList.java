package ex02;

public class UserArrayList implements UserList{
    private User [] usersList;
    private int size;
    private int capacity;

    private boolean isNotInArray(int id) {
        for (int i = 0; i < size; i++) {
            if (usersList[i].getId() == id) {
                return false;
            }
        }
        return true;
    }

    public UserArrayList() {
        size = 0;
        capacity = 10;
        usersList = new User[capacity];
    }

    @Override
    public void addUser(User newUser) {
        if (newUser != null && isNotInArray(newUser.getId())) {
            if (size == capacity) {
                capacity *= 2;
                User [] newArr = new User[capacity];
                for (int i = 0; i < size; i++) {
                    newArr[i] = usersList[i];
                }
                usersList = newArr;
            }
            usersList[size] = newUser;
            size++;
        }
    }

    @Override
    public User getUserById(int id) throws UserNotFoundException {
        for (int i = 0; i < size; i++) {
            if (usersList[i].getId() == id) {
                return usersList[i];
            }
        }
        throw new UserNotFoundException();
    }

    @Override
    public User getUserByIndex(int index) throws UserNotFoundException {
        if (index >= 0 && index < size) {
            return usersList[index];
        }
        throw new UserNotFoundException();
    }

    @Override
    public int getUsersCount() {
        return size;
    }
}
