package MainPackages.Commands;

import static MainPackages.User.CurrentLoginUser;

public class Chpass extends Command {

    public Chpass() {
        keyword = "CHPASS";
    }

    @Override
    public void run(String[] args) {
        if (CurrentLoginUser != null) {
            if (CurrentLoginUser.getPassword().equals(args[1])) {
                CurrentLoginUser.setPassword(args[2]);
            } else {
                System.out.println("Password mismatch !");
            }
        } else {
            System.out.println(" Please sign in and try again");
        }
    }
}
