package MainPackages;

import java.util.ArrayList;
import java.util.Date;

import static MainPackages.User.CurrentLoginUser;

public class TextPost extends   Post{

    protected String text;
    protected Location location;


    public TextPost(Date date, String text, double x, double y ,String args) {
        super(date, taggedFriends);
        this.text = text;
        this.location = new Location(x,y);
        taggedFriends = checkTagged(args);
    }

    @Override
    public void printFormat() {
        System.out.println( text + '\n' +
                "date:" + date + '\n' +
                "friends tagged in this post:" + taggedFriends.toString() + '\n' +
                "location=" + location.getLongitude() + "," + location.getLatitude()+ '\n');


    }

    @Override
    public ArrayList<String> checkTagged(String args) {
        boolean check = true; // check if isn't friend turn false
        ArrayList<String> taggedFriend = new ArrayList<>();// tagged array list keep name who passed friend condition
        String[] a = args.split(":"); //separate tagged friends  use with:
        for (String tagged : a) {
            if (!CurrentLoginUser.getCollectionOfFriends().isEmpty()){ // if User have not any friends all tagged friend print untagged.
                for (User checkFriends : CurrentLoginUser.getCollectionOfFriends()) { //check current user friend list.
                    check = true;
                    if (checkFriends.getUsername().equals(tagged)) {
                        check = false; //if user tagged is current user's friend then add a transient array list.
                        taggedFriend.add(checkFriends.getUsername());
                    }
                }
                if (check){
                    System.out.println(tagged + " is not your friend, and will not be tagged!");
                }

            }else {
                for (String justforprint: a) {
                    System.out.println(justforprint + " is not your friend, and will not be tagged!");
                }
                break;
            }

        } return taggedFriend;

    }
}
