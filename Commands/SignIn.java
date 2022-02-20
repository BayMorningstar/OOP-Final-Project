package MainPackages.Commands;

import MainPackages.User;

import static MainPackages.User.UserList;

public class SignIn extends Command {

    public SignIn() {
        keyword = "SIGNIN";
    }

    @Override
    public void run(String[] args) {
        for (User lListUser : UserList) {
            if (lListUser.getUsername().equals(args[1])) {
                if (lListUser.checkPassword(args[1], args[2])) {
                    break;
                }
            }
        }
    }
}
