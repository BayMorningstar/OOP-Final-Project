package MainPackages.Commands;
import MainPackages.User;
import static MainPackages.User.CurrentLoginUser;
public class ListFriend extends Command {


    public ListFriend() {
        keyword = "LISTFRIENDS";
    }

    @Override
    public void run(String[] args) {

        if (CurrentLoginUser != null) {
            if (!CurrentLoginUser.getCollectionOfFriends().isEmpty()){
                for (User friendList : CurrentLoginUser.getCollectionOfFriends()) {
                    System.out.println(friendList.toString());
                }
            }else {
                System.out.println("You have not added any friend yet!");
            }

        } else {
            System.out.println("Error: Please sign in and try again.");

        }
    }
}
