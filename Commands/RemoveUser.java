package MainPackages.Commands;
import MainPackages.User;
import static MainPackages.User.UserList;
public class RemoveUser extends Command {
    public RemoveUser() {

        keyword = "REMOVEUSER";
    }

    @Override
    public void run(String[] args) {
        boolean check = true;
            for (User lListUser: UserList) {
                    if (lListUser.getPersonalID() == Integer.parseInt(args[1])){
                        check= false;
                        UserList.remove(lListUser);
                        System.out.println("User has been successfully removed.");
                        break;
                }
        }if (check){
            System.out.println("No such user!");
        }
    }
}
