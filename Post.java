package MainPackages;

import java.util.ArrayList;
import java.util.Date;

public abstract class Post {

    protected Date date ;
    protected static ArrayList<String> taggedFriends;

    public Post(Date date, ArrayList taggedFriends) {
        this.date = date;
        this.taggedFriends = new ArrayList<>();
    }

    public abstract void printFormat();
    public abstract ArrayList<String> checkTagged(String args);
}


