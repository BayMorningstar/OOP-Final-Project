package MainPackages;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    public static User CurrentLoginUser; //When a user log in this object contain current user object and use it's method as necessary.
    public static List<User> UserList = new ArrayList<>(); //Users List for all User
    static int userID = 1 ; //unique ID for user.
    final int personalID; //set and keep unique id from UserID.
    private String name;
    final String username;
    private String password;
    private Date dateOfBirth;
    private String School;
    private Date lastLog ;
    final ArrayList<User> collectionOfFriends;
    final ArrayList<User>  collectionOfBlockedUsers;
    private final ArrayList<Post>  collectionOfPosts;



    public User(String name, String username, String password, Date dateOfBirth, String school) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.School = school;
        this.collectionOfFriends = new ArrayList<>();
        this.collectionOfBlockedUsers = new ArrayList<>();
        this.collectionOfPosts = new ArrayList<>();
        this.personalID = userID;
        userID ++;

    }

    public ArrayList<User> getCollectionOfFriends() {
        return collectionOfFriends;
    } //getter

    public ArrayList<User> getCollectionOfBlockedUsers() {
        return collectionOfBlockedUsers;
    }//getter

    @Override
    public String toString() {
        return  " name:" + name + '\n' +
                " username:" + username + '\n' +
                " date Of Birth:" + dateOfBirth + '\n' +
                " School:" + School + '\n' ;
    }

    public boolean checkPassword( String username ,String password) { // compares username and password
        if(this.password.equals(password) && this.username.equals(username)){
            System.out.println("You have successfully signed in");
            this.lastLog = new Date();
            CurrentLoginUser = this;
            return true;
        }else{
            System.out.println("Invalid username or password! Please try again.");
            return false;
        }
    }
    public int getPersonalID() {
        return personalID;
    }//getter

    public void setPassword(String password) {
        this.password = password;
    }//setter

    public void setName(String name) {
        this.name = name;
    }//setter

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }//setter

    public String getUsername() {
        return username;
    }//getter

    public String getPassword() {
        return password;
    }//getter

    public void setSchool(String school) {
        School = school;
    }//setter


    public void addBlockList(User user) {
        collectionOfBlockedUsers.add(user);
    } //Here we add User object to arraylist and keep it.

    public void removeBlockedUser(User o) {
        collectionOfBlockedUsers.remove(o);
    }//Here we remove User object to arraylist and keep it.

    public void addFriend(User user) {
        collectionOfFriends.add(user);
    } //Here we add User object to arraylist and keep it.

    public void removeFriend(User o) {
        collectionOfFriends.remove(o);
    }//Here we remove User object to arraylist and keep it.

    public void addPost(TextPost post) {
        collectionOfPosts.add(post);
    }//Here we add User object to arraylist and keep it.

    public ArrayList<Post> getCollectionOfPosts() {
        return collectionOfPosts;
    }//getter

    public void removePost(int o) {
        collectionOfPosts.remove(o);
    } //Here we remove User object to arraylist and keep it.

}
