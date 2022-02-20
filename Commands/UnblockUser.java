package MainPackages.Commands;
import MainPackages.User;
import static MainPackages.User.CurrentLoginUser;
public class UnblockUser extends Command{

    public UnblockUser() {
        keyword = "UNBLOCK";
    }

    @Override
    public void run(String[] args) {
        if (CurrentLoginUser != null){
            if (!CurrentLoginUser.getCollectionOfBlockedUsers().isEmpty()){
                for(User blockedUsers: CurrentLoginUser.getCollectionOfBlockedUsers()){
                    if(blockedUsers.getUsername().equals(args[1])){
                        CurrentLoginUser.removeBlockedUser(blockedUsers);
                        System.out.println("ahmet has been successfully unblocked.");
                        break;
                    }

                }

            }else{
                System.out.println("No such user in your blocked-user list!");
            }


        }else{
            System.out.println("Error: Please sign in and try again.");
        }

    }
}
