package MainPackages.Commands;

import MainPackages.User;

import static MainPackages.User.CurrentLoginUser;
import static MainPackages.User.UserList;

public class AddFriend extends Command {
    public AddFriend() {
        keyword = "ADDFRIEND";
    }

    @Override
    public void run(String[] args) {
        boolean check = true; //checking already added friend list
        boolean checkUsernotExist = true;
        if (CurrentLoginUser != null) {
           for (User lListUser : UserList) {
                if (lListUser.getUsername().equals(args[1])) { //check uses exist or not
                    checkUsernotExist = false;
                    if (CurrentLoginUser.getCollectionOfFriends().isEmpty()){
                        CurrentLoginUser.addFriend(lListUser);
                        System.out.println(args[1] + " has been successfully added to your friend list.");
                        break;
                    }
                    for (User friendList : CurrentLoginUser.getCollectionOfFriends()) {
                        if (friendList.equals(lListUser)) {
                            System.out.println("This user is already in your friend list!");
                            check = false;
                            break ;
                        }
                    }
                    if(check) { // if user exist and not already added ,it add.
                        CurrentLoginUser.addFriend(lListUser);
                        System.out.println(args[1] + " has been successfully added to your friend list.");
                    }
                    break;

                }
            }if(checkUsernotExist){
                System.out.println("no such user");
            }

        }else {
            System.out.println("Error: Please sign in and try again.");
        }

    }
}
