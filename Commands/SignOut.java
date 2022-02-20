package MainPackages.Commands;

import static MainPackages.User.CurrentLoginUser;

public class SignOut extends Command{

    public SignOut() {
        keyword = "SIGNOUT";
    }


    @Override
    public void run(String[] args) {
        CurrentLoginUser = null;
        System.out.println("You have successfully signed out.");

    }

}
