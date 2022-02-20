package MainPackages.Commands;
import MainPackages.User;

import static MainPackages.User.UserList;
public class ListUser extends Command {

    public ListUser(){ keyword = "LISTUSERS"; }

    @Override
    public void run(String[] args) {

            for (User lListUser: UserList) {
                System.out.println(lListUser.toString());
            }

    }
}
