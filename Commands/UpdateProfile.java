package MainPackages.Commands;

import java.util.Date;

import static MainPackages.User.*;

public class UpdateProfile extends Command{

    public UpdateProfile() {
        keyword = "UPDATEPROFILE";
    }

    @Override
    public void run(String[] args) {
        if (CurrentLoginUser != null){
            String i = "";
            String[] x = args[2].split("/");
            for (String dateformat: x) {
                i += dateformat;
            }
            Date arg = new Date(Integer.parseInt(i));
            CurrentLoginUser.setName(args[1]);
            CurrentLoginUser.setDateOfBirth(arg);
            CurrentLoginUser.setSchool(args[3]);
            System.out.println("Your user profile has been successfully updated");
        }else{
            System.out.println(" Please sign in and try again");
        }

    }
}
