package MainPackages.Commands;
import MainPackages.User;
import static MainPackages.User.CurrentLoginUser;;
public class RemoveFriend extends Command {


    public RemoveFriend() {
        keyword = "REMOVEFRIEND";
    }

    @Override
    public void run(String[] args) {
        boolean check = true;

        if (CurrentLoginUser != null) {
                if(CurrentLoginUser.getCollectionOfFriends().isEmpty()){
                    check = false;
                    System.out.println("no such a friend");
                }
                    for (User friendList : CurrentLoginUser.getCollectionOfFriends()) {
                        if (friendList.getUsername().equals(args[1])) {
                            check =false;
                            CurrentLoginUser.removeFriend(friendList);
                            System.out.println(args[1] + " has been successfully removed from your friend list.");
                            break;
                        }
                    }if (check){
                        System.out.println("No such friend!");
            }

        } else {
            System.out.println("Error: Please sign in and try again.");
        }

    }
}
